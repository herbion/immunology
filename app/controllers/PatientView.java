package controllers;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import models.*;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import play.exceptions.TemplateNotFoundException;
import play.i18n.Messages;
import play.mvc.Controller;
import play.mvc.With;
import controllers.admin.Patients;

@With(Secure.class)
@Check("user")
public class PatientView extends Controller {
	private static Logger logger = LoggerFactory.getLogger(PatientView.class);
	private static User user;

	private static final String USERS = "USERS";
	private static final String ALL = "ALL";

	public static void patients() {
		user = User.find("byLogin", Security.connected()).first();
		logger.info("patients(" + user.userId + ")");
		List<Patients> userPatients = Patient.getPatientsByUserId(user.userId);

		Map<String, Object> model = new HashMap<String, Object>();
		model.put("user", user);
		model.put("userPatients", userPatients);
		model.put("type", USERS);
		renderTemplate(model);
	}

	public static void updatePatientsTable(String type) {
		logger.info("updatePatientsTable(" + type + ")");
		user = User.find("byLogin", Security.connected()).first();
		List<Patients> userPatients = new ArrayList<Patients>();
		Map<String, Object> model = new HashMap<String, Object>();
		model.put("user", user);
		if (ALL.equals(type)) {
			userPatients = Patient.all().fetch();
			model.put("type", ALL);
		} else {
			userPatients = Patient.getPatientsByUserId(user.userId);
			model.put("type", USERS);
		}
		model.put("userPatients", userPatients);
		renderTemplate("PatientView/patients.html", model);
	}

	public static void analytics() {
		user = User.find("byLogin", Security.connected()).first();
		Map<String, Object> model = new HashMap<String, Object>();
		model.put("user", user);

		List<Survey> surveys = Survey.all().fetch();
		Map<MedicationDetail, Map<Question, Map<Choice, Integer>>> stats 
			= new HashMap<MedicationDetail, Map<Question, Map<Choice, Integer>>>(); 
		for (Survey survey : surveys) {
			for (SurveyTreatment treament : survey.surveyTreatments ) {
				if (stats.containsKey(treament.medicationDetail)) {
					updateStats(stats.get(treament.medicationDetail), survey.surveyEvaluations);
				} else {
					stats.put(treament.medicationDetail, new HashMap<Question, Map<Choice, Integer>>());
				}
			}
		}
		model.put("questions", Question.all().fetch());
		model.put("analytics", stats);
		renderTemplate("PatientView/analytics.html", model);
	}

	private static void updateStats(Map<Question, Map<Choice, Integer>> stats, 
		List<SurveyEvaluation> evaluations) {
		logger.info("update stats invoked.");
		for (SurveyEvaluation evaluation : evaluations) {
			if (stats.containsKey(evaluation.question)) {
				logger.info("Found one, updating with +1 ");
				Map<Choice, Integer> choices = stats.get(evaluation.question);
				choices.put(evaluation.choice, choices.get(evaluation.choice) + 1);
			} else {
				Map<Choice, Integer> choices = new HashMap<Choice, Integer>();
				for (Choice choice : evaluation.question.choices ) {
					choices.put(choice, choice.value.equals(evaluation.choice.value) ? 1: 0);
				}
				stats.put(evaluation.question, choices);
			}
		}
	}

	public static void show(Long id) {
		logger.info("show(" + id + ")");
		Patient patient = Patient.findById(id);
		user = User.find("byLogin", Security.connected()).first();
		Map<AnamnesisDetailValue, String> contentMap = new HashMap<AnamnesisDetailValue, String>();
		List<MedicineCardAnamnesis> medicineCardAnamneses = patient.medicineCard.medicineCardAnamneses;
		for (MedicineCardAnamnesis medicineCardAnamnesis : medicineCardAnamneses) {
			if (medicineCardAnamnesis.isChecked) {
				contentMap.put(medicineCardAnamnesis.anamnesisDetailValue,
						medicineCardAnamnesis.description);
			}
		}

		Map<AnamnesisDiseaseDetail, String> diseaseContentMap = new HashMap<AnamnesisDiseaseDetail, String>();
		List<MedicineCardAnamnesisDisease> medicineCardAnamnesisDiseases = patient.medicineCard.medicineCardAnamnesisDiseases;
		for (MedicineCardAnamnesisDisease medicineCardAnamnesisDisease : medicineCardAnamnesisDiseases) {
			if (medicineCardAnamnesisDisease.isChecked) {
				diseaseContentMap.put(
						medicineCardAnamnesisDisease.anamnesisDiseaseDetail,
						medicineCardAnamnesisDisease.description);
			}
		}

		Map<String, Object> model = new HashMap<String, Object>();
		model.put("user", user);
		model.put("patient", patient);
		model.put("contentMap", contentMap);
		model.put("diseaseContentMap", diseaseContentMap);
		
		renderTemplate(model);
	}

	public static void delete(Long patientId) {
		logger.info("delete(" + patientId + ")");
		Patient patient = Patient.findById(patientId);
		try {
			Patient.em().remove(patient);
		} catch (Exception e) {
			flash.error("Patien deleting error", "args");
			patients();
		}
		flash.success(Messages.get("patient.deleted"));
		patients();
	}

	public static void savePatientWithCard(Patient patient) {
		logger.info("savePatientWithCard(" + patient.toString() + ")");

		validation.valid(patient);
		if (validation.hasErrors()) {
			renderArgs.put("error", Messages.get("crud.hasErrors"));
			Map<String, Object> model = new HashMap<String, Object>();
			model.put("patient", patient);
			model.put("user", User.find("byLogin", Security.connected())
					.first());
			try {
				renderTemplate(model);
			} catch (TemplateNotFoundException e) {
				renderTemplate("PatientView/add.html", model);
			}
		}

		MedicineCard card = new MedicineCard();
		card.creationDate = new Date();
		card.save();
		patient.medicineCard = card;
		patient.save();

		flash.success(Messages.get("patient.saved"));
		if (params.get("_save") != null) {
			show(patient.patientId);
		}
		redirect("PatientView.add", patient._key());
	}

	public static void add() {
		logger.info("adding new user");
		user = User.find("byLogin", Security.connected()).first();
		Patient patient = new Patient();

		Map<String, Object> model = new HashMap<String, Object>();
		model.put("user", user);
		model.put("patient", patient);

		renderTemplate(model);
	}

	public static void updatePatient(Patient patient) {
		logger.info("savePatientWithCard(" + patient.toString() + ")");

		Map<String, Object> model = new HashMap<String, Object>();
		model.put("patient", patient);
		model.put("user", User.find("byLogin", Security.connected()).first());

		validation.valid(patient);
		if (validation.hasErrors()) {
			renderArgs.put("error", Messages.get("crud.hasErrors"));
			try {
				renderTemplate(model);
			} catch (TemplateNotFoundException e) {
				renderTemplate("PatientView/show.html", model);
			}
		}

		patient.save();
		flash.success(Messages.get("patient.saved"));
		if (params.get("_save") != null) {
			show(patient.patientId);
		}
		redirect("PatientView.show", patient._key());
	}
}
