package models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import play.data.validation.Required;
import play.db.jpa.GenericModel;

@Entity
@Table(name = "allergen")
@SequenceGenerator(name = "allergen_sequence", sequenceName = "allergen_sequence", allocationSize = 1)
public class Allergen extends GenericModel {

	@Id
	@Column(name = "allergen_id")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "allergen_sequence")
	public Long allergenId;

	@Required
	@Column(name = "name")
	public String allergenName;

	@ManyToOne
	public MedicationDetail medicationDetail;

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result
				+ ((allergenId == null) ? 0 : allergenId.hashCode());
		result = prime * result
				+ ((allergenName == null) ? 0 : allergenName.hashCode());
		result = prime
				* result
				+ ((medicationDetail == null) ? 0 : medicationDetail.hashCode());
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
		Allergen other = (Allergen) obj;
		if (allergenId == null) {
			if (other.allergenId != null)
				return false;
		} else if (!allergenId.equals(other.allergenId))
			return false;
		if (allergenName == null) {
			if (other.allergenName != null)
				return false;
		} else if (!allergenName.equals(other.allergenName))
			return false;
		if (medicationDetail == null) {
			if (other.medicationDetail != null)
				return false;
		} else if (!medicationDetail.equals(other.medicationDetail))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return allergenName;
	}

}
