package controllers;

import java.util.HashMap;
import java.util.Map;

import models.User;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import play.i18n.Messages;
import play.mvc.Before;
import play.mvc.Controller;
import play.mvc.With;

@With(Secure.class)
public class UserView extends Controller {

	private static Logger logger = LoggerFactory.getLogger(UserView.class);
	private static User user;
	
	@Before
	public static void isUser() {
		Security.isUser();
	}
	
	public static void showUser() {
		logger.info("showUser(" + user + ")");
		user = User.find("byLogin", Security.connected()).first();
		Map<String, Object> model = new HashMap<String, Object>();
        model.put("user", user);
		renderTemplate(model);
	}
	
	public static void saveUser(User user) throws Exception {
		if (params.get("_cancel") != null) {
			redirect("PatientView.patients");
		}
		logger.info("saveUser(" + user + ")");
		validation.valid(user);
		if (validation.hasErrors()) {
			renderArgs.put("error", Messages.get("crud.hasErrors"));
			render("UserView/showUser.html", user);
		}
		user._save();
		flash.success(Messages.get("user.saved"));
		session.put("username", user.login);
		showUser();
	}
}
