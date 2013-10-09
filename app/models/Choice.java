package models;

import java.util.*;
import javax.persistence.*;
import play.db.jpa.*;
import play.data.validation.*;

@Entity
@Table
public class Choice extends Model {
	@Column
	@Required
	public String value;

	@ManyToOne(cascade = CascadeType.REMOVE)
	public Question question;

	@Override
	public String toString() {
		return value;
	}
} 