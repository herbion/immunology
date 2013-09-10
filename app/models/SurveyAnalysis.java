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
@Table(name = "survey_analysis")
@SequenceGenerator(name = "survey_analysis_sequence", sequenceName = "survey_analysis_sequence", allocationSize = 1)
public class SurveyAnalysis extends GenericModel {

	@Id
	@Column(name = "survey_analysis_id")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "survey_analysis_sequence")
	public Long surveyAnalysisId;

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
	public AnalysisNorm analysisNorm;

	@ManyToOne
	public Survey survey;

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result
				+ ((description == null) ? 0 : description.hashCode());
		result = prime * result
				+ ((isChecked == null) ? 0 : isChecked.hashCode());
		result = prime * result + ((survey == null) ? 0 : survey.hashCode());
		result = prime
				* result
				+ ((surveyAnalysisId == null) ? 0 : surveyAnalysisId.hashCode());
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
		SurveyAnalysis other = (SurveyAnalysis) obj;
		if (description == null) {
			if (other.description != null)
				return false;
		} else if (!description.equals(other.description))
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
		if (surveyAnalysisId == null) {
			if (other.surveyAnalysisId != null)
				return false;
		} else if (!surveyAnalysisId.equals(other.surveyAnalysisId))
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
		return "Survey Analysis ID: " + surveyAnalysisId;
	}

}
