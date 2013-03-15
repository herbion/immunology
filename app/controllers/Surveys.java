package controllers;

import java.util.List;

import models.MedicineCard;
import models.Survey;
import play.mvc.Before;
import play.mvc.With;

@With(Secure.class)
public class Surveys extends CRUD {

	@Before
	public static void isAdmin() {
		Security.isAdmin();
	}
	
    public static List<Survey> getSurveysListByMedicineCardId(MedicineCard object) {
        List survey = Survey.find("byMedicineCard", object).fetch();
        return survey;
    }
}
