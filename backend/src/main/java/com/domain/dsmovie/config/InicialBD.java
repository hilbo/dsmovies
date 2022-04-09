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
		User user02 = new User(null, "Irineu.cardeira@gmail.com");
		User user03 = new User(null, "Hugo.cardeira@gmail.com");
		User user04 = new User(null, "lazaro.cardeira@gmail.com");
		userRepository.saveAll(Arrays.asList(user01,user02,user03,user04));
		
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
		
		System.out.println("####################################################");
		System.out.println(score01);
		System.out.println("####################################################");
	}
}
