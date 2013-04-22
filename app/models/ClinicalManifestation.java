package models;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import play.data.validation.Required;
import play.db.jpa.GenericModel;

import com.immunology.enums.ClinicalManifestationType;

@Entity
@Table(name = "clinical_manifestation")
@SequenceGenerator(name = "clinical_manifestation_sequence", sequenceName = "clinical_manifestation_sequence", allocationSize = 1)
public class ClinicalManifestation extends GenericModel {

	@Id
	@Column(name = "id")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "clinical_manifestation_sequence")
	public Long id;

	@Required
	@Column(name = "name")
	public String name;

	@Required
	@Enumerated
	@Column(name = "type")
	public ClinicalManifestationType clinicalManifestationType;

	@OneToMany(cascade = CascadeType.ALL, mappedBy = "clinicalManifestation")
	public List<ClinicalManifestationNorm> clinicalManifestationNorms;

	@ManyToOne
	public ClinicalManifestationComplaint clinicalManifestationComplaint;

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime
				* result
				+ ((clinicalManifestationComplaint == null) ? 0
						: clinicalManifestationComplaint.hashCode());
		result = prime
				* result
				+ ((clinicalManifestationType == null) ? 0
						: clinicalManifestationType.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
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
		ClinicalManifestation other = (ClinicalManifestation) obj;
		if (clinicalManifestationComplaint == null) {
			if (other.clinicalManifestationComplaint != null)
				return false;
		} else if (!clinicalManifestationComplaint
				.equals(other.clinicalManifestationComplaint))
			return false;
		if (clinicalManifestationType != other.clinicalManifestationType)
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return name;
	}

}
