$(".clinics-checkbox").click(function() {
	if ($(this).is(":checked")) {
		setClinicsEnabled($(this).parent().find(".clinicsSelect"));
	} else {
		setClinicsDisabled($(this).parent().find(".clinicsSelect"));
	}
});
var setClinicsEnabled = function(element) {
	$(element).removeAttr('disabled');
}
var setClinicsDisabled = function(element) {
	$(element).attr('disabled', 'disabled');
}
$("#editClinicButton").click(function() {
	$("#editClinicButton").attr("disabled", true);
});
var saveClinicalManifestations = function() {
	var id = null;
	var isChecked = null;
	var jsonObject = {
		surveyId: $("#hidden-survey-id").val(),
		medicineCardId: $("#hidden-med-card-id").val(),
		syndromeId: $('#choose-survey-obj').val(),
		clinicalManifestationNorms: []
	};
	$(".clinics-checkbox").each(function() {
		isChecked = $(this).is(":checked");
		id = $(this).parent().find(".clinicsSelect option:selected").val();
		jsonObject.clinicalManifestationNorms.push({
			"id": id,
			"isChecked": isChecked
		});
	});
	console.log(jsonObject);
	$.ajax({
		type: "POST",
		url: "/surveyView/saveClinicalManifestations",
		data: JSON.stringify(jsonObject),
		dataType: "json",
		contentType: "application/json",
		success: function(data) {
			$("#hidden-survey-id").val(data);
			noty({
				text: "&{'clinic.save.success'}",
				layout: "topRight",
				type: "success"
			});
		},
		error: function(e) {
			noty({
				text: "&{'clinic.save.error'}",
				layout: "topRight",
				type: "error"
			});
		}
	});
}
$(".clinicsSelect").each(function() {
	setClinicsDisabled(this);
});