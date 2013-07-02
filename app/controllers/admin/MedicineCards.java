package controllers.admin;

import java.util.List;

import models.MedicineCard;
import models.Patient;
import play.mvc.With;
import controllers.CRUD;
import controllers.Secure;
import controllers.Check;

@With(Secure.class)
@Check("admin")
public class MedicineCards extends CRUD {
	public static Long getPatientIdByCardId(Long medicineCardId) {
		MedicineCard medicineCard = MedicineCard.find("byMedicineCardId",
				medicineCardId).first();
		Patient patient = Patient.find("byMedicineCard", medicineCard).first();
		return patient.patientId;
	}

	public static void list() {
		List<Patient> patients = Patient.all().fetch();
		render(patients);
	}

}
