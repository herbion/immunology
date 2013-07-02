package models;

import java.util.List;

import javax.persistence.*;

import play.data.validation.Required;
import play.db.jpa.GenericModel;

import com.immunology.enums.AnalysisType;

@Entity
public class Nosology extends SurveyObject {
    // @OneToMany(mappedBy = "nosology")
    // public List<NosologyComplaintType> nosologyComplaintTypes;
    
    // @OneToMany(mappedBy = "nosology")
    // public List<NosologyClinicalManifestation> nosologyClinicalManifestations;
    
    // @OneToMany(mappedBy = "nosology")
    // public List<NosologyAnalysis> nosologyAnalysis;

    @OneToOne(mappedBy = "nosology")
    public MedicineCardNosology medicineCardNosology;
    
    @ManyToOne
    public Syndrome syndrome;   
}