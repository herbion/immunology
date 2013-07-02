package controllers.admin;

import play.mvc.With;
import play.mvc.Controller;
import controllers.CRUD;
import controllers.Secure;
import controllers.Check;

@With(Secure.class)
@Check("admin")
public class MainController extends Controller {
	public static void oldIndex() {
		render("CRUD/index.classic.html");
	}
}
