package com.domain.dsmovie.service;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.domain.dsmovie.DTO.ScoreDTO;
import com.domain.dsmovie.entities.Movie;
import com.domain.dsmovie.entities.Score;
import com.domain.dsmovie.entities.User;
import com.domain.dsmovie.repository.MovieRepository;
import com.domain.dsmovie.repository.ScoreRepository;
import com.domain.dsmovie.repository.UserRepository;

@Service
public class ScoreService {

	@Autowired
	ScoreRepository scoreRepository;

	@Autowired
	MovieRepository movieRepository;

	@Autowired
	UserRepository userRepository;

	public List<Score> findAll() {
		return scoreRepository.findAll();
	}

	public List<ScoreDTO> listScoreDTO() {
		List<ScoreDTO> lscore = new ArrayList<>();
		for (Score score : scoreRepository.findAll()) {
			ScoreDTO scoreDTO = new ScoreDTO();
			scoreDTO.setMovieId(score.getMovie().getId());
			scoreDTO.setUserEmail(score.getUser().getEmail());
			scoreDTO.setValue(score.getValue());
			lscore.add(scoreDTO);
		}
		return lscore;
	}

	public List<Score> scorePerMovie(Long movieId) {
		Movie movie = new Movie();
		movie = movieRepository.findById(movieId).get();
		return movie.getScores();
	}

	@Transactional
	public Score save(ScoreDTO scoreDTO) {
		Score score = new Score();
		User user = new User();
		user = userRepository.findByEmail(scoreDTO.getUserEmail());
		if (user == null) {
			User user2 = new User();
			user2.setEmail(scoreDTO.getUserEmail());
			userRepository.save(user2);
			score.setUser(user2);

		} else {
			user.setEmail(scoreDTO.getUserEmail());
			score.setUser(user);
		}
		score.setValue(scoreDTO.getValue());
		Movie movie = new Movie();
		movie = movieRepository.findById(scoreDTO.getMovieId()).get();
		score.setMovie(movie);
		movieScoreCalc(scoreDTO);
		return scoreRepository.save(score);
	}

	@Transactional
	public Double movieScoreCalc(ScoreDTO scoreDTO) {
		Double calcScore = 0.0;
		Double soma = scoreDTO.getValue();
		List<Score> scores = new ArrayList<>();

		for (Score score2 : scorePerMovie(scoreDTO.getMovieId())) {
			soma = soma + score2.getValue();
			scores.add(score2);
		}
		Movie movie = new Movie();
		movie = movieRepository.findById(scoreDTO.getMovieId()).get();
		movie.setCount(scores.size() + 1);
		calcScore = soma / (movie.getCount());
		movie.setScore(calcScore);
		movieRepository.save(movie);

		return calcScore;
	}

	public Score scoreToScoreDTO(ScoreDTO scoreDTO) {
		Score score = new Score();
		score.setValue(scoreDTO.getValue());
		Movie movie = new Movie();
		movie.setId(scoreDTO.getMovieId());
		score.setMovie(movie);
		return score;
	}
}
