package controllers;

import play.i18n.Messages;
import models.User;

public class Security extends Secure.Security {
    static boolean authentify(String username, String password) {
        return User.connect(username, password) != null;
    }

   /*static boolean check(String profile) {
        if ("admin".equals(profile)) {
            return User.find("byLogin", connected()).<User> first().isAdminRole();
        } else {
        	return false;
        }
    }*/

    static void onDisconnected() {
        Application.index();
    }

    static void onAuthenticated() {
        Application.index();
    }
    
    static void isAdmin() {
        User user = User.find("byLogin", Security.connected()).first();
        if (!user.isAdminRole()) {
            renderTemplate("tags/forbidden.html");
        }
    }

	static void isUser() {
		User user = User.find("byLogin", Security.connected()).first();
		if(user != null) {
			if (!user.isUserRole()) {
				renderTemplate("tags/forbidden.html");
			}
		}
	}
}
