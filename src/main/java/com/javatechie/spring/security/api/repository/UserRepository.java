package com.javatechie.spring.security.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.javatechie.spring.security.api.model.User;

public interface UserRepository extends JpaRepository<User, Integer>{

	User findByUsername(String username);

}
