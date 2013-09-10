package controllers.admin;

import java.util.List;

import models.MedicineCard;
import models.Survey;
import play.mvc.With;
import controllers.CRUD;
import controllers.Secure;
import controllers.Check;

@With(Secure.class)
@Check("admin")
public class Surveys extends CRUD {
	public static List<Survey> getSurveysListByMedicineCardId(
			MedicineCard object) {
		List survey = Survey.find("byMedicineCard", object).fetch();
		return survey;
	}
}
