

$(document).ready(function() {

	$(".radio").each(function() {
		$(this).buttonset();
	});
	
	$("li.complaint-item").each(function() {
		var val = $(this).find(".survey-answer-value").val();
		$radios = $(this).find(".radio-button");
		$radios.each(function() {
			var value = $(this).attr("value");
			if(value == val) {
				$(this).attr("checked", true);
				$(this).closest("div").find('label[for="' + $(this).attr('id') + '"]').addClass("ui-state-active");
			}
		});
	});
});

var updateComplaints = function () {
	var jsonObject = "";
	var surveyId = $("#hidden-survey-id").val();

	jsonObject = jsonObject + "{'surveyId':" + surveyId + ",";
	jsonObject = jsonObject + "'surveyAnswers':[";

	$("li.complaint-item").each(function() {
		var surveyAnswerId = $(this).find(".survey-answer-id").val();
		var value = null;
		$radios = $(this).find(".radio-button");
		$radios.each(function(){
			if($(this).is(":checked")){
				value = $(this).attr("value");
			}
		});
		jsonObject = jsonObject + "{'id':" + surveyAnswerId;
		jsonObject = jsonObject + ",'value':" + value;
		jsonObject = jsonObject + "},";
	});
	
	jsonObject  = jsonObject.substring(0, jsonObject.length - 1);
	
	jsonObject = jsonObject + "]}";

	$.ajax({
		type : "POST",
		url : "/surveyView/updateComplaints",
		data : jsonObject,
		dataType : "json",
		contentType : "application/json",
		success : function(id) {
			noty({
				text: "&{'complaints.save.success'}",
				layout: "topRight",
				type: "success"
			});
		},
		error : function(e){
			noty({
				text: "&{'complaints.save.error'}",
				layout: "topRight",
				type: "error"
			});
		}
	});
}
