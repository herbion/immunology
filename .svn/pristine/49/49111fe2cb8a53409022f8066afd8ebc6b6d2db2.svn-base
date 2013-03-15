package models;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Enumerated;
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

import com.immunology.enums.AnalysisType;

@Entity
@Table(name = "nosology_complaint_type")
@SequenceGenerator(name = "nosology_complaint_type_sequence", sequenceName = "nosology_complaint_type_sequence", allocationSize = 1)
public class NosologyComplaintType extends GenericModel {

    @Id
    @Column(name = "nosology_complaint_type_id")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "nosology_complaint_type_sequence")
    public Long Id;

    @Required
    @Column(name = "complaint_type_id")
    public Long complaintTypeId;
    
    @Required
    @Column(name = "multyplier")
    public Double multyplier;
    
    @ManyToOne
    public Nosology nosology;

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((Id == null) ? 0 : Id.hashCode());
		result = prime * result + ((complaintTypeId == null) ? 0 : complaintTypeId.hashCode());
		result = prime * result + ((multyplier == null) ? 0 : multyplier.hashCode());
		result = prime * result + ((nosology == null) ? 0 : nosology.hashCode());
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
		NosologyComplaintType other = (NosologyComplaintType) obj;
		if (Id == null) {
			if (other.Id != null)
				return false;
		} else if (!Id.equals(other.Id))
			return false;
		if (complaintTypeId == null) {
			if (other.complaintTypeId != null)
				return false;
		} else if (!complaintTypeId.equals(other.complaintTypeId))
			return false;
		if (multyplier == null) {
			if (other.multyplier != null)
				return false;
		} else if (!multyplier.equals(other.multyplier))
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
		return "Id=" + Id + ", complaintTypeId=" + complaintTypeId + ", multyplier="
				+ multyplier + "]";
	}
    
}
