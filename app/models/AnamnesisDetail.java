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
@Table(name = "anamnesis_detail")
@SequenceGenerator(name = "anamnesis_detail_sequence", sequenceName = "anamnesis_detail_sequence", allocationSize = 1)
public class AnamnesisDetail extends GenericModel {

	@Id
	@Column(name = "anamnesis_detail_id")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "anamnesis_detail_sequence")
	public Long anamnesisDetailId;

	@Required
	@Column(name = "name")
	public String anamnesisDetailName;

	@Required
	@Enumerated
	@Column(name = "type")
	public InputType type;

	@OneToMany(mappedBy = "anamnesisDetail")
	public List<AnamnesisDetailValue> anamnesisDetailValues;

	@ManyToOne
	public Anamnesis anamnesis;

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result
				+ ((anamnesis == null) ? 0 : anamnesis.hashCode());
		result = prime
				* result
				+ ((anamnesisDetailId == null) ? 0 : anamnesisDetailId
						.hashCode());
		result = prime
				* result
				+ ((anamnesisDetailName == null) ? 0 : anamnesisDetailName
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
		AnamnesisDetail other = (AnamnesisDetail) obj;
		if (anamnesis == null) {
			if (other.anamnesis != null)
				return false;
		} else if (!anamnesis.equals(other.anamnesis))
			return false;
		if (anamnesisDetailId == null) {
			if (other.anamnesisDetailId != null)
				return false;
		} else if (!anamnesisDetailId.equals(other.anamnesisDetailId))
			return false;
		if (anamnesisDetailName == null) {
			if (other.anamnesisDetailName != null)
				return false;
		} else if (!anamnesisDetailName.equals(other.anamnesisDetailName))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return anamnesisDetailName;
	}

}
