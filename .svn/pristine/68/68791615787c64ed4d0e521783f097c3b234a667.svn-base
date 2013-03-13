package controllers;

import java.util.List;

import models.MedicineCard;
import models.Patient;
import play.mvc.Before;
import play.mvc.With;

@With(Secure.class)
public class MedicineCards extends CRUD {

	@Before
	public static void isAdmin() {
		Security.isAdmin();
	}
	
    public static Long getPatientIdByCardId(Long medicineCardId) {
        MedicineCard medicineCard = MedicineCard.find("byMedicineCardId", medicineCardId).first();
        Patient patient = Patient.find("byMedicineCard", medicineCard).first();
        return patient.patientId;
    }
    
    public static void list() {
        List<Patient> patients = Patient.all().fetch();
        render(patients);
    }
    
}
