

$(document).ready(function() {
	var id = $(".nosology").find(".hidden-id").val();
	if(id != 0 && id != "" && id != undefined){
		$(".nosology").find(".nosologiesSelect option[value=" + id + "]").attr("selected", "selected");
	}
});

var updateNosology = function () {
	var jsonObject = "";
	var surveyId = $("#hidden-survey-id").val();
	var medicineCardId = $("#hidden-med-card-id").val();
	var syndromeId = $("input[name='synd_radio']:checked").attr('value');
	var id = $(".nosologiesSelect option:selected").val();
	if(id == 0 || id == "" || id == undefined){
		id = null;
	}

	jsonObject = jsonObject + "{'surveyId':" + surveyId + ",";
	jsonObject = jsonObject + "'syndromeId':" + syndromeId + ",";
	jsonObject = jsonObject + "'nosologyId':" + id + "}";

	console.log(jsonObject );
	
	$.ajax({
		type : "POST",
		url : "/surveyView/updateNosology",
		data : jsonObject,
		dataType : "json",
		contentType : "application/json",
		success : function(id) {
			$("#hidden-survey-id").val(id);
			noty({
				text: "&{'nosology.save.success'}",
				layout: "topRight",
				type: "success"
			});
		},
		error : function(e) {
			noty({
				text: "&{'nosology.save.error'}",
				layout: "topRight",
				type: "error"
			});
		}
	});
}
