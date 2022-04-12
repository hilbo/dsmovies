package com.domain.dsmovie.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.domain.dsmovie.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{
	
	public User findByEmail(String userEmail);

}
