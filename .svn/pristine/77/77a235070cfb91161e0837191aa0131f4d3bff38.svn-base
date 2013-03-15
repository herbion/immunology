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

import play.data.validation.Required;
import play.db.jpa.GenericModel;

@Entity
@Table(name = "analysis_norm")
@SequenceGenerator(name = "analysis_norm_sequence", sequenceName = "analysis_norm_sequence", allocationSize = 1)
public class AnalysisNorm extends GenericModel {

    @Id
    @Column(name = "analysis_norm_id")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "analysis_norm_sequence")
    public Long analysisNormId;

    @Column(name = "min_value")
    public Double minValue;

    @Column(name = "max_value")
    public Double maxValue;

    @Required
    @Column(name = "description")
    public String description;

    @Required
    @Column(name = "update_date")
    public Date updateDate;

    @Required
    @Column(name = "value")
    public Integer value;

    @Column(name = "unit")
    public String unit;

    @ManyToOne
    public Analysis analysis;

    @Override
    public int hashCode() {
	final int prime = 31;
	int result = super.hashCode();
	result = prime * result + ((analysis == null) ? 0 : analysis.hashCode());
	result = prime * result + ((analysisNormId == null) ? 0 : analysisNormId.hashCode());
	result = prime * result + ((description == null) ? 0 : description.hashCode());
	result = prime * result + ((maxValue == null) ? 0 : maxValue.hashCode());
	result = prime * result + ((minValue == null) ? 0 : minValue.hashCode());
	result = prime * result + ((unit == null) ? 0 : unit.hashCode());
	result = prime * result + ((updateDate == null) ? 0 : updateDate.hashCode());
	result = prime * result + ((value == null) ? 0 : value.hashCode());
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
	AnalysisNorm other = (AnalysisNorm) obj;
	if (analysis == null) {
	    if (other.analysis != null)
		return false;
	} else if (!analysis.equals(other.analysis))
	    return false;
	if (analysisNormId == null) {
	    if (other.analysisNormId != null)
		return false;
	} else if (!analysisNormId.equals(other.analysisNormId))
	    return false;
	if (description == null) {
	    if (other.description != null)
		return false;
	} else if (!description.equals(other.description))
	    return false;
	if (maxValue == null) {
	    if (other.maxValue != null)
		return false;
	} else if (!maxValue.equals(other.maxValue))
	    return false;
	if (minValue == null) {
	    if (other.minValue != null)
		return false;
	} else if (!minValue.equals(other.minValue))
	    return false;
	if (unit == null) {
	    if (other.unit != null)
		return false;
	} else if (!unit.equals(other.unit))
	    return false;
	if (updateDate == null) {
	    if (other.updateDate != null)
		return false;
	} else if (!updateDate.equals(other.updateDate))
	    return false;
	if (value == null) {
	    if (other.value != null)
		return false;
	} else if (!value.equals(other.value))
	    return false;
	return true;
    }

    @Override
    public String toString() {
	return analysis.analysisName + ": " + description;
    }

}
