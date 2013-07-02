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
@Table(name = "nosology_clinical_manifestation")
@SequenceGenerator(name = "nosology_clinical_manifestation_sequence", sequenceName = "nosology_clinical_manifestation_sequence", allocationSize = 1)
public class NosologyClinicalManifestation extends GenericModel {

	@Id
	@Column(name = "nosology_clinical_manifestation_id")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "nosology_clinical_manifestation_sequence")
	public Long Id;

	@Required
	@Column(name = "clinical_manifestation_id")
	public Integer clinicalManifestationId;

	@Required
	@Column(name = "multyplier")
	public Double multyplier;

	@ManyToOne
	public Nosology nosology;

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((Id == null) ? 0 : Id.hashCode());
		result = prime
				* result
				+ ((clinicalManifestationId == null) ? 0
						: clinicalManifestationId.hashCode());
		result = prime * result
				+ ((multyplier == null) ? 0 : multyplier.hashCode());
		result = prime * result
				+ ((nosology == null) ? 0 : nosology.hashCode());
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
		NosologyClinicalManifestation other = (NosologyClinicalManifestation) obj;
		if (Id == null) {
			if (other.Id != null)
				return false;
		} else if (!Id.equals(other.Id))
			return false;
		if (clinicalManifestationId == null) {
			if (other.clinicalManifestationId != null)
				return false;
		} else if (!clinicalManifestationId
				.equals(other.clinicalManifestationId))
			return false;
		if (multyplier == null) {
			if (other.multyplier != null)
				return false;
		} else if (!multyplier.equals(other.multyplier))
			return false;
		if (nosology == null) {
			if (other.nosology != null)
				return false;
		} else if (!nosology.equals(other.nosology))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Id=" + Id + ", clinicalManifestationId="
				+ clinicalManifestationId + ", multyplier=" + multyplier + "]";
	}

}
