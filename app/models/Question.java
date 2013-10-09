package models;

import java.util.*;
import javax.persistence.*;
import play.db.jpa.*;
import play.data.validation.*;


@Entity
@Table
public class Question extends Model {
	@Column
	@Required
	public String question;
	
	@OneToMany(mappedBy = "question", cascade=CascadeType.ALL, orphanRemoval=true) 
	public List<Choice> choices;

	@Override
	public String toString() {
		return question;
	}

}