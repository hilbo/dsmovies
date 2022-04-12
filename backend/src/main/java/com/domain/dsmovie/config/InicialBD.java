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
		
		Movie movie01 = new Movie(null, "The Spider Man", 0.0, 0, "Imagem Spaider Man");
		Movie movie02 = new Movie(null, "Tropa de Elite", 0.0, 0, "Imagem Tropa de Elite");
		movieRepository.saveAll(Arrays.asList(movie01, movie02));
				
		Score score01 = new Score();
		//ScoreService ss = new ScoreService();
		score01.setUser(user01);
		score01.setMovie(movie01);
		score01.setValue(10.0);
		movie01.setCount(1);
		movie01.setScore(10.0);
		//movie01.setScore(ss.score(movie01.getScore(), score01.getValue()));
		//movie01.setCount(ss.movieScoreCount(movie01.getId()));
		//movie01.setCount(ss.movieScoreCalc(score01, scoreRepository));
		movieRepository.save(movie01);
		scoreRepository.save(score01);
		
		
						
		System.out.println("####################################################");
		//System.out.println(score01);
		//System.out.println(score02);
		
		
		
		System.out.println("####################################################");
		
	}
}
