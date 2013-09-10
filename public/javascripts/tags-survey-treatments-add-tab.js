
$(document).ready(function() {
	$("textarea").addClass("autogrow-short").autogrow();
	$("#treatment-info").accordion({ collapsible: true, active: false, header: "h3", autoHeight: false });
});

var saveTreatments = function () {
	var jsonObject = {
		surveyId: $("#hidden-survey-id").val(),
		medicineCardId: $("#hidden-med-card-id").val(),
		syndromeId: $('#choose-survey-obj').val(),
		treatments: []
	};	
	
	$(".treatments").each(function() {
		$checkbox = $(this).find(".treatment-checkbox");
		$multiplicity = $(this).find(".treatment-multiplicity");
		$dose = $(this).find(".treatment-dose");
		$description = $(this).find(".treatment-description");
		$insertionType = $(this).find(".insertion-select option:selected"); 
		$therapyType = $(this).find(".therapy-type-select option:selected");
		$allegren = $(this).find(".allergen-select option:selected");

		if($checkbox.is(":checked")){
			jsonObject.treatments.push({
				"id": $checkbox.val() || null,
				"insertionId": $insertionType.val() || null,
				"allegrenId": $allegren.val() || null,
				"therapy": $therapyType.val() || null,
				"description": $description.val() || null,
				"dose": $dose.val() || null,
				"multiplicity": $multiplicity.val() || null,
				"isChecked": true 
			});
		}
	});

	console.log("jsonObject: " + JSON.stringify(jsonObject));

	$.ajax({
		type : "POST",
		url : "/surveyView/saveTreatments",
		data : JSON.stringify(jsonObject),
		dataType : "json",
		contentType : "application/json",
		success : function(id) {
			$("#hidden-survey-id").val(id);
			noty({
				text: "&{'treatments.save.success'}",
				layout: "topRight",
				type: "success"
				});
		},
		error : function(e) {
			noty({
				text: "&{'treatments.save.error'}",
				layout: "topRight",
				type: "error"
			});
		}
	});
}
