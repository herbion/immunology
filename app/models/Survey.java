package models;

import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import play.data.validation.Required;
import play.db.jpa.GenericModel;

@Entity
@Table(name = "survey")
@SequenceGenerator(name = "survey_sequence", sequenceName = "survey_sequence", allocationSize = 1)
public class Survey extends GenericModel {

	@Id
	@Column(name = "survey_id")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "survey_sequence")
	public Long surveyId;

	@Required
	@Column(name = "date")
	public Date surveyDate;

	@Column(name = "alergetic_difficulty_degree")
	public Integer alergeticDifficultyDegree;

	@Column(name = "alergetic_insufficiency_degree")
	public Integer alergeticInsufficiencyDegree;

	@Column(name = "autoimmuno_difficulty_degree")
	public Integer autoimmunoDifficultyDegree;

	@Column(name = "autoimmuno_insufficiency_degree")
	public Integer autoimmunoInsufficiencyDegree;

	@Column(name = "immunodef_difficulty_degree")
	public Integer immunodefDifficultyDegree;

	@Column(name = "immunodef_insufficiency_degree")
	public Integer immunodefInsufficiencyDegree;

	@OneToMany(cascade = CascadeType.ALL, mappedBy = "survey")
	public List<SurveyAnswer> surveyAnswers;

	@OneToMany(cascade = CascadeType.ALL, mappedBy = "survey")
	public List<SurveyAnalysis> surveyAnalyses;

	@OneToMany(cascade = CascadeType.ALL, mappedBy = "survey")
	public List<SurveyClinicalManifestation> surveyClinicalManifestations;

	@OneToMany(cascade = CascadeType.ALL, mappedBy = "survey")
	public List<SurveyTreatment> surveyTreatments;

	@OneToOne
	public Syndrome syndrome;

	@OneToOne
	public Nosology nosology;

	@ManyToOne
	public User user;

	@ManyToOne(cascade = CascadeType.DETACH)
	public MedicineCard medicineCard;

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime
				* result
				+ ((alergeticDifficultyDegree == null) ? 0
						: alergeticDifficultyDegree.hashCode());
		result = prime
				* result
				+ ((alergeticInsufficiencyDegree == null) ? 0
						: alergeticInsufficiencyDegree.hashCode());
		result = prime
				* result
				+ ((autoimmunoDifficultyDegree == null) ? 0
						: autoimmunoDifficultyDegree.hashCode());
		result = prime
				* result
				+ ((autoimmunoInsufficiencyDegree == null) ? 0
						: autoimmunoInsufficiencyDegree.hashCode());
		result = prime
				* result
				+ ((immunodefDifficultyDegree == null) ? 0
						: immunodefDifficultyDegree.hashCode());
		result = prime
				* result
				+ ((immunodefInsufficiencyDegree == null) ? 0
						: immunodefInsufficiencyDegree.hashCode());
		result = prime * result
				+ ((medicineCard == null) ? 0 : medicineCard.hashCode());
		result = prime * result
				+ ((surveyDate == null) ? 0 : surveyDate.hashCode());
		result = prime * result
				+ ((surveyId == null) ? 0 : surveyId.hashCode());
		result = prime * result
				+ ((syndrome == null) ? 0 : syndrome.hashCode());
		result = prime * result + ((user == null) ? 0 : user.hashCode());
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
		Survey other = (Survey) obj;
		if (alergeticDifficultyDegree == null) {
			if (other.alergeticDifficultyDegree != null)
				return false;
		} else if (!alergeticDifficultyDegree
				.equals(other.alergeticDifficultyDegree))
			return false;
		if (alergeticInsufficiencyDegree == null) {
			if (other.alergeticInsufficiencyDegree != null)
				return false;
		} else if (!alergeticInsufficiencyDegree
				.equals(other.alergeticInsufficiencyDegree))
			return false;
		if (autoimmunoDifficultyDegree == null) {
			if (other.autoimmunoDifficultyDegree != null)
				return false;
		} else if (!autoimmunoDifficultyDegree
				.equals(other.autoimmunoDifficultyDegree))
			return false;
		if (autoimmunoInsufficiencyDegree == null) {
			if (other.autoimmunoInsufficiencyDegree != null)
				return false;
		} else if (!autoimmunoInsufficiencyDegree
				.equals(other.autoimmunoInsufficiencyDegree))
			return false;
		if (immunodefDifficultyDegree == null) {
			if (other.immunodefDifficultyDegree != null)
				return false;
		} else if (!immunodefDifficultyDegree
				.equals(other.immunodefDifficultyDegree))
			return false;
		if (immunodefInsufficiencyDegree == null) {
			if (other.immunodefInsufficiencyDegree != null)
				return false;
		} else if (!immunodefInsufficiencyDegree
				.equals(other.immunodefInsufficiencyDegree))
			return false;
		if (medicineCard == null) {
			if (other.medicineCard != null)
				return false;
		} else if (!medicineCard.equals(other.medicineCard))
			return false;
		if (surveyAnalyses == null) {
			if (other.surveyAnalyses != null)
				return false;
		} else if (!surveyAnalyses.equals(other.surveyAnalyses))
			return false;
		if (surveyAnswers == null) {
			if (other.surveyAnswers != null)
				return false;
		} else if (!surveyAnswers.equals(other.surveyAnswers))
			return false;
		if (surveyClinicalManifestations == null) {
			if (other.surveyClinicalManifestations != null)
				return false;
		} else if (!surveyClinicalManifestations
				.equals(other.surveyClinicalManifestations))
			return false;
		if (surveyDate == null) {
			if (other.surveyDate != null)
				return false;
		} else if (!surveyDate.equals(other.surveyDate))
			return false;
		if (surveyId == null) {
			if (other.surveyId != null)
				return false;
		} else if (!surveyId.equals(other.surveyId))
			return false;
		if (syndrome == null) {
			if (other.syndrome != null)
				return false;
		} else if (!syndrome.equals(other.syndrome))
			return false;
		if (user == null) {
			if (other.user != null)
				return false;
		} else if (!user.equals(other.user))
			return false;
		return true;
	}

	@Override
	public String toString() {

		return "surveyDate = " + surveyDate;
	}
}
