package models;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import play.data.validation.Required;
import play.db.jpa.GenericModel;

@Entity
@Table(name = "insertion")
@SequenceGenerator(name = "insertion_sequence", sequenceName = "insertion_sequence", allocationSize = 1)
public class Insertion extends GenericModel {

	@Id
	@Column(name = "insertion_id")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "insertion_sequence")
	public Long insertionId;

	@Required
	@Column(name = "name")
	public String insertionName;

	@ManyToMany(mappedBy = "insertions")
	public List<MedicationDetail> medicationDetails;
}
