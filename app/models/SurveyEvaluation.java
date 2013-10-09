package models;

import java.util.*;
import javax.persistence.*;
import play.db.jpa.*;
import play.data.validation.*;

@Entity
@Table
public class SurveyEvaluation extends Model {
	public SurveyEvaluation() {

	}

	public SurveyEvaluation(Question question, Choice choice, Survey survey) {
		this.question = question;
		this.choice = choice;
		this.survey = survey;
	}

	@ManyToOne
	public Question question;

	@ManyToOne(cascade = CascadeType.ALL)
	public Choice choice;

	@ManyToOne
	public Survey survey;	
	public String toString() {
		return question + " -> " + choice + " in " + survey;
	}
}