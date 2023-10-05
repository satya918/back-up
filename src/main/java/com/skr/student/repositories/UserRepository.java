package com.skr.student.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.skr.student.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

	User findByEmail(String email);

}
