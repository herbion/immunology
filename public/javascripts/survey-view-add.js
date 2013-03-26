
$(function() {
	$("#tabs").tabs();

	$(".radio").each(function() {
		$(this).buttonset();
	});

	$("input[name='synd_radio']").change(function () {
		console.log('reloading content id=' + $(this).val());
		var selectAction = #{jsAction @reloadComplaints(':syndromes') /};
	    $('#tabs-1').load(selectAction({syndromes: $(this).val()}));
	    
	    selectAction = #{jsAction @reloadAnalysis(':syndromes') /};
	    $('#tabs-2').load(selectAction({syndromes: $(this).val()}));
	    
	    selectAction = #{jsAction @reloadClinicalManifestations(':syndromes') /};
	    $('#tabs-3').load(selectAction({syndromes: $(this).val()}));

	    selectAction = #{jsAction @reloadTreatments(':syndromes') /};
	    $('#tabs-4').load(selectAction({syndromes: $(this).val()}));

	    selectAction = #{jsAction @reloadNosology(':syndromes') /};
	    $('#tabs-5').load(selectAction({syndromes: $(this).val()}));
	});

	var signRightNav = $('<img/>').attr('src', '/public/images/elements/sign-right-nav.gif').addClass('signRightNav');
	var patientAnchor = $('<a></a>').text("${medicineCard.patient.lastName}" + " " +
										  "${medicineCard.patient.firstName}" + " " +
										  "${medicineCard.patient.middleName}")
									.attr('href', '@{PatientView.show(medicineCard.patient.patientId)}');
	$('#breadcrumb').append(signRightNav.clone()).append(patientAnchor);
});
