package controllers;

import java.util.ArrayList;
import java.util.List;

import models.Anamnesis;
import models.AnamnesisDetailValue;
import models.AnamnesisDiseaseDetail;
import models.MedicineCard;
import models.MedicineCardAnamnesis;
import models.MedicineCardAnamnesisDisease;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import play.mvc.Before;
import play.mvc.Controller;
import play.mvc.With;
import wrappers.AnamnesisDeseaseWrapper;
import wrappers.AnamnesisWrapper;
import wrappers.SurveyWrapper;

import com.google.gson.Gson;

@With(Secure.class)
public class MedicineCardView extends Controller {
    private static Logger logger = LoggerFactory.getLogger(MedicineCardView.class);

    @Before
    public static void isUser() {
	Security.isUser();
    }

    public static void saveMedicineCard() {
	logger.info("saving medicine card");

	String jsonString = request.params.get("body");
	SurveyWrapper surveyWrapper = new Gson().fromJson(jsonString, SurveyWrapper.class);

	Long medicineCardId = surveyWrapper.medicineCardId;
	String medicineCardInfo = surveyWrapper.medicineCardInfo;
	List<AnamnesisWrapper> anamnesisWrappers = surveyWrapper.anamneses;
	List<AnamnesisDeseaseWrapper> anamnesisDeseaseWrappers = surveyWrapper.anamnesisDeseases;

	MedicineCard medicineCard = MedicineCard.findById(medicineCardId);

	AnamnesisDetailValue anamnesisDetailValue = null;
	MedicineCardAnamnesis medicineCardAnamnesis = null;
	List<MedicineCardAnamnesis> medicineCardAnamneses = new ArrayList<MedicineCardAnamnesis>();
	for (AnamnesisWrapper anamnesisWrapper : anamnesisWrappers) {
	    anamnesisDetailValue = AnamnesisDetailValue.findById(anamnesisWrapper.id);
	    medicineCardAnamnesis = new MedicineCardAnamnesis();
	    // TODO Fill other fields
	    medicineCardAnamnesis.medicineCard = medicineCard;
	    medicineCardAnamnesis.anamnesisDetailValue = anamnesisDetailValue;
	    medicineCardAnamnesis.description = anamnesisWrapper.description;
	    medicineCardAnamnesis.isChecked = anamnesisWrapper.isChecked;
	    medicineCardAnamnesis.value = anamnesisDetailValue.anamnesisDetailValueValue;

	    medicineCardAnamneses.add(medicineCardAnamnesis);
	}

	// TODO change functionality
	for (MedicineCardAnamnesis medicineCardAnamnesis2 : medicineCard.medicineCardAnamneses) {
	    medicineCardAnamnesis2.delete();
	}
	medicineCard.medicineCardAnamneses.clear();
	medicineCard.medicineCardAnamneses = medicineCardAnamneses;
	medicineCard.save();

	AnamnesisDiseaseDetail anamnesisDiseaseDetail = null;
	List<MedicineCardAnamnesisDisease> medicineCardAnamnesisDiseases = new ArrayList<MedicineCardAnamnesisDisease>();
	for (AnamnesisDeseaseWrapper anamnesisDeseaseWrapper : anamnesisDeseaseWrappers) {
	    anamnesisDiseaseDetail = AnamnesisDiseaseDetail.findById(anamnesisDeseaseWrapper.id);
	    MedicineCardAnamnesisDisease medicineCardAnamnesisDisease = new MedicineCardAnamnesisDisease();
	    // TODO Fill other fields
	    medicineCardAnamnesisDisease.medicineCard = medicineCard;
	    medicineCardAnamnesisDisease.anamnesisDiseaseDetail = anamnesisDiseaseDetail;
	    medicineCardAnamnesisDisease.description = anamnesisDeseaseWrapper.description;
	    medicineCardAnamnesisDisease.isChecked = anamnesisDeseaseWrapper.isChecked;
	    medicineCardAnamnesisDisease.value = anamnesisDiseaseDetail.anamnesisDiseaseDetailValue;

	    medicineCardAnamnesisDiseases.add(medicineCardAnamnesisDisease);
	}

	// TODO change functionality
	for (MedicineCardAnamnesisDisease medicineCardAnamnesisDisease2 : medicineCard.medicineCardAnamnesisDiseases) {
	    medicineCardAnamnesisDisease2.delete();
	}
	medicineCard.medicineCardAnamnesisDiseases.clear();
	medicineCard.medicineCardAnamnesisDiseases = medicineCardAnamnesisDiseases;

	medicineCard.otherInfo = medicineCardInfo;
	medicineCard.save();
    }
}
