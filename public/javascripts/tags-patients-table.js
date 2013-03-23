
$(document).ready(function() {
	$('#patientsTable').dataTable({
		"bJQueryUI": true,
		"sPaginationType": "full_numbers",
		"oLanguage": {
            "sUrl": "/public/jquery/dataTable.localize/dataTable." + "${lang}" + ".txt"
        },
        "aoColumns": [
            { },
            { },
            { },
            { },
            { },
            { },
            { },
            { },
            { "bSortable": false },
            { "bSortable": false },
            { "bSortable": false },
        ]
	});
	
	$("tbody tr td").each(function() {
		if($(this).hasClass("tableRow")) {
			$(this).hover(function () {
			    $(this).closest('tr').find('.tableRow').addClass("hover");
			  },
			  function () {
				  $(this).closest('tr').find('.tableRow').removeClass("hover");
			});
			
			$(this).click(function() {
				window.location.href = $(this).closest('tr').find('.showPatientSubmitButton').attr('href');
			});
		}
	});
	
	$('.deletePatientSubmitButton').click(function() {
		if (window.confirm("&{'delete.confirmation'}")) {
			window.location.href = "/patientview/delete?patientId=" + $(this).attr('id');
		};
	});
	
});
