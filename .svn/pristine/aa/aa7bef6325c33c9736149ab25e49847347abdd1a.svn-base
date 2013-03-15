package models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import play.data.validation.Required;
import play.db.jpa.GenericModel;

import com.immunology.enums.AnamnesisType;

@Entity
@Table(name = "analysis_detail")
@SequenceGenerator(name = "analysis_detail_sequence", sequenceName = "analysis_detail_sequence", allocationSize = 1)
public class AnalysisDetail extends GenericModel {

	@Id
	@Column(name = "analysis_detail_id")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "analysis_detail_sequence")
	public Long analysisDetailId;

	@Required
	@Column(name = "name")
	public String analysisDetailName;

	@ManyToOne
	public AnalysisSubType analysisSubType;

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result
				+ ((analysisSubType == null) ? 0 : analysisSubType.hashCode());
		result = prime
				* result
				+ ((analysisDetailName == null) ? 0 : analysisDetailName
						.hashCode());
		result = prime
				* result
				+ ((analysisDetailName == null) ? 0 : analysisDetailName
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
		AnalysisDetail other = (AnalysisDetail) obj;
		if (analysisSubType == null) {
			if (other.analysisSubType != null)
				return false;
		} else if (!analysisSubType.equals(other.analysisSubType))
			return false;
		if (analysisDetailId == null) {
			if (other.analysisDetailId != null)
				return false;
		} else if (!analysisDetailId.equals(other.analysisDetailId))
			return false;
		if (analysisDetailName == null) {
			if (other.analysisDetailName != null)
				return false;
		} else if (!analysisDetailName.equals(other.analysisDetailName))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return analysisDetailName;
	}

}
