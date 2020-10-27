package com.slalom.example.db.hazelcast.model;

import com.slalom.example.domain.entity.User;
import java.io.Serializable;

/**
 * The type User db.
 */
public class UserDb implements Serializable {

	private static final long serialVersionUID = 1L;

	private String id;
	private String email;
	private String password;
	private String lastName;
	private String firstName;
	private String role;

	/**
	 * Gets id.
	 *
	 * @return the id
	 */
	public String getId() {
		return id;
	}

	/**
	 * Sets id.
	 *
	 * @param id the id
	 */
	public void setId(final String id) {
		this.id = id;
	}

	/**
	 * Gets email.
	 *
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * Sets email.
	 *
	 * @param email the email
	 */
	public void setEmail(final String email) {
		this.email = email;
	}

	/**
	 * Gets password.
	 *
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * Sets password.
	 *
	 * @param password the password
	 */
	public void setPassword(final String password) {
		this.password = password;
	}

	/**
	 * Gets last name.
	 *
	 * @return the last name
	 */
	public String getLastName() {
		return lastName;
	}

	/**
	 * Sets last name.
	 *
	 * @param lastName the last name
	 */
	public void setLastName(final String lastName) {
		this.lastName = lastName;
	}

	/**
	 * Gets first name.
	 *
	 * @return the first name
	 */
	public String getFirstName() {
		return firstName;
	}

	/**
	 * Sets first name.
	 *
	 * @param firstName the first name
	 */
	public void setFirstName(final String firstName) {
		this.firstName = firstName;
	}

	/**
	 * Gets role.
	 *
	 * @return the role
	 */
	public String getRole() {
		return role;
	}

	/**
	 * Sets role.
	 *
	 * @param role the role
	 */
	public void setRole(final String role) {
		this.role = role;
	}

	/**
	 * To user user.
	 *
	 * @return the user
	 */
	public User toUser() {
		return User.builder()
			.id(id)
			.email(email)
			.password(password)
			.lastName(lastName)
			.firstName(firstName)
			.build();
	}

	/**
	 * From user db.
	 *
	 * @param user the user
	 * @return the user db
	 */
	public static UserDb from(final User user) {
		final UserDb userDb = new UserDb();
		userDb.setId(user.getId());
		userDb.setEmail(user.getEmail());
		userDb.setPassword(user.getPassword());
		userDb.setFirstName(user.getFirstName());
		userDb.setLastName(user.getLastName());
		return userDb;
	}
}
