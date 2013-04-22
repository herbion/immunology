package models;

import java.util.Date;

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
@Table(name = "clinical_manifestation_norm")
@SequenceGenerator(name = "clinical_manifestation_norm_sequence", sequenceName = "clinical_manifestation_norm_sequence", allocationSize = 1)
public class ClinicalManifestationNorm extends GenericModel {

	@Id
	@Column(name = "id")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "clinical_manifestation_norm_sequence")
	public Long id;

	@Required
	@Column(name = "description")
	public String description;

	@Required
	@Column(name = "update_date")
	public Date updateDate;

	@Required
	@Column(name = "value")
	public Integer value;

	@ManyToOne
	public ClinicalManifestation clinicalManifestation;

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime
				* result
				+ ((clinicalManifestation == null) ? 0 : clinicalManifestation
						.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result
				+ ((description == null) ? 0 : description.hashCode());
		result = prime * result
				+ ((updateDate == null) ? 0 : updateDate.hashCode());
		result = prime * result + ((value == null) ? 0 : value.hashCode());
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
		ClinicalManifestationNorm other = (ClinicalManifestationNorm) obj;
		if (clinicalManifestation == null) {
			if (other.clinicalManifestation != null)
				return false;
		} else if (!clinicalManifestation.equals(other.clinicalManifestation))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (description == null) {
			if (other.description != null)
				return false;
		} else if (!description.equals(other.description))
			return false;
		if (updateDate == null) {
			if (other.updateDate != null)
				return false;
		} else if (!updateDate.equals(other.updateDate))
			return false;
		if (value == null) {
			if (other.value != null)
				return false;
		} else if (!value.equals(other.value))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return clinicalManifestation.name + ": " + description;
	}

}
