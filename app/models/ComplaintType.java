package models;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.ManyToMany;

import play.data.validation.Required;
import play.db.jpa.GenericModel;

@Entity
@Table(name = "complaint_type")
@SequenceGenerator(name = "complaint_type_sequence", sequenceName = "complaint_type_sequence", allocationSize = 1)
public class ComplaintType extends GenericModel {

    @Id
    @Column(name = "complaint_type_id")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "complaint_type_sequence")
    public Long complaintTypeId;

    @Column(name = "multyplier")
    public Double multyplier;

    @Column(name = "name")
    public String complaintTypeName;
    
    @ManyToMany(mappedBy = "complaintTypes")
    public List<Syndrome> syndrome;

    @ManyToMany(mappedBy = "complaintTypes")
    public List<Nosology> nosology;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "complaintType")
    public List<Complaint> complaints;

    @Override
    public int hashCode() {
	final int prime = 31;
	int result = super.hashCode();
	result = prime * result + ((complaintTypeId == null) ? 0 : complaintTypeId.hashCode());
	result = prime * result + ((complaintTypeName == null) ? 0 : complaintTypeName.hashCode());
	result = prime * result + ((complaints == null) ? 0 : complaints.hashCode());
	result = prime * result + ((multyplier == null) ? 0 : multyplier.hashCode());
	result = prime * result + ((syndrome == null) ? 0 : syndrome.hashCode());
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
	ComplaintType other = (ComplaintType) obj;
	if (complaintTypeId == null) {
	    if (other.complaintTypeId != null)
		return false;
	} else if (!complaintTypeId.equals(other.complaintTypeId))
	    return false;
	if (complaintTypeName == null) {
	    if (other.complaintTypeName != null)
		return false;
	} else if (!complaintTypeName.equals(other.complaintTypeName))
	    return false;
	if (complaints == null) {
	    if (other.complaints != null)
		return false;
	} else if (!complaints.equals(other.complaints))
	    return false;
	if (multyplier == null) {
	    if (other.multyplier != null)
		return false;
	} else if (!multyplier.equals(other.multyplier))
	    return false;
	if (syndrome == null) {
	    if (other.syndrome != null)
		return false;
	} else if (!syndrome.equals(other.syndrome))
	    return false;
	return true;
    }

    @Override
    public String toString() {
	return complaintTypeName;
    }

}
