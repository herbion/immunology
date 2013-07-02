
$(document).ready(function() {
	$(".analysis-checkbox").click(function(){
		setDisabled($(this).next(".analysisDescription").find(".analysisNormsSelect"));
		setDisabled($(this).next(".analysisDescription").find(".analysis-description"));
	});
});

$(".analysis-checkbox").click(function(){
	if($(this).is(":checked")){
		setEnabled($(this).next(".analysisDescription").find(".analysisNormsSelect"));
		setEnabled($(this).next(".analysisDescription").find(".analysis-description"));
	} else{
		setDisabled($(this).next(".analysisDescription").find(".analysisNormsSelect"));
		setDisabled($(this).next(".analysisDescription").find(".analysis-description"));
	}
});

var setEnabled = function (element) {
	$(element).removeAttr('disabled');
	$(element).closest('.analysis').find('.analysisName').css('background', '#FF8732');
}

var setDisabled = function (element) {
	$(element).attr('disabled', 'disabled');
	$(element).closest('.analysis').find('.analysisName').css('background', '#2191C0');
}

$("#editAnalysesButton").click(function(){
	$("#editAnalysesButton").attr("disabled", true);	
});
var saveAnalyses = function () {
	var id = null;
	var isChecked = null;
	var description = null;
	var jsonObject = "";
	var surveyId = $("#hidden-survey-id").val();
	var medicineCardId = $("#hidden-med-card-id").val();
	var syndromeId = $("input[name='synd_radio']:checked").attr('value');

	jsonObject = jsonObject + "{'surveyId':" + surveyId + ",";
	jsonObject = jsonObject + "'medicineCardId':" + medicineCardId + ",";
	jsonObject = jsonObject + "'syndromeId':" + syndromeId + ",";
	jsonObject = jsonObject + "'analysesNorms':[";

	$(".analysis-checkbox").each(function() {
		isChecked = $(this).is(":checked");
		id = $(this).next(".analysisDescription").find(".analysisNormsSelect option:selected").val();
		if(id == "" || id == undefined) {
			id = $(this).next(".analysisDescription").find(".analysis-description").attr("name");
		}
		description = $(this).next(".analysisDescription").find(".analysis-description").val();
		if(description != "" && description != undefined) {
			description = "'" + description + "'";
		}else{
			description = null;
		}
		jsonObject = jsonObject + "{'id':" + id;
		jsonObject = jsonObject + ",'isChecked': " + isChecked;
		jsonObject = jsonObject + ",'description': " + description + "},";
		
		
	});
	jsonObject = jsonObject.substring(0, jsonObject.length - 1);
	jsonObject = jsonObject + "]}";

	console.log(jsonObject);
	
	$.ajax({
		type : "POST",
		url : "/surveyView/saveAnalyses",
		data : jsonObject,
		dataType : "json",
		contentType : "application/json",
		success : function(id) {
			$("#hidden-survey-id").val(id);
			noty({
				text: "&{'laboratory.save.success'}",
				layout: "topRight",
				type: "success"
			});
		},
		error : function(e) {
			noty({
				text: "&{'laboratory.save.error'}",
				layout: "topRight",
				type: "error"
			});
		}
	});
}
