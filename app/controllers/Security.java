package controllers;

import models.Role;
import models.User;

public class Security extends Secure.Security {
	public static boolean authenticate(String username, String password) {
		User user = User.find("byLogin", username).first();
		return user != null && user.password.equals(password);
	}

	public static boolean check(String profile) {
		User user = User.find("byLogin", Security.connected()).first();

		for (Role role : user.roles) {
			if (role.roleName.equalsIgnoreCase(profile)) {
				return true;
			}
		}
		return false;
	}

	public static void onDisconnected() {
		Application.index();
	}

	public static void onAuthenticated() {
		Application.index();
	}
}
