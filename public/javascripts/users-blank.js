			        var toggle = function(roleElement) {
			        	var input = document.getElementById('h'+roleElement.id);
			        	if(roleElement.className.indexOf('selected') > -1) {
			        		roleElement.className = 'role';
			        		input.value = '';
			        	} else {
			        		roleElement.className = 'role selected';
			        		input.value = roleElement.id;
			        	}
			        }