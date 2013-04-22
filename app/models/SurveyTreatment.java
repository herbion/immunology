package models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import play.db.jpa.GenericModel;

import com.immunology.enums.TherapyType;

@Entity
@Table(name = "survey_treatment")
@SequenceGenerator(name = "survey_treatment_sequence", sequenceName = "survey_treatment_sequence", allocationSize = 1)
public class SurveyTreatment extends GenericModel {

	@Id
	@Column(name = "survey_treatment_id")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "survey_treatment_sequence")
	public Long surveyTreatmentId;

	@ManyToOne
	public Survey survey;

	@Column(name = "description")
	public String treatmentDescription;

	@Column(name = "dose")
	public String dose;

	@Column(name = "multiplicity")
	public String multiplicity;

	@Enumerated(EnumType.ORDINAL)
	@Column(name = "therapy_type")
	public TherapyType therapyType;

	@OneToOne
	public MedicationDetail medicationDetail;

	@OneToOne
	public Insertion insertion;

	@OneToOne
	public Allergen allergen;

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result
				+ ((allergen == null) ? 0 : allergen.hashCode());
		result = prime * result + ((dose == null) ? 0 : dose.hashCode());
		result = prime * result
				+ ((insertion == null) ? 0 : insertion.hashCode());
		result = prime
				* result
				+ ((medicationDetail == null) ? 0 : medicationDetail.hashCode());
		result = prime * result
				+ ((multiplicity == null) ? 0 : multiplicity.hashCode());
		result = prime * result + ((survey == null) ? 0 : survey.hashCode());
		result = prime
				* result
				+ ((surveyTreatmentId == null) ? 0 : surveyTreatmentId
						.hashCode());
		result = prime * result
				+ ((therapyType == null) ? 0 : therapyType.hashCode());
		result = prime
				* result
				+ ((treatmentDescription == null) ? 0 : treatmentDescription
						.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		SurveyTreatment other = (SurveyTreatment) obj;
		if (allergen == null) {
			if (other.allergen != null)
				return false;
		} else if (!allergen.equals(other.allergen))
			return false;
		if (dose == null) {
			if (other.dose != null)
				return false;
		} else if (!dose.equals(other.dose))
			return false;
		if (insertion == null) {
			if (other.insertion != null)
				return false;
		} else if (!insertion.equals(other.insertion))
			return false;
		if (medicationDetail == null) {
			if (other.medicationDetail != null)
				return false;
		} else if (!medicationDetail.equals(other.medicationDetail))
			return false;
		if (multiplicity == null) {
			if (other.multiplicity != null)
				return false;
		} else if (!multiplicity.equals(other.multiplicity))
			return false;
		if (survey == null) {
			if (other.survey != null)
				return false;
		} else if (!survey.equals(other.survey))
			return false;
		if (surveyTreatmentId == null) {
			if (other.surveyTreatmentId != null)
				return false;
		} else if (!surveyTreatmentId.equals(other.surveyTreatmentId))
			return false;
		if (therapyType != other.therapyType)
			return false;
		if (treatmentDescription == null) {
			if (other.treatmentDescription != null)
				return false;
		} else if (!treatmentDescription.equals(other.treatmentDescription))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Survey Treatment ID: " + surveyTreatmentId;
	}

}
