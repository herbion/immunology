package controllers.admin;

import java.util.Date;

import models.MedicineCard;
import models.Patient;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import play.exceptions.TemplateNotFoundException;
import play.i18n.Messages;
import play.mvc.With;
import controllers.CRUD;
import controllers.Secure;
import controllers.Check;

@With(Secure.class)
@Check("admin")
public class Patients extends CRUD {

	private static Logger logger = LoggerFactory.getLogger(Patients.class);

	public static void savePatientWithCard(Patient object) {
		logger.info("savePatientWithCard(" + object.toString() + ")");
		MedicineCard card = new MedicineCard();
		card.creationDate = new Date();
		card.save();
		object.medicineCard = card;

		validation.valid(object);
		if (validation.hasErrors()) {
			renderArgs.put("error", Messages.get("crud.hasErrors"));
			try {
				render(request.controller.replace(".", "/") + "/blank.html",
						Patient.class, object);
			} catch (TemplateNotFoundException e) {
				render("CRUD/show.html", Patient.class, object);
			}
		}
		object.save();

		flash.success(Messages.get("crud.saved", "Patient"));
		if (params.get("_save") != null) {
			redirect(request.controller + ".list");
		}
		redirect(request.controller + ".blank", object._key());
	}

}
