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

import play.data.validation.MaxSize;
import play.data.validation.Required;
import play.db.jpa.GenericModel;

@Entity
@Table(name = "medicine_card_anamnesis_disease")
@SequenceGenerator(name = "medicine_card_anamnesis_disease_sequence", sequenceName = "medicine_card_anamnesis_disease_sequence", allocationSize = 1)
public class MedicineCardAnamnesisDisease extends GenericModel {

	@Id
	@Column(name = "medicine_card_anamnesis_disease_id")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "medicine_card_anamnesis_disease_sequence")
	public Long medicineCardAnamnesisDiseaseId;

	@MaxSize(10000)
	@Column(name = "description", length = 10000)
	public String description;

	@Required
	@Column(name = "value")
	public Double value;

	@Column(name = "begin_date")
	public Date beginDate;

	@Column(name = "end_date")
	public Date endDate;

	@Column(name = "first_manifestation")
	public Date firstManifestation;

	@Column(name = "amount")
	public Integer amount;

	@Column(name = "is_checked")
	public Boolean isChecked;

	@OneToOne
	public AnamnesisDiseaseDetail anamnesisDiseaseDetail;

	@ManyToOne
	public MedicineCard medicineCard;

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((amount == null) ? 0 : amount.hashCode());
		result = prime * result
				+ ((beginDate == null) ? 0 : beginDate.hashCode());
		result = prime * result
				+ ((description == null) ? 0 : description.hashCode());
		result = prime * result + ((endDate == null) ? 0 : endDate.hashCode());
		result = prime
				* result
				+ ((firstManifestation == null) ? 0 : firstManifestation
						.hashCode());
		result = prime
				* result
				+ ((medicineCardAnamnesisDiseaseId == null) ? 0
						: medicineCardAnamnesisDiseaseId.hashCode());
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
		MedicineCardAnamnesisDisease other = (MedicineCardAnamnesisDisease) obj;
		if (amount == null) {
			if (other.amount != null)
				return false;
		} else if (!amount.equals(other.amount))
			return false;
		if (anamnesisDiseaseDetail == null) {
			if (other.anamnesisDiseaseDetail != null)
				return false;
		} else if (!anamnesisDiseaseDetail.equals(other.anamnesisDiseaseDetail))
			return false;
		if (beginDate == null) {
			if (other.beginDate != null)
				return false;
		} else if (!beginDate.equals(other.beginDate))
			return false;
		if (description == null) {
			if (other.description != null)
				return false;
		} else if (!description.equals(other.description))
			return false;
		if (endDate == null) {
			if (other.endDate != null)
				return false;
		} else if (!endDate.equals(other.endDate))
			return false;
		if (firstManifestation == null) {
			if (other.firstManifestation != null)
				return false;
		} else if (!firstManifestation.equals(other.firstManifestation))
			return false;
		if (medicineCard == null) {
			if (other.medicineCard != null)
				return false;
		} else if (!medicineCard.equals(other.medicineCard))
			return false;
		if (medicineCardAnamnesisDiseaseId == null) {
			if (other.medicineCardAnamnesisDiseaseId != null)
				return false;
		} else if (!medicineCardAnamnesisDiseaseId
				.equals(other.medicineCardAnamnesisDiseaseId))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Medicine Card Anamnesis Disease ID: "
				+ medicineCardAnamnesisDiseaseId;
	}

}
