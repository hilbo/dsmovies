package com.domain.dsmovie.service;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.domain.dsmovie.DTO.ScoreFormDTO;
import com.domain.dsmovie.entities.Movie;
import com.domain.dsmovie.entities.Score;
import com.domain.dsmovie.entities.User;
import com.domain.dsmovie.repository.ScoreRepository;


@Service
public class ScoreService {

	@Autowired
	ScoreRepository scoreRepository;
	
	@Autowired
	UserService userService;
	
	@Autowired
	MovieService movieService;
			
	public List<Score> findAll() {
		return scoreRepository.findAll();
	}
	
	public Score findById(Long id) {
		return scoreRepository.findById(id).get();
	}

	public List<ScoreFormDTO> listScoreDTO() {
		List<ScoreFormDTO> lscore = new ArrayList<>();
		for (Score score : scoreRepository.findAll()) {
			ScoreFormDTO scoreDTO = new ScoreFormDTO();
			scoreDTO.setMovieId(score.getMovie().getId());
			scoreDTO.setUserEmail(score.getUser().getEmail());
			scoreDTO.setValue(score.getValue());
			lscore.add(scoreDTO);
		}
		return lscore;
	}

	public List<Score> scorePerMovie(Long movieId) {
		Movie movie = new Movie();
		movie = movieService.findById(movieId);
		return movie.getScores();
	}

	@Transactional
	public Score save(ScoreFormDTO scoreFormDTO) {
		Score score = new Score();
		
		User user = new User();
		user.setEmail(scoreFormDTO.getUserEmail());
		user = userService.save(user);
		
		score.setUser(user);
		score.setValue(scoreFormDTO.getValue());
		Movie movie = new Movie();
		movie = movieService.findById(scoreFormDTO.getMovieId());
		score.setMovie(movie);
		movieScoreCalc(scoreFormDTO);
				
		return scoreRepository.save(score);
	}

	public Double movieScoreCalc(ScoreFormDTO scorFormDTO) {
		Double calcScore = 0.0;
		Double soma = scorFormDTO.getValue();
		List<Score> scores = new ArrayList<>();

		for (Score score2 : scorePerMovie(scorFormDTO.getMovieId())) {
			soma = soma + score2.getValue();
			scores.add(score2);
		}
		Movie movie = new Movie();
		movie = movieService.findById(scorFormDTO.getMovieId());
		movie.setCount(scores.size() + 1);
		calcScore = soma / (movie.getCount());
		movie.setScore(calcScore);
		movieService.save(movie);

		return calcScore;
	}

	public Score scoreToScoreDTO(ScoreFormDTO scoreDTO) {
		Score score = new Score();
		score.setValue(scoreDTO.getValue());
		Movie movie = new Movie();
		movie.setId(scoreDTO.getMovieId());
		score.setMovie(movie);
		return score;
	}
}
