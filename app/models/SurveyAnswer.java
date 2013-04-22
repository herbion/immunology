package models;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import play.db.jpa.GenericModel;

@Entity
@Table(name = "survey_answer")
@SequenceGenerator(name = "survey_answer_sequence", sequenceName = "survey_answer_sequence", allocationSize = 1)
public class SurveyAnswer extends GenericModel {

	@Id
	@Column(name = "survey_answer_id")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "survey_answer_sequence")
	public Long surveyAnswerId;

	@Column(name = "description")
	public String answerDescription;

	@Column(name = "value")
	public Integer answerValue;

	@OneToOne
	public Complaint complaint;

	@Column(name = "multiplier")
	public Double multiplier;

	@OneToMany
	@JoinTable(name = "survey_answer_complaint_detail", joinColumns = @JoinColumn(name = "survey_answer_id", referencedColumnName = "survey_answer_id"), inverseJoinColumns = @JoinColumn(name = "complaint_detail_id", referencedColumnName = "complaint_detail_id"))
	public List<ComplaintDetail> complaintDetails;

	@ManyToOne
	public Survey survey;

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime
				* result
				+ ((answerDescription == null) ? 0 : answerDescription
						.hashCode());
		result = prime * result
				+ ((answerValue == null) ? 0 : answerValue.hashCode());
		result = prime * result
				+ ((complaint == null) ? 0 : complaint.hashCode());
		result = prime * result + ((survey == null) ? 0 : survey.hashCode());
		result = prime * result
				+ ((surveyAnswerId == null) ? 0 : surveyAnswerId.hashCode());
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
		SurveyAnswer other = (SurveyAnswer) obj;
		if (answerDescription == null) {
			if (other.answerDescription != null)
				return false;
		} else if (!answerDescription.equals(other.answerDescription))
			return false;
		if (answerValue == null) {
			if (other.answerValue != null)
				return false;
		} else if (!answerValue.equals(other.answerValue))
			return false;
		if (complaint == null) {
			if (other.complaint != null)
				return false;
		} else if (!complaint.equals(other.complaint))
			return false;
		if (survey == null) {
			if (other.survey != null)
				return false;
		} else if (!survey.equals(other.survey))
			return false;
		if (surveyAnswerId == null) {
			if (other.surveyAnswerId != null)
				return false;
		} else if (!surveyAnswerId.equals(other.surveyAnswerId))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "complaint = " + complaint + ", answerValue = " + answerValue;
	}

}
