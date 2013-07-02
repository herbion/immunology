
$(document).ready(function() {
	console.log('init survey complaints add tab');

	$(".radio").each(function() {
		$(this).buttonset();
	});
	
	$("#editComplaintButton").click(function(){
		$("#editComplaintButton").attr("disabled", true);	
	});
});


var saveComplaints = function () {
	var complaintsJSON = {
		surveyId : $("#hidden-survey-id").val(),
		medicineCardId : $("#hidden-med-card-id").val(),
		syndromeId : $("input[name='synd_radio']:checked").attr('value'),
		complaints : []
	};

	$("#survey-info input[type='radio']:checked").each(function() {
		complaintsJSON.complaints.push({
			id : $(this).attr('name'),
			value: $(this).attr('value')
		});
	});

	$.ajax({
		type : "POST",
		url : '@{SurveyView.saveComplaints()}',
		data : JSON.stringify(complaintsJSON),
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
