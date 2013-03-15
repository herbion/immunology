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
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import play.data.validation.Required;
import play.db.jpa.GenericModel;

@Entity
@Table(name = "complaint")
@SequenceGenerator(name = "complaint_sequence", sequenceName = "complaint_sequence", allocationSize = 1)
public class Complaint extends GenericModel {

    @Id
    @Column(name = "complaint_id")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "complaint_sequence")
    public Long complaintId;

    @Required
    @Column(name = "name")
    public String complaintName;

    @ManyToOne
    public ComplaintType complaintType;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "complaint")
    public List<ComplaintDetail> complaintDetails;

    @Override
    public int hashCode() {
	final int prime = 31;
	int result = super.hashCode();
	result = prime * result + ((complaintId == null) ? 0 : complaintId.hashCode());
	result = prime * result + ((complaintName == null) ? 0 : complaintName.hashCode());
	result = prime * result + ((complaintType == null) ? 0 : complaintType.hashCode());
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
	Complaint other = (Complaint) obj;
	if (complaintDetails == null) {
	    if (other.complaintDetails != null)
		return false;
	} else if (!complaintDetails.equals(other.complaintDetails))
	    return false;
	if (complaintId == null) {
	    if (other.complaintId != null)
		return false;
	} else if (!complaintId.equals(other.complaintId))
	    return false;
	if (complaintName == null) {
	    if (other.complaintName != null)
		return false;
	} else if (!complaintName.equals(other.complaintName))
	    return false;
	if (complaintType == null) {
	    if (other.complaintType != null)
		return false;
	} else if (!complaintType.equals(other.complaintType))
	    return false;
	return true;
    }

    @Override
    public String toString() {
	return complaintName;
    }

}
