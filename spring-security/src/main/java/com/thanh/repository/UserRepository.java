package com.thanh.repository;

import org.springframework.data.repository.CrudRepository;

import com.thanh.domain.User;

public interface UserRepository extends CrudRepository<User, Integer> {
	
	User findByEmail(String email);
	
}
