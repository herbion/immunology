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
@Table(name = "anamnesis_detail_value")
@SequenceGenerator(name = "anamnesis_detail_value_sequence", sequenceName = "anamnesis_detail_value_sequence", allocationSize = 1)
public class AnamnesisDetailValue extends GenericModel {

	@Id
	@Column(name = "anamnesis_detail_value_id")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "anamnesis_detail_value_sequence")
	public Long anamnesisDetailValueId;

	@Required
	@Column(name = "name")
	public String anamnesisDetailValueName;

	@Required
	@Column(name = "value")
	public Double anamnesisDetailValueValue;

	@ManyToOne
	public AnamnesisDetail anamnesisDetail;

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result
				+ ((anamnesisDetail == null) ? 0 : anamnesisDetail.hashCode());
		result = prime
				* result
				+ ((anamnesisDetailValueId == null) ? 0
						: anamnesisDetailValueId.hashCode());
		result = prime
				* result
				+ ((anamnesisDetailValueName == null) ? 0
						: anamnesisDetailValueName.hashCode());
		result = prime
				* result
				+ ((anamnesisDetailValueValue == null) ? 0
						: anamnesisDetailValueValue.hashCode());
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
		AnamnesisDetailValue other = (AnamnesisDetailValue) obj;
		if (anamnesisDetail == null) {
			if (other.anamnesisDetail != null)
				return false;
		} else if (!anamnesisDetail.equals(other.anamnesisDetail))
			return false;
		if (anamnesisDetailValueId == null) {
			if (other.anamnesisDetailValueId != null)
				return false;
		} else if (!anamnesisDetailValueId.equals(other.anamnesisDetailValueId))
			return false;
		if (anamnesisDetailValueName == null) {
			if (other.anamnesisDetailValueName != null)
				return false;
		} else if (!anamnesisDetailValueName
				.equals(other.anamnesisDetailValueName))
			return false;
		if (anamnesisDetailValueValue == null) {
			if (other.anamnesisDetailValueValue != null)
				return false;
		} else if (!anamnesisDetailValueValue
				.equals(other.anamnesisDetailValueValue))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return anamnesisDetailValueName;
	}

}
