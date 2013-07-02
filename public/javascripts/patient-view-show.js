var date;
$(document).ready(function() {
	$("#tabs").tabs();

	$('#medicineCard_otherInfo').addClass("autogrow-short").autogrow();

	var signRightNav = $('<img/>').attr('src', '/public/images/elements/sign-right-nav.gif').addClass('signRightNav');
	var patientAnchor = $('<a></a>').text("${patient.lastName}" + " " +
			  							  "${patient.firstName}" + " " +
										  "${patient.middleName}")
									.attr('href', '@{PatientView.show(patient.patientId)}');

	$('#breadcrumb').append(signRightNav).append(patientAnchor);

	date = $('#patient_birthday').val();
	var datepicker = '#patient_birthday';
	$.datepicker.setDefaults($.extend({
		minDate: new Date(1900,0,1),
		maxDate: new Date(),
		yearRange: '1900:+00',
		changeMonth: true,
		changeYear: true},
		$.datepicker.regional['']));
	$(datepicker).datepicker();
	%{
		currentLanguage = play.i18n.Lang.get();
	}%
	$(datepicker).datepicker('option', $.datepicker.regional['&{currentLanguage}'.lenght == 0 ? 'en' : '&{currentLanguage}']);
	$(datepicker).datepicker('option', 'dateFormat', 'dd-mm-yy');
	$('#patient_birthday').val(date);

	setCheckboxChecked();

	addCheckboxClickListener();

});

var setCheckboxChecked = function () {
	var id = null;
	$hidden = null;
	$(".anamnesis-checkbox").each(function() {
		$hidden = $(this).prev(".hidden-id");
		if($hidden != undefined){
			id = $hidden.val();
		}
		if(id != null){
			$(this).attr("checked", true);
			$select = $(this).parent().find(".anamnesisSelect");
			if($select != undefined){
				$(this).parent().find(".anamnesisSelect option[value=" + id + "]").attr("selected", "selected");
			} 
			setEnabled($(this).parent().find(".anamnesis-description"));			
		}else{
			setDisabled($(this).parent().find(".anamnesisSelect"));
		}
	});
}

var addCheckboxClickListener = function () {
	$(".anamnesis-checkbox").click(function () {
		if($(this).is(":checked")) {
			setEnabled($(this).nextAll(".anamnesis-description:first"));
			setEnabled($(this).parent().find(".anamnesisSelect"));
		} else {
			setDisabled($(this).nextAll(".anamnesis-description:first"));
			setDisabled($(this).parent().find(".anamnesisSelect"));
		}		
	});
}

var setEnabled = function (element) {
	$(element).removeAttr('disabled');
	$(element).closest('.anamnesis').find('.anamnesisTypeName').css('background', '#FF8732');
}

var setDisabled = function (element) {
	$(element).attr('disabled', 'disabled');
	var isAnyChecked = false;
	$(element).closest(".anamnesis").find(".anamnesis-checkbox").each(function(){
		if($(this).is(":checked")){
			isAnyChecked = true;
		}
	});
	if(!isAnyChecked){
		$(element).closest('.anamnesis').find('.anamnesisTypeName').css('background', '#2191C0');
	}
}

var saveMedicineCard = function () {
	var jsonObject = "";
	var surveyId = $("#hidden-survey-id").val();
	var medicineCardId = $("#hidden-med-card-id").val();
	var medicineCardInfo = null;

	if($("#medicineCard_otherInfo").val() != "" && $("#medicineCard_otherInfo").val() != undefined) {
		medicineCardInfo = "'" + $("#medicineCard_otherInfo").val() + "'";
	}

	jsonObject = jsonObject + "{'medicineCardId':" + medicineCardId + ",";
	jsonObject = jsonObject + "'medicineCardInfo':" + medicineCardInfo + ",";
	jsonObject = jsonObject + "'anamneses':[";

	$(".anamnesis-checkbox:not(.desease)").each(function() {
		var id = null;
		var checked = "false";
		var description = null;

		id = $(this).val();
		if(id == undefined || id == ""){
			id = $(this).parent().find(".anamnesisSelect option:selected").val();
		}
		if($(this).is(":checked")){
			checked = "true";
			description = "'" + $(this).nextAll(".anamnesis-description:first").val() + "'";
			if(description == "" || description == undefined) {
				description = null;
			} 
		}
		jsonObject = jsonObject + "{'id':" + id + ",";
		jsonObject = jsonObject + "'isChecked':" + checked + ",";
		jsonObject = jsonObject + "'description':" + description + "},";
	});
	jsonObject = jsonObject.substring(0, jsonObject.length - 1);
	jsonObject = jsonObject + "],";

	jsonObject = jsonObject + "'anamnesisDeseases':[";
	$(".desease").each(function() {
		var id = null;
		var checked = "false";
		var description = null;

		id = $(this).val();
		if(id == undefined || id == ""){
			id = $(this).parent().find(".anamnesisSelect option:selected").val();
		}
		if($(this).is(":checked")){
			checked = "true";
			description = "'" + $(this).nextAll(".anamnesis-description:first").val() + "'";
			if(description == "" || description == undefined) {
				description = null;
			} 
		}
		jsonObject = jsonObject + "{'id':" + id + ",";
		jsonObject = jsonObject + "'isChecked':" + checked + ",";
		jsonObject = jsonObject + "'description':" + description + "},";
	});
	jsonObject = jsonObject.substring(0, jsonObject.length - 1);
	jsonObject = jsonObject + "]}";

	$.ajax({
		type : "POST",
		url : "/medicineCardView/saveMedicineCard",
		data : jsonObject,
		dataType : "json",
		contentType : "application/json",
		success : function(id) {
			noty({
				text: "&{'anamnesis.save.success'}",
				layout: "topRight",
				type: "success"
			});
		},
		error : function(e){
			noty({
				text: "&{'anamnesis.save.error'}",
				layout: "topRight",
				type: "error"
			});
		}
	});
}