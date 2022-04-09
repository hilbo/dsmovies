package com.domain.dsmovie.resourse;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.domain.dsmovie.entities.Movie;
import com.domain.dsmovie.service.MovieService;

@RestController
@RequestMapping("/movies")
public class MovieResourse {
	
	@Autowired MovieService movieService;
	
	@GetMapping
	public ResponseEntity<List<Movie>> findAll(){
		return ResponseEntity.ok().body(movieService.findAll());
	}
}
