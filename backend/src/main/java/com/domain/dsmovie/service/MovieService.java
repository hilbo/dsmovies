package com.domain.dsmovie.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.domain.dsmovie.entities.Movie;
import com.domain.dsmovie.repository.MovieRepository;

@Service
public class MovieService {
	
	@Autowired
	MovieRepository movieRepository;
	
	public List<Movie> findAll() {
		return movieRepository.findAll();
	}
	
	@Transactional
	public Movie save(Movie movie) {
		return movieRepository.save(movie);
	}
	
	public Movie findById(Long id) {
		return movieRepository.findById(id).get();
	}
		
}
