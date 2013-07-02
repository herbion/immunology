package models;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import play.data.validation.Required;
import play.db.jpa.GenericModel;

@Entity
@Table(name = "analysis_subtype")
@SequenceGenerator(name = "analysis_subtype_sequence", sequenceName = "analysis_subtype_sequence", allocationSize = 1)
public class AnalysisSubType extends GenericModel {

	@Id
	@Column(name = "analysis_subtype_id")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "analysis_subtype_sequence")
	public Long analysisSubTypeId;

	@Required
	@Column(name = "name")
	public String analysisSubTypeName;

	@ManyToOne
	public Analysis analysis;

	@OneToMany(cascade = CascadeType.ALL, mappedBy = "analysisSubType")
	public List<AnalysisDetail> analysisDetails;

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result
				+ ((analysis == null) ? 0 : analysis.hashCode());
		result = prime
				* result
				+ ((analysisSubTypeId == null) ? 0 : analysisSubTypeId
						.hashCode());
		result = prime
				* result
				+ ((analysisSubTypeName == null) ? 0 : analysisSubTypeName
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
		AnalysisSubType other = (AnalysisSubType) obj;
		if (analysis == null) {
			if (other.analysis != null)
				return false;
		} else if (!analysis.equals(other.analysis))
			return false;
		if (analysisSubTypeId == null) {
			if (other.analysisSubTypeId != null)
				return false;
		} else if (!analysisSubTypeId.equals(other.analysisSubTypeId))
			return false;
		if (analysisSubTypeName == null) {
			if (other.analysisSubTypeName != null)
				return false;
		} else if (!analysisSubTypeName.equals(other.analysisSubTypeName))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return analysisSubTypeName;
	}

}
