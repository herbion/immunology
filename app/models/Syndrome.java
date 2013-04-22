package models;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import play.data.validation.Required;
import play.db.jpa.GenericModel;

@Entity
@Table(name = "syndrome")
@SequenceGenerator(name = "syndrome_sequence", sequenceName = "syndrome_sequence", allocationSize = 1)
public class Syndrome extends GenericModel {

	@Id
	@Column(name = "syndrome_id")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "syndrome_sequence")
	public Long syndromeId;

	@Required
	@Column(name = "name")
	public String name;

	@Column
	@ManyToMany
	@JoinTable(name = "syndrome_complaint_type", joinColumns = @JoinColumn(name = "syndrome_id", referencedColumnName = "syndrome_id"), inverseJoinColumns = @JoinColumn(name = "complaint_type_id", referencedColumnName = "complaint_type_id"))
	public List<ComplaintType> complaintTypes;

	@Column
	@ManyToMany
	@JoinTable(name = "syndrome_analysis", joinColumns = @JoinColumn(name = "syndrome_id", referencedColumnName = "syndrome_id"), inverseJoinColumns = @JoinColumn(name = "analysis_id", referencedColumnName = "analysis_id"))
	public List<Analysis> analyzes;

	@Column
	@ManyToMany
	@JoinTable(name = "syndrome_clinical_manifestation_complaint", joinColumns = @JoinColumn(name = "syndrome_id", referencedColumnName = "syndrome_id"), inverseJoinColumns = @JoinColumn(name = "clinical_manifestation_complaint_id", referencedColumnName = "clinical_manifestation_complaint_id"))
	public List<ClinicalManifestationComplaint> clinicalManifestationComplaints;

	@Column
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "syndrome")
	public List<Anamnesis> anamnezes;

	@OneToMany(cascade = CascadeType.ALL, mappedBy = "syndrome")
	public List<AnamnesisDisease> anamnesisDiseases;

	@OneToMany(cascade = CascadeType.ALL, mappedBy = "syndrome")
	public List<Nosology> nosologies;

	@OneToMany(cascade = CascadeType.ALL, mappedBy = "syndrome")
	public List<TreatmentType> treatmentTypes;

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result
				+ ((analyzes == null) ? 0 : analyzes.hashCode());
		result = prime * result
				+ ((anamnezes == null) ? 0 : anamnezes.hashCode());
		result = prime
				* result
				+ ((clinicalManifestationComplaints == null) ? 0
						: clinicalManifestationComplaints.hashCode());
		result = prime * result
				+ ((complaintTypes == null) ? 0 : complaintTypes.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result
				+ ((syndromeId == null) ? 0 : syndromeId.hashCode());
		result = prime * result
				+ ((treatmentTypes == null) ? 0 : treatmentTypes.hashCode());
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
		Syndrome other = (Syndrome) obj;
		if (analyzes == null) {
			if (other.analyzes != null)
				return false;
		} else if (!analyzes.equals(other.analyzes))
			return false;
		if (anamnezes == null) {
			if (other.anamnezes != null)
				return false;
		} else if (!anamnezes.equals(other.anamnezes))
			return false;
		if (clinicalManifestationComplaints == null) {
			if (other.clinicalManifestationComplaints != null)
				return false;
		} else if (!clinicalManifestationComplaints
				.equals(other.clinicalManifestationComplaints))
			return false;
		if (complaintTypes == null) {
			if (other.complaintTypes != null)
				return false;
		} else if (!complaintTypes.equals(other.complaintTypes))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (syndromeId == null) {
			if (other.syndromeId != null)
				return false;
		} else if (!syndromeId.equals(other.syndromeId))
			return false;
		if (treatmentTypes == null) {
			if (other.treatmentTypes != null)
				return false;
		} else if (!treatmentTypes.equals(other.treatmentTypes))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return name;
	}

}
