    $(document).ready(function() {
    	var headerImgHeight = 80;
    	var footerHeight = 35;
    	var paddings = 40;
    	var windowHeight = $(window).height() - headerImgHeight - footerHeight - paddings;
    	var contentHeight = $("#crudContent").height();
    	if(contentHeight < windowHeight) {
    		$('#crudContent').height(windowHeight);
    	}
    });