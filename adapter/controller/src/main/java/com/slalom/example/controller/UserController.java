package com.slalom.example.controller;

import com.slalom.example.controller.model.UserWeb;
import com.slalom.example.usecase.CreateUser;
import com.slalom.example.usecase.FindUser;
import com.slalom.example.usecase.LoginUser;
import java.util.List;
import java.util.stream.Collectors;

/**
 * The type User controller.
 */
public class UserController {

	private final CreateUser createUser;
	private final FindUser findUser;
	private final LoginUser loginUser;

	/**
	 * Instantiates a new User controller.
	 *
	 * @param createUser the create user
	 * @param findUser   the find user
	 * @param loginUser  the login user
	 */
	public UserController(final CreateUser createUser, final FindUser findUser, final LoginUser loginUser) {
		this.createUser = createUser;
		this.findUser = findUser;
		this.loginUser = loginUser;
	}

	/**
	 * Create user user web.
	 *
	 * @param userWeb the user web
	 * @return the user web
	 */
	public UserWeb createUser(final UserWeb userWeb) {
		var user = userWeb.toUser();
		return UserWeb.toUserWeb(createUser.create(user));
	}

	/**
	 * Login user web.
	 *
	 * @param email    the email
	 * @param password the password
	 * @return the user web
	 */
	public UserWeb login(final String email, final String password) {
		return UserWeb.toUserWeb(loginUser.login(email, password));
	}

	/**
	 * Gets user.
	 *
	 * @param userId the user id
	 * @return the user
	 */
	public UserWeb getUser(final String userId) {
		return UserWeb.toUserWeb(findUser.findById(userId).orElseThrow(() -> new RuntimeException("user not found")));
	}

	/**
	 * All users list.
	 *
	 * @return the list
	 */
	public List<UserWeb> allUsers() {
		return findUser.findAllUsers()
			.stream()
			.map(UserWeb::toUserWeb)
			.collect(Collectors.toList());
	}
}
