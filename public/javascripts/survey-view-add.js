$(function() {
	var init = function () {
		console.log('init radio buttons');
		$('#tabs').tabs();
		$("#selectSyndromeBlock .radio").each(function() {
			$(this).buttonset();
		});
	};
	init();

	$("input[name='synd_radio']").change(function() {
		$('#tabs').html('Loading');
		console.log('reloading content id=' + $(this).val());

		var updateAction = #{jsAction @loadContentFrom(':idSurveyObject') /};
		var id = $(this).val();

		$('#tabs').html("<center><h1>Loading stuff, wait a sec folks ... <h1></center>");

		$.post(updateAction({
			idSurveyObject: id
		}),	function(content) {
			$('#tabs').html(content);
			$('#tabs').tabs('destroy'); // ~~~~~~~~ REMOVE THIS LATER ~~~~~~
			init();
		});
	});

	var signRightNav = $('<img/>').attr('src', '/public/images/elements/sign-right-nav.gif').addClass('signRightNav');
	var patientAnchor = $('<a></a>').text("${medicineCard.patient.lastName}" + " " +
									"${medicineCard.patient.firstName}" + " " +
									"${medicineCard.patient.middleName}")
									.attr('href', '@{PatientView.show(medicineCard.patient.patientId)}');
	var surveyAnchor = $('<a/>').text("&{'survey.new'}")
								.attr('href', '@{SurveyView.add(medicineCard.medicineCardId)}');
	$('#breadcrumb').append(signRightNav.clone())
					.append(patientAnchor)
					.append(signRightNav.clone())
					.append(surveyAnchor);
	
});