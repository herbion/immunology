
    $(function() {
        $("#tabs").tabs();

        $(".radio").each(function() {
            $(this).buttonset();
        });

        $("input[name='synd_radio']").change(function () {
            console.log('Loading reloadComplaintsForNosology ...');
            var selectAction = #{jsAction @reloadComplaintsForNosology(':nosolodyId') /};
            $('#tabs-1').load(selectAction({nosolodyId: $(this).val()}));

            // selectAction = #{jsAction @reloadAnalysis(':nosolodyId') /};
            // $('#tabs-2').load(selectAction({nosolodyId: $(this).val()}));

            // selectAction = #{jsAction @reloadClinicalManifestations(':nosolodyId') /};
            // $('#tabs-3').load(selectAction({nosolodyId: $(this).val()}));

            // selectAction = #{jsAction @reloadTreatments(':nosolodyId') /};
            // $('#tabs-4').load(selectAction({nosolodyId: $(this).val()}));

            // selectAction = #{jsAction @reloadNosology(':nosolodyId') /};
            // $('#tabs-5').load(selectAction({nosolodyId: $(this).val()}));
        });

        var signRightNav = $('<img/>').attr('src', '/public/images/elements/sign-right-nav.gif').addClass('signRightNav');
        var patientAnchor = $('<a></a>').text("${medicineCard.patient.lastName}" + " " +
                        "${medicineCard.patient.firstName}" + " " +
                        "${medicineCard.patient.middleName}")
                .attr('href', '@{PatientView.show(medicineCard.patient.patientId)}');
        $('#breadcrumb').append(signRightNav.clone()).append(patientAnchor);
    });
