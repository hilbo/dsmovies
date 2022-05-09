package com.domain.dsmovie.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.domain.dsmovie.entities.User;
import com.domain.dsmovie.repository.UserRepository;

@Service
public class UserService {
	
	@Autowired
	UserRepository userRepository;
	
	public List<User> findAll() {
		return userRepository.findAll();
	}
	
	public User findById(Long id) {
		return userRepository.findById(id).get();
	}
	
	public User findByEmail(String email) {
		return userRepository.findByEmail(email);
	}
	
	@Transactional
	public User save(User user) {
		if (findByEmail(user.getEmail()) == null) {
			return userRepository.saveAndFlush(user);
		} else {
			return findByEmail(user.getEmail());
		}
	}
	
	
}
