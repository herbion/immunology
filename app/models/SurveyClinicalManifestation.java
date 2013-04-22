package models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import play.data.validation.Required;
import play.db.jpa.GenericModel;

@Entity
@Table(name = "survey_clinical_manifestation")
@SequenceGenerator(name = "survey_clinical_manifestation_sequence", sequenceName = "survey_clinical_manifestation_sequence", allocationSize = 1)
public class SurveyClinicalManifestation extends GenericModel {

	@Id
	@Column(name = "id")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "survey_clinical_manifestation_sequence")
	public Long id;

	@Required
	@Column(name = "value")
	public Integer value;

	@Required
	@Column(name = "description")
	public String description;

	@Required
	@Column(name = "is_checked")
	public Boolean isChecked;

	@Column(name = "multiplier")
	public Double multiplier;

	@OneToOne
	public ClinicalManifestationNorm clinicalManifestationNorm;

	@ManyToOne
	public Survey survey;

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result
				+ ((description == null) ? 0 : description.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result
				+ ((isChecked == null) ? 0 : isChecked.hashCode());
		result = prime * result + ((survey == null) ? 0 : survey.hashCode());
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
		SurveyClinicalManifestation other = (SurveyClinicalManifestation) obj;
		if (description == null) {
			if (other.description != null)
				return false;
		} else if (!description.equals(other.description))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (isChecked == null) {
			if (other.isChecked != null)
				return false;
		} else if (!isChecked.equals(other.isChecked))
			return false;
		if (survey == null) {
			if (other.survey != null)
				return false;
		} else if (!survey.equals(other.survey))
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
		return "Survey clinical manifestation ID: " + id;
	}

}
