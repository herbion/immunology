package models;

import java.util.List;

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

import com.immunology.enums.InputType;

@Entity
@Table(name = "anamnesis_disease")
@SequenceGenerator(name = "anamnesis_disease_sequence", sequenceName = "anamnesis_disease_sequence", allocationSize = 1)
public class AnamnesisDisease extends GenericModel {

	@Id
	@Column(name = "anamnesis_disease_id")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "anamnesis_disease_sequence")
	public Long anamnesisDiseaseId;

	@Required
	@Column(name = "name")
	public String anamnesisDiseaseName;

	@Required
	@Enumerated
	@Column(name = "type")
	public InputType type;

	@OneToMany(mappedBy = "anamnesisDisease")
	public List<AnamnesisDiseaseDetail> anamnesisDiseaseDetails;

	@ManyToOne
	public Syndrome syndrome;

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime
				* result
				+ ((anamnesisDiseaseId == null) ? 0 : anamnesisDiseaseId
						.hashCode());
		result = prime
				* result
				+ ((anamnesisDiseaseName == null) ? 0 : anamnesisDiseaseName
						.hashCode());
		result = prime * result
				+ ((syndrome == null) ? 0 : syndrome.hashCode());
		result = prime * result + ((type == null) ? 0 : type.hashCode());
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
		AnamnesisDisease other = (AnamnesisDisease) obj;
		if (anamnesisDiseaseId == null) {
			if (other.anamnesisDiseaseId != null)
				return false;
		} else if (!anamnesisDiseaseId.equals(other.anamnesisDiseaseId))
			return false;
		if (anamnesisDiseaseName == null) {
			if (other.anamnesisDiseaseName != null)
				return false;
		} else if (!anamnesisDiseaseName.equals(other.anamnesisDiseaseName))
			return false;
		if (syndrome == null) {
			if (other.syndrome != null)
				return false;
		} else if (!syndrome.equals(other.syndrome))
			return false;
		if (type != other.type)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return anamnesisDiseaseName;
	}

}
