package models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import play.data.validation.Required;
import play.db.jpa.GenericModel;

@Entity
@Table(name = "complaint_detail")
@SequenceGenerator(name = "complaint_detail_sequence", sequenceName = "complaint_detail_sequence", allocationSize = 1)
public class ComplaintDetail extends GenericModel {

	@Id
	@Column(name = "complaint_detail_id")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "complaint_detail_sequence")
	public Long complaintDetailId;

	@Required
	@Column(name = "name")
	public String complaintDetailName;

	@ManyToOne
	public Complaint complaint;

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result
				+ ((complaint == null) ? 0 : complaint.hashCode());
		result = prime
				* result
				+ ((complaintDetailId == null) ? 0 : complaintDetailId
						.hashCode());
		result = prime
				* result
				+ ((complaintDetailName == null) ? 0 : complaintDetailName
						.hashCode());
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
		ComplaintDetail other = (ComplaintDetail) obj;
		if (complaint == null) {
			if (other.complaint != null)
				return false;
		} else if (!complaint.equals(other.complaint))
			return false;
		if (complaintDetailId == null) {
			if (other.complaintDetailId != null)
				return false;
		} else if (!complaintDetailId.equals(other.complaintDetailId))
			return false;
		if (complaintDetailName == null) {
			if (other.complaintDetailName != null)
				return false;
		} else if (!complaintDetailName.equals(other.complaintDetailName))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return complaintDetailName;
	}

}
