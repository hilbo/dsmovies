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
				
		Movie movie01 = new Movie(null, "Batman", 0.0, 0, "https://i1.wp.com/www.themoviedb.org/t/p/w342/cKNxg77ll8caX3LulREep4C24Vx.jpg?resize=250%2C370&ssl=1");
		Movie movie02 = new Movie(null, "Helo", 0.0, 0, "https://i1.wp.com/image.tmdb.org/t/p/w342/nJUHX3XL1jMkk8honUZnUmudFb9.jpg?resize=250%2C370&ssl=1");
		Movie movie03 = new Movie(null, "Cavaleiro da Lua", 0.0, 0, "https://i1.wp.com/image.tmdb.org/t/p/w342/7LMSllDXEVBBwY7yQop2CY0AW7I.jpg?resize=250%2C370&ssl=1");
		Movie movie04 = new Movie(null, "Animais Fantásticos", 0.0, 0, "https://i0.wp.com/image.tmdb.org/t/p/w342/u1XrqlIjQt2ghnA8nprpPiFzSzR.jpg?resize=250%2C370&ssl=1");
		Movie movie05 = new Movie(null, "Furiosa", 0.0, 0, "https://image.tmdb.org/t/p/w342/tFURJnWv5qW58x4OOrXt1GQEyr1.jpg?resize=250%2C370&ssl=1");		
		Movie movie06 = new Movie(null, "Moonfall", 0.0, 0, "https://www.themoviedb.org/t/p/w342/odVv1sqVs0KxBXiA8bhIBlPgalx.jpg");
		Movie movie07 = new Movie(null, "Morte no Nilo", 0.0, 0, "https://www.themoviedb.org/t/p/w342/3Ut50akEyfV5QDjUuA199cHmpaK.jpg");
		Movie movie08 = new Movie(null, "Ambulância", 0.0, 0, "https://i1.wp.com/image.tmdb.org/t/p/w342/miVUacc6Or0XNnJkwUsZ3tb1ryM.jpg?resize=250%2C370&ssl=1");
		Movie movie09 = new Movie(null, "Mayas", 0.0, 0, "https://i0.wp.com/image.tmdb.org/t/p/w342/pneaBHGQ5BqGJ3afxlPezL5czZB.jpg?resize=250%2C370&ssl=1");
		Movie movie10 = new Movie(null, "Passageiro 666", 0.0, 0, "https://i0.wp.com/www.themoviedb.org/t/p/w342/td69unYCXVQ2Y0HpekqrnZlsVFT.jpg?resize=250%2C370&ssl=1");
		Movie movie11 = new Movie(null, "Better Call Saul ", 0.0, 0, "https://i0.wp.com/image.tmdb.org/t/p/w342/rbNc44otT6VRd7QpxqlUAMyByaQ.jpg?resize=250%2C370&ssl=1");
		Movie movie12 = new Movie(null, "Terra sem lei", 0.0, 0, "https://i0.wp.com/image.tmdb.org/t/p/w342/dYBWgaJwQ5RXk9I4S6gN0LGq0P9.jpg?resize=250%2C370&ssl=1");
		Movie movie13 = new Movie(null, "Escolha ou morra", 0.0, 0, "https://i0.wp.com/image.tmdb.org/t/p/w342/f3zQhtFn8EzHgdPXoDPAtcGQnSf.jpg?resize=250%2C370&ssl=1");
		Movie movie14 = new Movie(null, "Infinit Storm", 0.0, 0, "https://filmestorrentflix.net/wp-content/uploads/wordpress-popular-posts/153845-first_image-270x370.jpg");
		Movie movie15 = new Movie(null, "O Homem do norte", 0.0, 0, "https://filmestorrentflix.net/wp-content/uploads/wordpress-popular-posts/153700-first_image-270x370.jpg");
		Movie movie16 = new Movie(null, "X", 0.0, 0, "https://filmestorrentflix.net/wp-content/uploads/wordpress-popular-posts/153149-first_image-270x370.jpg");
		Movie movie17 = new Movie(null, "Gold", 0.0, 0, "https://www.themoviedb.org/t/p/w342/32TXmY7GHlXhgGG7Wzrurm1okG5.jpg");
		Movie movie18 = new Movie(null, "Presque", 0.0, 0, "https://www.themoviedb.org/t/p/w342/7BRRlZ5XWz9EC4pjPy66zKgQwCk.jpg");	
		
		for(Movie movieTmp : Arrays.asList(movie01, movie02, movie03, movie04, movie05
			, movie06, movie07, movie08, movie09, movie10, movie11, movie12, movie13
			, movie14, movie15, movie16, movie17, movie18)) {
			movieService.save(movieTmp);
		}
				
		Score score01 = new Score(); 
		score01.setUser(user01);
		score01.setMovie(movie01);
		score01.setValue(5.0);
		movie01.setCount(1);
		movie01.setScore(5.0);
		movieService.save(movie01);
		scoreRepository.save(score01);
	}
}
