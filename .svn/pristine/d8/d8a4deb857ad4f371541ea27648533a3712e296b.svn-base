package models;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import play.data.validation.MaxSize;
import play.db.jpa.GenericModel;

@Entity
@Table(name = "medicine_card_nosology")
@SequenceGenerator(name = "medicine_card_nosology_sequence", sequenceName = "medicine_card_nosology_sequence", allocationSize = 1)
public class MedicineCardNosology extends GenericModel {

    @Id
    @Column(name = "medicine_card_nosology_id")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "medicine_card_nosology_sequence")
    public Long medicineCardNosologyId;

    @MaxSize(10000)
    @Column(name = "description", length = 10000)
    public String description;

    @Column(name = "begin_date")
    public Date beginDate;

    @Column(name = "end_date")
    public Date endDate;

    @Column(name = "active")
    public Boolean active;

    @OneToOne
    public Nosology nosology;

    @ManyToOne
    public MedicineCard medicineCard;

    @Override
    public int hashCode() {
	final int prime = 31;
	int result = super.hashCode();
	result = prime * result + ((active == null) ? 0 : active.hashCode());
	result = prime * result + ((beginDate == null) ? 0 : beginDate.hashCode());
	result = prime * result + ((description == null) ? 0 : description.hashCode());
	result = prime * result + ((endDate == null) ? 0 : endDate.hashCode());
	result = prime * result + ((medicineCardNosologyId == null) ? 0 : medicineCardNosologyId.hashCode());
	return result;
    }

    @Override
    public boolean equals(Object obj) {
	if (this == obj)
	    return true;
	if (!super.equals(obj))
	    return false;
	if (getClass() != obj.getClass())
	    return false;
	MedicineCardNosology other = (MedicineCardNosology) obj;
	if (active == null) {
	    if (other.active != null)
		return false;
	} else if (!active.equals(other.active))
	    return false;
	if (beginDate == null) {
	    if (other.beginDate != null)
		return false;
	} else if (!beginDate.equals(other.beginDate))
	    return false;
	if (description == null) {
	    if (other.description != null)
		return false;
	} else if (!description.equals(other.description))
	    return false;
	if (endDate == null) {
	    if (other.endDate != null)
		return false;
	} else if (!endDate.equals(other.endDate))
	    return false;
	if (medicineCard == null) {
	    if (other.medicineCard != null)
		return false;
	} else if (!medicineCard.equals(other.medicineCard))
	    return false;
	if (medicineCardNosologyId == null) {
	    if (other.medicineCardNosologyId != null)
		return false;
	} else if (!medicineCardNosologyId.equals(other.medicineCardNosologyId))
	    return false;
	if (nosology == null) {
	    if (other.nosology != null)
		return false;
	} else if (!nosology.equals(other.nosology))
	    return false;
	return true;
    }

    @Override
    public String toString() {
	return "MedicineCardNosology ID: " + medicineCardNosologyId;
    }

}
