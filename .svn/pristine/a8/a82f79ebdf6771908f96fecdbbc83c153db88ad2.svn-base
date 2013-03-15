package controllers;

import java.text.SimpleDateFormat;
import java.util.List;

import models.Patient;
import models.Survey;
import play.mvc.With;

@With(Secure.class)
public class ChartController extends CRUD {

    private static final String DATE_FORMAT = "MM-dd-yy";

    public static void getDifficultyDegreeData() {
	Long patientId = new Long(request.params.get("body"));
	Patient patient = Patient.findById(patientId);
	List<Survey> surveys = patient.medicineCard.surveys;

	SimpleDateFormat simpleDateFormat = new SimpleDateFormat(DATE_FORMAT);
	StringBuilder chartData = new StringBuilder();
	for (Survey survey : surveys) {
	    chartData.append(simpleDateFormat.format(survey.surveyDate));
	    chartData.append(",");
	    chartData.append(survey.alergeticDifficultyDegree);
	    chartData.append(";");
	}
	chartData.replace(chartData.length() - 1, chartData.length(), "");
	renderText(chartData.toString());
    }

    public static void getInsufficiencyDegreeData() {
	Long patientId = new Long(request.params.get("body"));
	Patient patient = Patient.findById(patientId);
	List<Survey> surveys = patient.medicineCard.surveys;

	SimpleDateFormat simpleDateFormat = new SimpleDateFormat(DATE_FORMAT);
	StringBuilder chartData = new StringBuilder();
	for (Survey survey : surveys) {
	    chartData.append(simpleDateFormat.format(survey.surveyDate));
	    chartData.append(",");
	    chartData.append(survey.alergeticInsufficiencyDegree);
	    chartData.append(";");
	}
	chartData.replace(chartData.length() - 1, chartData.length(), "");
	renderText(chartData.toString());
    }
}
