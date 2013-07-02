package wrappers;

import java.util.List;

public class SurveyWrapper {

	public Long surveyId;

	public Long medicineCardId;

	public String medicineCardInfo;

	public Long syndromeId;

	public Long nosologyId;

	public List<ComplaintWrapper> complaints;

	public List<AnalysisNormWrapper> analysesNorms;

	public List<SurveyAnswerWrapper> surveyAnswers;

	public List<ClinicalManifestationNormWrapper> clinicalManifestationNorms;

	public List<AnamnesisWrapper> anamneses;

	public List<AnamnesisDeseaseWrapper> anamnesisDeseases;

	public List<TreatmentWrapper> treatments;
}
