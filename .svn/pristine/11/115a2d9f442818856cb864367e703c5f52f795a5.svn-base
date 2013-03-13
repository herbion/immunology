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
@Table(name = "nosology")
@SequenceGenerator(name = "nosology_sequence", sequenceName = "nosology_sequence", allocationSize = 1)
public class Nosology extends GenericModel {

    @Id
    @Column(name = "nosology_id")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "nosology_sequence")
    public Long nosologyId;

    @Required
    @Column(name = "name")
    public String nosologyName;
    
    @OneToMany(mappedBy = "nosology")
    public List<NosologyComplaintType>nosologyComplaintTypes;
    
    @OneToMany(mappedBy = "nosology")
    public List<NosologyClinicalManifestation>nosologyClinicalManifestations;
    
    @OneToMany(mappedBy = "nosology")
    public List<NosologyAnalysis>nosologyAnalysis;

    @OneToOne(mappedBy = "nosology")
    public MedicineCardNosology medicineCardNosology;
    
    @ManyToOne
    public Syndrome syndrome;

    @Override
    public int hashCode() {
	final int prime = 31;
	int result = super.hashCode();
	result = prime * result + ((nosologyId == null) ? 0 : nosologyId.hashCode());
	result = prime * result + ((nosologyName == null) ? 0 : nosologyName.hashCode());
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
	Nosology other = (Nosology) obj;
	if (medicineCardNosology == null) {
	    if (other.medicineCardNosology != null)
		return false;
	} else if (!medicineCardNosology.equals(other.medicineCardNosology))
	    return false;
	if (nosologyId == null) {
	    if (other.nosologyId != null)
		return false;
	} else if (!nosologyId.equals(other.nosologyId))
	    return false;
	if (nosologyName == null) {
	    if (other.nosologyName != null)
		return false;
	} else if (!nosologyName.equals(other.nosologyName))
	    return false;
	return true;
    }

    @Override
    public String toString() {
	return nosologyName;
    }

    
}
