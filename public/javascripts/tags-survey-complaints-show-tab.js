

$(document).ready(function() {
	$(".complaintTypeName").each(function(){
		$result = $(this).find(".complaint-type-value");
		var answerSum = 0;
		var maxVal = 0;
		$(this).next().children().each(function(){
			var answerValueText = $(this).find(".answerValue").text();
			answerSum = answerSum + parseFloat(answerValueText);
			if (answerValueText == '1') {
				$(this).find(".answerValue").css('color', '#00FF00').css('font-weight', 'bold');
			} else if (answerValueText == '2') {
				$(this).find(".answerValue").css('color', '#FFCC00').css('font-weight', 'bold');
			} else if (answerValueText == '3') {
				$(this).find(".answerValue").css('color', '#FF0000').css('font-weight', 'bold');
			}
		});
		maxVal = parseInt($(this).find(".hidden-complaint-type-value").val()) * 3;
		var res = 0;
		if(maxVal != 0){
			res = parseFloat(answerSum) / parseFloat(maxVal) * 100;
		}
		$result.text(parseInt(res) + "%");
	});
	
});

