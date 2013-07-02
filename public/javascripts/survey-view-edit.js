
$(function() {
	$("#tabs").tabs();

	$("input[name='synd_radio']").change(function() {
		var selectAction = #{jsAction @editComplaints(':syndromeId', ':surveyId') /};
	    $('#tabs-1').load(selectAction({syndromeId: $(this).val(), surveyId: ${survey.surveyId}}));

	    var selectAction = #{jsAction @editAnalysis(':syndromeId', ':surveyId') /};
	    $('#tabs-2').load(selectAction({syndromeId: $(this).val(), surveyId: ${survey.surveyId}}));

	    var selectAction = #{jsAction @editClinicalManifestations(':syndromeId', ':surveyId') /};
	    $('#tabs-3').load(selectAction({syndromeId: $(this).val(), surveyId: ${survey.surveyId}}));

	    var selectAction = #{jsAction @editTreatments(':syndromeId', ':surveyId') /};
	    $('#tabs-4').load(selectAction({syndromeId: $(this).val(), surveyId: ${survey.surveyId}}));

	    var selectAction = #{jsAction @editNosology(':syndromeId', ':surveyId') /};
	    $('#tabs-5').load(selectAction({syndromeId: $(this).val(), surveyId: ${survey.surveyId}}));
	});
	
	var signRightNav = $('<img/>').attr('src', '/public/images/elements/sign-right-nav.gif').addClass('signRightNav');
	var patientAnchor = $('<a></a>').text("${survey.medicineCard.patient.lastName}" + " " +
										  "${survey.medicineCard.patient.firstName}" + " " +
										  "${survey.medicineCard.patient.middleName}")
									.attr('href', '@{PatientView.show(survey.medicineCard.patient.patientId)}');
	var surveyAnchor = $('<a></a>').text("&{'surveys'}").attr('href', '@{SurveyView.show(survey.surveyId)}');
	$('#breadcrumb').append(signRightNav.clone()).append(patientAnchor).append(signRightNav).append(surveyAnchor);
});
