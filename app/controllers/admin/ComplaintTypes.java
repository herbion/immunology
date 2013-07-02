package controllers.admin;

import play.mvc.With;
import controllers.CRUD;
import controllers.Secure;
import controllers.Check;
import models.ComplaintType;


@With(Secure.class)
@Check("admin")
public class ComplaintTypes extends CRUD {

}
