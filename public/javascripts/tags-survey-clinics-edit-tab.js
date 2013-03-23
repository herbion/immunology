
$(document).ready(function() {
	$(".clinicsSelect").each(function() {
		setClinicsDisabled(this);
	});
	var isChecked = null;
	$(".clinic-norm-checked").each(function() {
		isChecked =  $(this).val();
		if(isChecked == "true"){
			$(this).next(".clinics-checkbox").attr("checked", "checked");
			setClinicsEnabled($(this).parent().find(".clinicsSelect"));
		}
		var clinicsNormId = $(this).attr("name");
		$(this).parent().find(".clinicsSelect option[value=" + clinicsNormId + "]").attr("selected", "selected");
	});
});

$(".clinics-checkbox").click(function(){
	if($(this).is(":checked")){
		setClinicsEnabled($(this).parent().find(".clinicsSelect"));
	} else{
		setClinicsDisabled($(this).parent().find(".clinicsSelect"));
	}
});

var setClinicsEnabled = function (element) {
	$(element).removeAttr('disabled');
	$(element).closest('.clinic').find('.clinicName').css('background', '#FF8732');
}

var setClinicsDisabled = function (element) {
	$(element).attr('disabled', 'disabled');
	$(element).closest('.clinic').find('.clinicName').css('background', '#2191C0');
}

var updateClinicalManifestations = function () {
	var jsonObject = "";
	var surveyId = $("#hidden-survey-id").val();
	jsonObject = jsonObject + "{'surveyId':" + surveyId + ",";

	jsonObject = jsonObject + "'clinicalManifestationNorms':[";
	var id = null;
	var isChecked = null;
	$(".clinics-checkbox").each(function() {
		isChecked = $(this).is(":checked");
		id = $(this).parent().find(".clinicsSelect option:selected").val();
		jsonObject = jsonObject + "{'id':" + id;
		jsonObject = jsonObject + ",'isChecked': " + isChecked + "},";
	});
	jsonObject = jsonObject.substring(0, jsonObject.length - 1);
	jsonObject = jsonObject + "]}";
	console.log(jsonObject);
	
	$.ajax({
		type : "POST",
		url : "/surveyView/updateClinicalManifestations",
		data : jsonObject,
		dataType : "json",
		contentType : "application/json",
		success : function(data) {
			noty({
				text: "&{'clinic.save.success'}",
				layout: "topRight",
				type: "success"
			});
		},
		error : function(e) {
			noty({
				text: "&{'clinic.save.error'}",
				layout: "topRight",
				type: "error"
			});
		}
	});
}
