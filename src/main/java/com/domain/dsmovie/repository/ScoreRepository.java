package com.domain.dsmovie.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.domain.dsmovie.entities.Movie;
import com.domain.dsmovie.entities.Score;

public interface ScoreRepository extends JpaRepository<Score, Long>{
	
	@Query("from Score s WHERE s.movie = ?1")
	public List<Score> findPerMovie(Movie movie);
}
