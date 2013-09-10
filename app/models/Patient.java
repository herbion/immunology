package models;

import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import play.Logger;
import play.data.validation.Required;
import play.db.jpa.GenericModel;

import com.immunology.enums.GenderEnum;

@Entity
@Table(name = "patient")
@SequenceGenerator(name = "patient_sequence", sequenceName = "patient_sequence", allocationSize = 1)
public class Patient extends GenericModel {

	@Id
	@Column(name = "patient_id")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "patient_sequence")
	public Long patientId;

	@Required
	@Column(name = "first_name")
	public String firstName;

	@Required
	@Column(name = "middle_name")
	public String middleName;

	@Required
	@Column(name = "last_name")
	public String lastName;

	@Required
	@Enumerated
	@Column(name = "gender")
	public GenderEnum gender;

	@Required
	@Column(name = "birthday")
	public Date birthday;

	@Required
	@Column(name = "country")
	public String country;

	@Column(name = "region")
	public String region;

	@Column(name = "district")
	public String district;

	@Required
	@Column(name = "city")
	public String city;

	@Required
	@Column(name = "street")
	public String street;

	@Required
	@Column(name = "house")
	public String house;

	@Column(name = "flat")
	public Integer flat;

	@OneToOne(cascade = CascadeType.ALL)
	public MedicineCard medicineCard;

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result
				+ ((birthday == null) ? 0 : birthday.hashCode());
		result = prime * result + ((city == null) ? 0 : city.hashCode());
		result = prime * result + ((country == null) ? 0 : country.hashCode());
		result = prime * result
				+ ((district == null) ? 0 : district.hashCode());
		result = prime * result
				+ ((firstName == null) ? 0 : firstName.hashCode());
		result = prime * result + ((flat == null) ? 0 : flat.hashCode());
		result = prime * result + ((gender == null) ? 0 : gender.hashCode());
		result = prime * result + ((house == null) ? 0 : house.hashCode());
		result = prime * result
				+ ((lastName == null) ? 0 : lastName.hashCode());
		result = prime * result
				+ ((middleName == null) ? 0 : middleName.hashCode());
		result = prime * result
				+ ((patientId == null) ? 0 : patientId.hashCode());
		result = prime * result + ((region == null) ? 0 : region.hashCode());
		result = prime * result + ((street == null) ? 0 : street.hashCode());
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
		Patient other = (Patient) obj;
		if (birthday == null) {
			if (other.birthday != null)
				return false;
		} else if (!birthday.equals(other.birthday))
			return false;
		if (city == null) {
			if (other.city != null)
				return false;
		} else if (!city.equals(other.city))
			return false;
		if (country == null) {
			if (other.country != null)
				return false;
		} else if (!country.equals(other.country))
			return false;
		if (district == null) {
			if (other.district != null)
				return false;
		} else if (!district.equals(other.district))
			return false;
		if (firstName == null) {
			if (other.firstName != null)
				return false;
		} else if (!firstName.equals(other.firstName))
			return false;
		if (flat == null) {
			if (other.flat != null)
				return false;
		} else if (!flat.equals(other.flat))
			return false;
		if (gender != other.gender)
			return false;
		if (house == null) {
			if (other.house != null)
				return false;
		} else if (!house.equals(other.house))
			return false;
		if (lastName == null) {
			if (other.lastName != null)
				return false;
		} else if (!lastName.equals(other.lastName))
			return false;
		if (medicineCard == null) {
			if (other.medicineCard != null)
				return false;
		} else if (!medicineCard.equals(other.medicineCard))
			return false;
		if (middleName == null) {
			if (other.middleName != null)
				return false;
		} else if (!middleName.equals(other.middleName))
			return false;
		if (patientId == null) {
			if (other.patientId != null)
				return false;
		} else if (!patientId.equals(other.patientId))
			return false;
		if (region == null) {
			if (other.region != null)
				return false;
		} else if (!region.equals(other.region))
			return false;
		if (street == null) {
			if (other.street != null)
				return false;
		} else if (!street.equals(other.street))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "[" + lastName + " " + firstName + " " + middleName + "]";
	}

	public static List getPatientsByUserId(Long userId) {
		Logger.info("getPatientsByUserId(" + userId + ")");
		List<Patient> result = Patient
				.find("select p from Patient p where p.medicineCard in (select s.medicineCard from Survey s where s.user.userId = ?)",
						userId).fetch();
		Logger.info("getPatientsByUserId result: " + result);
		return result;
	}

}
