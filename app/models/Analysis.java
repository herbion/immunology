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
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import play.data.validation.Required;
import play.db.jpa.GenericModel;

import com.immunology.enums.AnalysisType;

@Entity
@Table(name = "analysis")
@SequenceGenerator(name = "analysis_sequence", sequenceName = "analysis_sequence", allocationSize = 1)
public class Analysis extends GenericModel {

    @Id
    @Column(name = "analysis_id")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "analysis_sequence")
    public Long analysisId;

    @Required
    @Column(name = "name")
    public String analysisName;
    
    @Column(name = "multyplier")
    public Double multyplier;

    @Required
    @Enumerated
    @Column(name = "type")
    public AnalysisType analysisType;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "analysis")
    public List<AnalysisNorm> analysisNorms;
    
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "analysis")
    public List<AnalysisSubType> analysisSubTypes;

    @ManyToOne
    public Syndrome syndrome;

    @Override
    public int hashCode() {
	final int prime = 31;
	int result = super.hashCode();
	result = prime * result + ((analysisId == null) ? 0 : analysisId.hashCode());
	result = prime * result + ((analysisName == null) ? 0 : analysisName.hashCode());
	result = prime * result + ((analysisType == null) ? 0 : analysisType.hashCode());
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
	Analysis other = (Analysis) obj;
	if (analysisId == null) {
	    if (other.analysisId != null)
		return false;
	} else if (!analysisId.equals(other.analysisId))
	    return false;
	if (analysisName == null) {
	    if (other.analysisName != null)
		return false;
	} else if (!analysisName.equals(other.analysisName))
	    return false;
	if (analysisNorms == null) {
	    if (other.analysisNorms != null)
		return false;
	} else if (!analysisNorms.equals(other.analysisNorms))
	    return false;
	if (analysisType != other.analysisType)
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
	return analysisName;
    }

}
