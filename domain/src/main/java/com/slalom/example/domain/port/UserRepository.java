package com.slalom.example.domain.port;

import com.slalom.example.domain.entity.User;
import java.util.List;
import java.util.Optional;

/**
 * The interface User repository.
 * @author zhangwei
 */
public interface UserRepository {

	/**
	 * Create user.
	 *
	 * @param user the user
	 * @return the user
	 */
	User create(User user);

	/**
	 * Find by id optional.
	 *
	 * @param id the id
	 * @return the optional
	 */
	Optional<User> findById(String id);

	/**
	 * Find by email optional.
	 *
	 * @param email the email
	 * @return the optional
	 */
	Optional<User> findByEmail(String email);

	/**
	 * Find all users list.
	 *
	 * @return the list
	 */
	List<User> findAllUsers();
}
