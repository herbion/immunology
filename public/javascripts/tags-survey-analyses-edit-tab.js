
$(document).ready(function() {
	$(".analysis-checkbox").click(function(){
		setDisabled($(this).next(".analysisDescription").find(".analysisNormsSelect"));
		setDisabled($(this).next(".analysisDescription").find(".analysis-description"));
	});

	var isChecked = null;
	$(".analysis").each(function() {
		isChecked =  $(this).children(".analysis-norm-checked").val();
		if(isChecked == "true"){
			$(this).children(".analysis-checkbox").attr("checked", "checked");
			setEnabled($(this).children(".analysisDescription").find(".analysisNormsSelect"));
			setEnabled($(this).children(".analysisDescription").find(".analysis-description"));
		}
		var analysesNormId = $(this).find(".analysis-norm-id").val();
		$(this).find("select option[value=" + analysesNormId + "]").attr("selected", "selected");
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

var updateAnalyses = function () {
	var id = null;
	var isChecked = null;
	var description = null;
	var jsonObject = "";
	var surveyId = $("#hidden-survey-id").val();

	jsonObject = jsonObject + "{'surveyId':" + surveyId + ",";
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
		url : "/surveyView/updateAnalyses",
		data : jsonObject,
		dataType : "json",
		contentType : "application/json",
		success : function(surveyId) {
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
