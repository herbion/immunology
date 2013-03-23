

	$(document).ready(function() {
		$("#difficulty-degree-button").click(function(){
			loadDifficultyDegreeData();
		});
		
		$("#insufficiency-degree-button").click(function(){
			loadInsufficiencyDegreeData();
		});
	});
	
	var loadDifficultyDegreeData = function(){
		$.ajax({
			type : "POST",
			url : "/chartController/getDifficultyDegreeData",
			data : "${patient.patientId}",
			dataType : "text",
			success : function(data) {
				var array = convertDataToArray(data);
				drawChart('difficulty-degree-chart', "&{'difficultyDegree'}", array);
			},
			error : function(e) {
				noty({
					text: "&{'chart.data.error'}",
					layout: "topRight",
					type: "error"
				});
			}
		});
	}

	var loadInsufficiencyDegreeData = function(){
		$.ajax({
			type : "POST",
			url : "/chartController/getInsufficiencyDegreeData",
			data : "${patient.patientId}",
			dataType : "text",
			success : function(data) {
				var array = convertDataToArray(data);
				drawChart('insufficiency-degree-chart', "&{'insufficiencyDegree'}", array);
			},
			error : function(e) {
				noty({
					text: "&{'chart.data.error'}",
					layout: "topRight",
					type: "error"
				});
			}
		});
	}

	var convertDataToArray = function(data) {
		var itemArray = data.split(";");
		var array = [];
		for(var i = 0; i < itemArray.length; i++) {
			var temp = itemArray[i].split(",");
			var tempArray = [];
			tempArray[0] = temp[0];
			tempArray[1] = parseInt(temp[1]);
			array.push(tempArray);
		}
		return array;		
	}
	
	var drawChart = function(plot, title, line) {
		var plot1 = $.jqplot(plot, [line], {
			title: title,
			axes:{
				xaxis:{
					label: "&{'chart.date'}",
					renderer:$.jqplot.DateAxisRenderer,
					tickOptions:{
						formatString:'%d/%m/%y',
						angel: 45 
					}
				},
				yaxis:{
					label: "&{'chart.degree'}",
					min:0,
					max:100,
					tickInterval: 20,
					tickOptions:{
						formatString:'%s%'
					}
				}
			},
			highlighter: {
				show: true,
				sizeAdjust: 10.0
			},
			cursor: {
				show: false
			}
		});
	}

