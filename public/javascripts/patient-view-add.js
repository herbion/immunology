var date;
$(document).ready(function() {
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
	$(datepicker).datepicker('option', $.datepicker.regional['&{currentLanguage}'.length == 0 ? 'en' : '&{currentLanguage}']);
	$(datepicker).datepicker('option', 'dateFormat', 'dd-mm-yy');
	$('#patient_birthday').val(date);
});