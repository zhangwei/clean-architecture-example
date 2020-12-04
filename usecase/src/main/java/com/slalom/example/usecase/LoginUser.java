package com.slalom.example.usecase;

import com.slalom.example.domain.entity.User;
import com.slalom.example.domain.exception.NotAllowedException;
import com.slalom.example.domain.port.PasswordEncoder;
import com.slalom.example.domain.port.UserRepository;

/**
 * The type Login user.
 * @author zhangwei
 */
public final class LoginUser {

	private final UserRepository userRepository;
	private final PasswordEncoder passwordEncoder;

	/**
	 * Instantiates a new Login user.
	 *
	 * @param userRepository  the user repository
	 * @param passwordEncoder the password encoder
	 */
	public LoginUser(final UserRepository userRepository, final PasswordEncoder passwordEncoder) {
		this.userRepository = userRepository;
		this.passwordEncoder = passwordEncoder;
	}

	/**
	 * Login user.
	 *
	 * @param email    the email
	 * @param password the password
	 * @return the user
	 */
	public User login(final String email, final String password) {
		var user = userRepository.findByEmail(email).orElseThrow(() -> new NotAllowedException("Not allowed"));
		var hashedPassword = passwordEncoder.encode(email + password);
		if (!user.getPassword().equals(hashedPassword)) {
			throw new NotAllowedException("Not allowed");
		}
		return user;
	}
}
