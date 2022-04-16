package com.domain.dsmovie.resourse;

import java.net.URI;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.domain.dsmovie.entities.User;
import com.domain.dsmovie.service.UserService;

@RestController
@RequestMapping("/users")
public class UserResourse {
	
	@Autowired UserService userService;
	
	@GetMapping
	public ResponseEntity<List<User>> findAll(){
		return ResponseEntity.ok().body(userService.findAll());
	}
		
	@GetMapping("/{id}")
	public ResponseEntity<User> findById(@PathVariable Long id){
		return ResponseEntity.ok().body(userService.findById(id));
	}
	
	@PostMapping
	public ResponseEntity<User> save(@RequestBody User user){
		user = userService.save(user);
		URI uri = ServletUriComponentsBuilder.fromCurrentRequestUri().path("/" + user.getId()).build().toUri();
		return ResponseEntity.created(uri).body(user);
	}
	
	
}
