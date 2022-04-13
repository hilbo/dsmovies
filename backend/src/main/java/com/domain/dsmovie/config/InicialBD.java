package com.domain.dsmovie.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

import com.domain.dsmovie.entities.Movie;
import com.domain.dsmovie.entities.Score;
import com.domain.dsmovie.entities.User;
import com.domain.dsmovie.repository.MovieRepository;
import com.domain.dsmovie.repository.ScoreRepository;
import com.domain.dsmovie.repository.UserRepository;
import com.domain.dsmovie.service.MovieService;
import com.domain.dsmovie.service.UserService;


@Configuration
public class InicialBD implements CommandLineRunner {
	@Autowired
	private UserRepository userRepository;
	@Autowired
	private MovieRepository movieRepository;
	@Autowired
	private ScoreRepository scoreRepository;
	@Autowired
	private UserService userService;
	@Autowired
	private MovieService movieService;
						
	@Override
	public void run(String... args) throws Exception {
		scoreRepository.deleteAll();
		movieRepository.deleteAll();
		userRepository.deleteAll();
		
		User user01 = new User(null, "hilbo.cardeira@gmail.com");
		User user02 = new User(null, "Irineu.cardeira@gmail.com");
		User user03 = new User(null, "Hugo.cardeira@gmail.com");
		User user04 = new User(null, "lazaro.cardeira@gmail.com");
		for(User usersTmp : Arrays.asList(user01,user02,user03,user04)) {
			userService.save(usersTmp);
		}
				
		Movie movie01 = new Movie(null, "The Spider Man", 0.0, 0, "Imagem Spaider Man");
		Movie movie02 = new Movie(null, "Tropa de Elite", 0.0, 0, "Imagem Tropa de Elite");
		for(Movie movieTmp : Arrays.asList(movie01, movie02)) {
			movieService.save(movieTmp);
		}
				
		Score score01 = new Score(); 
		score01.setUser(user01);
		score01.setMovie(movie01);
		score01.setValue(10.0);
		movie01.setCount(1);
		movie01.setScore(10.0);
		movieService.save(movie01);
		scoreRepository.save(score01);
	}
}
