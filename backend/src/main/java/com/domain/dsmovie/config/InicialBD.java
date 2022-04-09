package com.domain.dsmovie.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

import com.domain.dsmovie.entities.Movie;
import com.domain.dsmovie.entities.Score;
import com.domain.dsmovie.entities.User;
import com.domain.dsmovie.repository.MovieRepository;
import com.domain.dsmovie.repository.ScoreRepository;
import com.domain.dsmovie.repository.UserRepository;

@Configuration
public class InicialBD implements CommandLineRunner {
	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private MovieRepository movieRepository;
	
	@Autowired
	private ScoreRepository scoreRepository;
	
				
	@Override
	public void run(String... args) throws Exception {
		
		User user01 = new User(null, "hilbo.cardeira@gmail.com");
		userRepository.save(user01);
		
		Movie movie01 = new Movie(null, "The Spider Man", 5.0, 10, "Imagem Spaider Man");
		movieRepository.save(movie01);
		
		Score score01 = new Score();
		score01.setValue(3.0);
		score01.setUser(user01);
		score01.setMovie(movie01);
		scoreRepository.save(score01);
		
		Score score02 = new Score();
		score02.setValue(12.0);
		score02.setUser(user01);
		score02.setMovie(movie01);
		scoreRepository.save(score02);
	}
}
