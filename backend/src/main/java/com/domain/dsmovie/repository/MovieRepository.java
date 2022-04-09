package com.domain.dsmovie.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.domain.dsmovie.entities.Movie;

public interface MovieRepository extends JpaRepository<Movie, Long>{

}
