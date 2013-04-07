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
import javax.persistence.ManyToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import play.data.validation.Required;
import play.db.jpa.GenericModel;

import com.immunology.enums.ClinicalManifestationType;

@Entity
@Table(name = "clinical_manifestation_complaint")
@SequenceGenerator(name = "clinical_manifestation_complaint_sequence", sequenceName = "clinical_manifestation_complaint_sequence", allocationSize = 1)
public class ClinicalManifestationComplaint extends GenericModel {

	@Id
	@Column(name = "clinical_manifestation_complaint_id")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "clinical_manifestation_complaint_sequence")
	public Long clinicalManifestationComplaintId;

	@Required
	@Column(name = "name")
	public String clinicalManifestationComplainName;
	
    @Column(name = "multyplier")
    public Double multyplier;

	@OneToMany(cascade = CascadeType.ALL, mappedBy = "clinicalManifestationComplaint")
	public List<ClinicalManifestation> clinicalManifestations;

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result
				+ ((clinicalManifestationComplainName == null) ? 0 : clinicalManifestationComplainName.hashCode());
		result = prime * result
				+ ((clinicalManifestationComplaintId == null) ? 0 : clinicalManifestationComplaintId.hashCode());
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
		ClinicalManifestationComplaint other = (ClinicalManifestationComplaint) obj;
		if (clinicalManifestationComplainName == null) {
			if (other.clinicalManifestationComplainName != null)
				return false;
		} else if (!clinicalManifestationComplainName.equals(other.clinicalManifestationComplainName))
			return false;
		if (clinicalManifestationComplaintId == null) {
			if (other.clinicalManifestationComplaintId != null)
				return false;
		} else if (!clinicalManifestationComplaintId.equals(other.clinicalManifestationComplaintId))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return clinicalManifestationComplainName;
	}

}
