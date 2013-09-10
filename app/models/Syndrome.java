package models;

import java.util.List;

import javax.persistence.*;
import play.data.validation.Required;
import play.db.jpa.*;

@Entity
public class Syndrome extends SurveyObject {	
	// @OneToMany(cascade = CascadeType.ALL, mappedBy = "syndrome")
	@OneToMany
	public List<Nosology> nosologies;
}