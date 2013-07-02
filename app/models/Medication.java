package models;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import play.data.validation.Required;
import play.db.jpa.GenericModel;

@Entity
@Table(name = "medication")
@SequenceGenerator(name = "medication_sequence", sequenceName = "medication_sequence", allocationSize = 1)
public class Medication extends GenericModel {

	@Id
	@Column(name = "medication_id")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "medication_sequence")
	public Long medicationId;

	@Required
	@Column(name = "name")
	public String medicationName;

	@ManyToOne
	public TreatmentType treatmentType;

	@OneToMany(cascade = CascadeType.ALL, mappedBy = "medication")
	public List<MedicationDetail> medicationDetails;

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime
				* result
				+ ((medicationDetails == null) ? 0 : medicationDetails
						.hashCode());
		result = prime * result
				+ ((medicationId == null) ? 0 : medicationId.hashCode());
		result = prime * result
				+ ((medicationName == null) ? 0 : medicationName.hashCode());
		result = prime * result
				+ ((treatmentType == null) ? 0 : treatmentType.hashCode());
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
		Medication other = (Medication) obj;
		if (medicationDetails == null) {
			if (other.medicationDetails != null)
				return false;
		} else if (!medicationDetails.equals(other.medicationDetails))
			return false;
		if (medicationId == null) {
			if (other.medicationId != null)
				return false;
		} else if (!medicationId.equals(other.medicationId))
			return false;
		if (medicationName == null) {
			if (other.medicationName != null)
				return false;
		} else if (!medicationName.equals(other.medicationName))
			return false;
		if (treatmentType == null) {
			if (other.treatmentType != null)
				return false;
		} else if (!treatmentType.equals(other.treatmentType))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return medicationName;
	}

}
