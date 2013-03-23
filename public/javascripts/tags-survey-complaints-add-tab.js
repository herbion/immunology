
$(document).ready(function() {
	$(".radio").each(function() {
		$(this).buttonset();
	});
});

$("#editComplaintButton").click(function(){
	$("#editComplaintButton").attr("disabled", true);	
});

var saveComplaints = function () {
	var jsonObject = "";
	var surveyId = $("#hidden-survey-id").val();
	var medicineCardId = $("#hidden-med-card-id").val();
	var syndromeId = $("input[name='synd_radio']:checked").attr('value');

	jsonObject = jsonObject + "{'surveyId':" + surveyId + ",";
	jsonObject = jsonObject + "'medicineCardId':" + medicineCardId + ",";
	jsonObject = jsonObject + "'syndromeId':" + syndromeId + ",";
	
	jsonObject = jsonObject + "'complaints':[";
	$("#survey-info input[type='radio']:checked").each(function() {
		jsonObject = jsonObject + "{'id':" + $(this).attr('name');
		jsonObject = jsonObject + ",'value':" + $(this).attr('value') + "},";
	});
	jsonObject  = jsonObject.substring(0, jsonObject.length - 1);
	jsonObject = jsonObject + "]}";

	$.ajax({
		type : "POST",
		url : "/surveyView/saveComplaints",
		data : jsonObject,
		dataType : "json",
		contentType : "application/json",
		success : function(id) {
			$("#hidden-survey-id").val(id);
			noty({
				text: "&{'complaints.save.success'}",
				layout: "topRight",
				type: "success"
				});
		},
		error : function(e) {
			noty({
				text: "&{'complaints.save.error'}",
				layout: "topRight",
				type: "error"
			});
		}
	});
};
