package com.domain.dsmovie.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.domain.dsmovie.DTO.MovieDTO;
import com.domain.dsmovie.entities.Movie;
import com.domain.dsmovie.repository.MovieRepository;

@Service
public class MovieService {
	
	@Autowired
	MovieRepository movieRepository;
	
	//FindAll com Repository Query ordenado
	public Page<Movie> findAll(Pageable pageable) {
		Page<Movie> movies = movieRepository.findAllOrder(pageable);
		return movies;
	}
			
	public Page<MovieDTO> findAllDTO(Pageable pageable){
		Page<Movie> movies = movieRepository.findAll(pageable);
		Page<MovieDTO> moviesDTO = movies.map(x -> new MovieDTO(x));
		return moviesDTO;
	}
			
	@Transactional
	public Movie save(Movie movie) {
		return movieRepository.save(movie);
	}
	
	public Movie findById(Long id) {
		return movieRepository.findById(id).get();
	}
	
	
		
}
