
$(document).ready(function() {
	$('textarea').addClass("autogrow-short").autogrow();
	
	$(".saved-treatments").each(function() {
		var insertionId = $(this).find(".hidden-insertion-id").val();
		$(this).find(".insertion-select option[value=" + insertionId + "]").attr("selected", "selected");

		var allergenId = $(this).find(".hidden-allergen-id").val();
		$(this).find(".allergen-select option[value=" + allergenId + "]").attr("selected", "selected");
		
		var therapyType = $(this).find(".hidden-therapy-type").val();
		$(this).find(".therapy-type-select option[value=" + therapyType + "]").attr("selected", "selected");
	});

	$("#treatments-info").accordion({ collapsible: true, active: false, header: "h3", autoHeight: false });
});

var updateTreatments = function () {
	var jsonObject = "";
	var surveyId = $("#hidden-survey-id").val();
	var syndromeId = $("#syndrome-select option:selected").val();

	var isEmpty = true;
	
	jsonObject = jsonObject + "{'surveyId':" + surveyId + ",";
	jsonObject = jsonObject + "'syndromeId':" + syndromeId;
	
	$(".treatments").each(function() {
		$checkbox = $(this).find(".treatment-checkbox");
		$multiplicity = $(this).find(".treatment-multiplicity");
		$dose = $(this).find(".treatment-dose");
		$description = $(this).find(".treatment-description");
		$insertionType = $(this).find(".insertion-select option:selected");
		$therapyType = $(this).find(".therapy-type-select option:selected");
		$allegren = $(this).find(".allergen-select option:selected"); 
		var treatmentId = $checkbox.val();
		var insertionId = null;
		var therapy = null;
		var allegrenId = null;
		var multiplicity = null;
		var dose = null;
		var description = null;
		var checked = "false";
		if($checkbox.is(":checked")){
			if(isEmpty){
				jsonObject = jsonObject + ",'treatments':[";
			}
			isEmpty = false;
			checked = "true";
			if($description.val() != "" && $description.val() != undefined) {
				description = "'" + $description.val() + "'";
			}
			if($multiplicity.val() != "" && $multiplicity.val() != undefined) {
				multiplicity = "'" + $multiplicity.val() + "'"; 
			}
			if($dose.val() != "" && $dose.val() != undefined) {
				dose = "'" + $dose.val() + "'"; 
			}
			if($insertionType.val() != 0 && $insertionType.val() != "" && $insertionType.val() != undefined) {
				insertionId = "'" + $insertionType.val() + "'"; 
			}
			if($therapyType.val() != 0 && $therapyType.val() != "" && $therapyType.val() != undefined) {
				therapy = "'" + $therapyType.val() + "'"; 
			}
			if($allegren.val() != 0 && $allegren.val() != "" && $allegren.val() != undefined) {
				allegrenId = "'" + $allegren.val() + "'"; 
			}
			jsonObject = jsonObject + "{'id':" + treatmentId + ",";
			jsonObject = jsonObject + "'insertionId':" + insertionId + ",";
			jsonObject = jsonObject + "'allegrenId':" + allegrenId + ",";
			jsonObject = jsonObject + "'therapy':" + therapy + ",";
			jsonObject = jsonObject + "'isChecked':" + checked + ",";
			jsonObject = jsonObject + "'description':" + description + ",";
			jsonObject = jsonObject + "'dose':" + dose + ",";
			jsonObject = jsonObject + "'multiplicity':" + multiplicity + "},";
		}
	});
	if(!isEmpty){
		jsonObject = jsonObject.substring(0, jsonObject.length - 1);
		jsonObject = jsonObject + "]";
	}
	jsonObject = jsonObject + "}";
	console.log("jsonObject: " + jsonObject);

	$.ajax({
		type : "POST",
		url : "/surveyView/updateTreatments",
		data : jsonObject,
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
