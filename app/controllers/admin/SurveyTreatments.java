package controllers.admin;

import play.mvc.With;
import controllers.CRUD;
import controllers.Secure;
import controllers.Check;

@With(Secure.class)
@Check("admin")
public class SurveyTreatments extends CRUD {

}
