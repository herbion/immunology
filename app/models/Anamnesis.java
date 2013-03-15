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

import com.immunology.enums.AnamnesisType;
import com.immunology.enums.InputType;

@Entity
@Table(name = "anamnesis")
@SequenceGenerator(name = "anamnesis_sequence", sequenceName = "anamnesis_sequence", allocationSize = 1)
public class Anamnesis extends GenericModel {

	@Id
	@Column(name = "anamnesis_id")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "anamnesis_sequence")
	public Long anamnesisId;

	@Required
	@Column(name = "name")
	public String anamnesisName;

	@OneToMany(mappedBy = "anamnesis")
	public List<AnamnesisDetail> anamnesisDetails;

	@ManyToOne
	public Syndrome syndrome;

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((anamnesisId == null) ? 0 : anamnesisId.hashCode());
		result = prime * result + ((anamnesisName == null) ? 0 : anamnesisName.hashCode());
		result = prime * result + ((syndrome == null) ? 0 : syndrome.hashCode());
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
		Anamnesis other = (Anamnesis) obj;
		if (anamnesisId == null) {
			if (other.anamnesisId != null)
				return false;
		} else if (!anamnesisId.equals(other.anamnesisId))
			return false;
		if (anamnesisName == null) {
			if (other.anamnesisName != null)
				return false;
		} else if (!anamnesisName.equals(other.anamnesisName))
			return false;
		if (syndrome == null) {
			if (other.syndrome != null)
				return false;
		} else if (!syndrome.equals(other.syndrome))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return anamnesisName;
	}

}
