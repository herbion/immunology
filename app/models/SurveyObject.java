package models;

import java.util.List;

import javax.persistence.*;
import play.db.jpa.*;
import play.data.validation.Required;

@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
public class SurveyObject extends Model {
	@Required
	public String title;

    @ManyToMany
	public List<ComplaintType> complaintTypes;
	
	@ManyToMany
	public List<Analysis> analyzes;

    @ManyToMany
	public List<ClinicalManifestationComplaint> clinicalManifestationComplaints;

	@ManyToMany
	public List<Anamnesis> anamnezes;

	@ManyToMany
	public List<AnamnesisDisease> anamnesisDiseases;

	@ManyToMany
	public List<TreatmentType> treatmentTypes;

	@Override
	public String toString() {
		return title;
	}

}
