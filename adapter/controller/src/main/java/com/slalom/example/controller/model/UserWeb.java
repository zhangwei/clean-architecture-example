package com.slalom.example.controller.model;

import com.slalom.example.domain.entity.User;

/**
 * The type User web.
 */
public class UserWeb {
	private String id;
	private String email;
	private String password;
	private String lastName;
	private String firstName;

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
	public void setId(String id) {
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
	public void setEmail(String email) {
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
	public void setPassword(String password) {
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
	public void setLastName(String lastName) {
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
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	/**
	 * To user user.
	 *
	 * @return the user
	 */
	public User toUser() {
		return User.builder()
			.email(email)
			.password(password)
			.lastName(lastName)
			.firstName(firstName)
			.build();
	}

	/**
	 * To user web user web.
	 *
	 * @param user the user
	 * @return the user web
	 */
	public static UserWeb toUserWeb(final User user) {
		var userWeb = new UserWeb();
		userWeb.setId(user.getId());
		userWeb.setEmail(user.getEmail());
		// do not map password
		userWeb.setLastName(user.getLastName());
		userWeb.setFirstName(user.getFirstName());
		return userWeb;
	}
}
