$(document).ready(function() {
	var beginDate = $('#object_beginDate').val();
	var datepicker = '#object_beginDate';
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
	$('#object_beginDate').val(beginDate);

	var endDate = $('#object_endDate').val();
	var endDatePicker = '#object_endDate';
	$(endDatePicker).datepicker();
	$(endDatePicker).datepicker('option', $.datepicker.regional['&{currentLanguage}'.lenght == 0 ? 'en' : '&{currentLanguage}']);
	$(endDatePicker).datepicker('option', 'dateFormat', 'dd-mm-yy');
	$('#object_endDate').val(endDate);

	var firstManifestationDate = $('#object_firstManifestation').val();
	var firstManifestationDatePicker = '#object_firstManifestation';
	$(firstManifestationDatePicker).datepicker();
	$(firstManifestationDatePicker).datepicker('option', $.datepicker.regional['&{currentLanguage}'.lenght == 0 ? 'en' : '&{currentLanguage}']);
	$(firstManifestationDatePicker).datepicker('option', 'dateFormat', 'dd-mm-yy');
	$('#object_firstManifestation').val(firstManifestationDate);
});