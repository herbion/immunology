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
@Table(name = "treatmentType")
@SequenceGenerator(name = "treatment_type_sequence", sequenceName = "treatment_type_sequence", allocationSize = 1)
public class TreatmentType extends GenericModel {

	@Id
	@Column(name = "treatment_type_id")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "treatment_type_sequence")
	public Long treatmentTypeId;

	@Required
	@Column(name = "name")
	public String treatmentTypeName;

	@Required
	@Column(name = "has_therapy_type")
	public Boolean hasTherapyType;

	@ManyToOne
	public Syndrome syndrome;

	@OneToMany(cascade = CascadeType.ALL, mappedBy = "treatmentType")
	public List<Medication> medications;

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result
				+ ((medications == null) ? 0 : medications.hashCode());
		result = prime * result
				+ ((syndrome == null) ? 0 : syndrome.hashCode());
		result = prime * result
				+ ((treatmentTypeId == null) ? 0 : treatmentTypeId.hashCode());
		result = prime
				* result
				+ ((treatmentTypeName == null) ? 0 : treatmentTypeName
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
		TreatmentType other = (TreatmentType) obj;
		if (medications == null) {
			if (other.medications != null)
				return false;
		} else if (!medications.equals(other.medications))
			return false;
		if (syndrome == null) {
			if (other.syndrome != null)
				return false;
		} else if (!syndrome.equals(other.syndrome))
			return false;
		if (treatmentTypeId == null) {
			if (other.treatmentTypeId != null)
				return false;
		} else if (!treatmentTypeId.equals(other.treatmentTypeId))
			return false;
		if (treatmentTypeName == null) {
			if (other.treatmentTypeName != null)
				return false;
		} else if (!treatmentTypeName.equals(other.treatmentTypeName))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return treatmentTypeName;
	}
}
