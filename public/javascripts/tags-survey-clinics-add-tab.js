$(document).ready(function() {
	$(".clinics-checkbox").click(function(){
		if($(this).is(":checked")){
			setClinicsEnabled($(this).parent().find(".clinicsSelect"));
		} else{
			setClinicsDisabled($(this).parent().find(".clinicsSelect"));
		}
	});

	var setClinicsEnabled = function (element) {
		$(element).removeAttr('disabled');
	}

	var setClinicsDisabled = function (element) {
		$(element).attr('disabled', 'disabled');
	}
	
	$("#editClinicButton").click(function(){
		$("#editClinicButton").attr("disabled", true);	
	});
	var saveClinicalManifestations = function () {
		var id = null;
		var isChecked = null;
		var jsonObject = "";
		var surveyId = $("#hidden-survey-id").val();
		var medicineCardId = $("#hidden-med-card-id").val();
		var syndromeId = $("input[name='synd_radio']:checked").attr('value');

		jsonObject = jsonObject + "{'surveyId':" + surveyId + ",";
		jsonObject = jsonObject + "'medicineCardId':" + medicineCardId + ",";
		jsonObject = jsonObject + "'syndromeId':" + syndromeId + ",";
		jsonObject = jsonObject + "'clinicalManifestationNorms':[";
		
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
			url : "/surveyView/saveClinicalManifestations",
			data : jsonObject,
			dataType : "json",
			contentType : "application/json",
			success : function(data) {
				$("#hidden-survey-id").val(data);
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

	$(".clinicsSelect").each(function() {
		setClinicsDisabled(this);
	});
});

	