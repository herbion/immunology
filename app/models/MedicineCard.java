package models;

import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import play.data.validation.MaxSize;
import play.data.validation.Required;
import play.db.jpa.GenericModel;

@Entity
@Table(name = "medicine_card")
@SequenceGenerator(name = "medicine_card_sequence", sequenceName = "medicine_card_sequence", allocationSize = 1)
public class MedicineCard extends GenericModel {

    @Id
    @Column(name = "medicine_card_id")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "medicine_card_sequence")
    public Long medicineCardId;

    @Required
    @Column(name = "creation_date")
    public Date creationDate;

    @MaxSize(10000)
    @Column(name = "other_info", length = 10000)
    public String otherInfo;

    @OneToOne(mappedBy = "medicineCard")
    public Patient patient;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "medicineCard")
    public List<Survey> surveys;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "medicineCard")
    public List<MedicineCardAnamnesis> medicineCardAnamneses;
    
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "medicineCard")
    public List<MedicineCardAnamnesisDisease>medicineCardAnamnesisDiseases ;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "medicineCard")
    public List<MedicineCardNosology> medicineCardNosologies;

    @Override
    public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((creationDate == null) ? 0 : creationDate.hashCode());
		result = prime * result + ((medicineCardId == null) ? 0 : medicineCardId.hashCode());
		result = prime * result + ((otherInfo == null) ? 0 : otherInfo.hashCode());
		result = prime * result + ((surveys == null) ? 0 : surveys.hashCode());
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
		MedicineCard other = (MedicineCard) obj;
		if (creationDate == null) {
		    if (other.creationDate != null)
			return false;
		} else if (!creationDate.equals(other.creationDate))
		    return false;
		if (medicineCardAnamneses == null) {
		    if (other.medicineCardAnamneses != null)
			return false;
		} else if (!medicineCardAnamneses.equals(other.medicineCardAnamneses))
		    return false;
		if (medicineCardId == null) {
		    if (other.medicineCardId != null)
			return false;
		} else if (!medicineCardId.equals(other.medicineCardId))
		    return false;
		if (medicineCardNosologies == null) {
		    if (other.medicineCardNosologies != null)
			return false;
		} else if (!medicineCardNosologies.equals(other.medicineCardNosologies))
		    return false;
		if (otherInfo == null) {
		    if (other.otherInfo != null)
			return false;
		} else if (!otherInfo.equals(other.otherInfo))
		    return false;
		if (patient == null) {
		    if (other.patient != null)
			return false;
		} else if (!patient.equals(other.patient))
		    return false;
		if (surveys == null) {
		    if (other.surveys != null)
			return false;
		} else if (!surveys.equals(other.surveys))
		    return false;
		return true;
    }

    @Override
    public String toString() {
		return "MedicineCard/id=" + medicineCardId;
    }

}