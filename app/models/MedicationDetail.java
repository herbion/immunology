package models;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import play.data.validation.Required;
import play.db.jpa.GenericModel;

@Entity
@Table(name = "medication_detail")
@SequenceGenerator(name = "medication_detail_sequence", sequenceName = "medication_detail_sequence", allocationSize = 1)
public class MedicationDetail extends GenericModel {

	@Id
	@Column(name = "medication_detail_id")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "medication_detail_sequence")
	public Long medicationDetailId;

	@Required
	@Column(name = "name")
	public String medicationDetailName;

	@ManyToOne
	public Medication medication;

	@ManyToMany
	@JoinTable(name = "medicationDetail_insertion", joinColumns = @JoinColumn(name = "medication_detail_id", referencedColumnName = "medication_detail_id"), inverseJoinColumns = @JoinColumn(name = "insertion_id", referencedColumnName = "insertion_id"))
	public List<Insertion> insertions;

	@OneToMany(cascade = CascadeType.ALL, mappedBy = "medicationDetail")
	public List<Allergen> allergens;

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result
				+ ((medication == null) ? 0 : medication.hashCode());
		result = prime
				* result
				+ ((medicationDetailId == null) ? 0 : medicationDetailId
						.hashCode());
		result = prime
				* result
				+ ((medicationDetailName == null) ? 0 : medicationDetailName
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
		MedicationDetail other = (MedicationDetail) obj;
		if (medication == null) {
			if (other.medication != null)
				return false;
		} else if (!medication.equals(other.medication))
			return false;
		if (medicationDetailId == null) {
			if (other.medicationDetailId != null)
				return false;
		} else if (!medicationDetailId.equals(other.medicationDetailId))
			return false;
		if (medicationDetailName == null) {
			if (other.medicationDetailName != null)
				return false;
		} else if (!medicationDetailName.equals(other.medicationDetailName))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return medicationDetailName;
	}

}
