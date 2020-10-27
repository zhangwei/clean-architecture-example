package com.slalom.example.usecase;

import com.slalom.example.domain.entity.User;
import com.slalom.example.domain.port.UserRepository;
import java.util.List;
import java.util.Optional;

/**
 * The type Find user.
 */
public final class FindUser {

	private final UserRepository repository;

	/**
	 * Instantiates a new Find user.
	 *
	 * @param repository the repository
	 */
	public FindUser(final UserRepository repository) {
		this.repository = repository;
	}

	/**
	 * Find by id optional.
	 *
	 * @param id the id
	 * @return the optional
	 */
	public Optional<User> findById(final String id) {
		return repository.findById(id);
	}

	/**
	 * Find all users list.
	 *
	 * @return the list
	 */
	public List<User> findAllUsers() {
		return repository.findAllUsers();
	}
}
