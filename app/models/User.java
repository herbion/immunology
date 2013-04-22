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
@Table(name = "users")
@SequenceGenerator(name = "users_sequence", sequenceName = "users_sequence", allocationSize = 1)
public class User extends GenericModel {

	private static final String USER_ROLE = "USER";
	private static final String ADMIN_ROLE = "ADMIN";

	@Id
	@Column(name = "user_id")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "users_sequence")
	public Long userId;

	@Required
	@Column(name = "first_name")
	public String firstName;

	@Required
	@Column(name = "last_name")
	public String lastName;

	@Required
	@Column(name = "middle_name")
	public String middleName;

	@Required
	@Column(name = "login", unique = true)
	public String login;

	@Required
	@Column(name = "password")
	public String password;

	@Required
	@Column(name = "post")
	public String post;

	@OneToMany(cascade = CascadeType.ALL, mappedBy = "user")
	public List<Survey> surveys;

	@ManyToMany
	@JoinTable(name = "users_role", joinColumns = @JoinColumn(name = "user_id", referencedColumnName = "user_id"), inverseJoinColumns = @JoinColumn(name = "role_id", referencedColumnName = "role_id"))
	public List<Role> roles;

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result
				+ ((firstName == null) ? 0 : firstName.hashCode());
		result = prime * result
				+ ((lastName == null) ? 0 : lastName.hashCode());
		result = prime * result + ((login == null) ? 0 : login.hashCode());
		result = prime * result
				+ ((middleName == null) ? 0 : middleName.hashCode());
		result = prime * result
				+ ((password == null) ? 0 : password.hashCode());
		result = prime * result + ((post == null) ? 0 : post.hashCode());
		result = prime * result + ((roles == null) ? 0 : roles.hashCode());
		result = prime * result + ((surveys == null) ? 0 : surveys.hashCode());
		result = prime * result + ((userId == null) ? 0 : userId.hashCode());
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
		User other = (User) obj;
		if (firstName == null) {
			if (other.firstName != null)
				return false;
		} else if (!firstName.equals(other.firstName))
			return false;
		if (lastName == null) {
			if (other.lastName != null)
				return false;
		} else if (!lastName.equals(other.lastName))
			return false;
		if (login == null) {
			if (other.login != null)
				return false;
		} else if (!login.equals(other.login))
			return false;
		if (middleName == null) {
			if (other.middleName != null)
				return false;
		} else if (!middleName.equals(other.middleName))
			return false;
		if (password == null) {
			if (other.password != null)
				return false;
		} else if (!password.equals(other.password))
			return false;
		if (post == null) {
			if (other.post != null)
				return false;
		} else if (!post.equals(other.post))
			return false;
		if (roles == null) {
			if (other.roles != null)
				return false;
		} else if (!roles.equals(other.roles))
			return false;
		if (surveys == null) {
			if (other.surveys != null)
				return false;
		} else if (!surveys.equals(other.surveys))
			return false;
		if (userId == null) {
			if (other.userId != null)
				return false;
		} else if (!userId.equals(other.userId))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return post + ": " + lastName + " " + firstName + " " + middleName;
	}

	public static User connect(String login, String password) {
		return find("byLoginAndPassword", login, password).first();
	}

	// TODO inline isUserRole & isAdminRole in one method
	public boolean isUserRole() {
		for (Role role : roles) {
			if (USER_ROLE.equalsIgnoreCase(role.roleName)) {
				return true;
			}
		}
		return false;
	}

	public boolean isAdminRole() {
		for (Role role : roles) {
			if (ADMIN_ROLE.equalsIgnoreCase(role.roleName)) {
				return true;
			}
		}
		return false;
	}
}
