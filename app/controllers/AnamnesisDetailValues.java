package controllers;

import play.mvc.Before;
import play.mvc.With;

@With(Secure.class)
public class AnamnesisDetailValues extends CRUD {

	@Before
	public static void isAdmin() {
		Security.isAdmin();
	}
	
}
