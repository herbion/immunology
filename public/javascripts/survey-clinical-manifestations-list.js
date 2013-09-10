
$(document).ready(function() {
	$("tbody tr").each(function() {
		$(this).removeClass("odd").removeClass("even");
		$(this).find("td").each(function() {
			var link = $(this).find('.hiddenLinks').text();
			$(this).click(function() {
				$(location).attr("href", link);
			});
			$(this).hover(
			  function () {
			    $(this).addClass("hover");
			  },
			  function () {
			    $(this).removeClass("hover");
			  });
		});	
	});
});
