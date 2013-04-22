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
@Table(name = "anamnesis_disease_detail")
@SequenceGenerator(name = "anamnesis_disease_detail_sequence", sequenceName = "anamnesis_disease_detail_sequence", allocationSize = 1)
public class AnamnesisDiseaseDetail extends GenericModel {

	@Id
	@Column(name = "anamnesis_disease_detail_id")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "anamnesis_disease_detail_sequence")
	public Long anamnesisDiseaseDetailId;

	@Required
	@Column(name = "name")
	public String anamnesisDiseaseDetailName;

	@Column(name = "value")
	public Double anamnesisDiseaseDetailValue;

	@ManyToOne
	public AnamnesisDisease anamnesisDisease;

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime
				* result
				+ ((anamnesisDisease == null) ? 0 : anamnesisDisease.hashCode());
		result = prime
				* result
				+ ((anamnesisDiseaseDetailId == null) ? 0
						: anamnesisDiseaseDetailId.hashCode());
		result = prime
				* result
				+ ((anamnesisDiseaseDetailName == null) ? 0
						: anamnesisDiseaseDetailName.hashCode());
		result = prime
				* result
				+ ((anamnesisDiseaseDetailValue == null) ? 0
						: anamnesisDiseaseDetailValue.hashCode());
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
		AnamnesisDiseaseDetail other = (AnamnesisDiseaseDetail) obj;
		if (anamnesisDisease == null) {
			if (other.anamnesisDisease != null)
				return false;
		} else if (!anamnesisDisease.equals(other.anamnesisDisease))
			return false;
		if (anamnesisDiseaseDetailId == null) {
			if (other.anamnesisDiseaseDetailId != null)
				return false;
		} else if (!anamnesisDiseaseDetailId
				.equals(other.anamnesisDiseaseDetailId))
			return false;
		if (anamnesisDiseaseDetailName == null) {
			if (other.anamnesisDiseaseDetailName != null)
				return false;
		} else if (!anamnesisDiseaseDetailName
				.equals(other.anamnesisDiseaseDetailName))
			return false;
		if (anamnesisDiseaseDetailValue == null) {
			if (other.anamnesisDiseaseDetailValue != null)
				return false;
		} else if (!anamnesisDiseaseDetailValue
				.equals(other.anamnesisDiseaseDetailValue))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return anamnesisDiseaseDetailName;
	}

}
