package com.test.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.test.entity.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

	Optional<User> findUserByEmail(String email);

	User findByEmail(String email);

	boolean existsByEmail(String email);

}
