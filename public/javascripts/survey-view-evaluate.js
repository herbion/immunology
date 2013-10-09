var submitForm = function() {
	console.log('Submiting evaluation results');
	var evaluationRoute = #{jsRoute @SurveyView.postEvaluateResults(':surveyId') /}

	var evaluation = [];
	var answers = $('.quiz-container .question-block select option:selected');
	$.each(answers, function(index, val) {
		var $option = $(val);
		var evaluationChoice = {
			question : {
				id : $option.parent().attr('id'),
			},
			choice: { 
				id: $option.val(), 
				value: $option.text().trim()
			},
		}; 
		evaluation.push(evaluationChoice);
	});

	$.ajax({
      url: evaluationRoute.url({ surveyId: $('.quiz-container .evaluate-form').attr('id') }),
      type: 'POST',
      data: JSON.stringify(evaluation), 
      success: function(data) {
      	noty({
			text: "Дані збережено, reloading",
			layout: "topRight",
			type: "success"
		});
      }
    });
	setTimeout(1000, function () {
		location.reload();
	})
	console.log(JSON.stringify(evaluation));
};