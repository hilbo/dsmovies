package com.domain.dsmovie;

import com.domain.dsmovie.DTO.MovieDTO;
import com.domain.dsmovie.entities.Movie;
import com.domain.dsmovie.entities.User;
import com.domain.dsmovie.repository.UserRepository;
import com.domain.dsmovie.service.UserService;

public class ProgramTeste {

	public static void main(String[] args) {
		Movie movie = new Movie(null, "Titulo Filme", 5.0, 4, "Img");
		MovieDTO movieDTO = new MovieDTO(movie);
		Movie movie02 = new Movie();
		
		movie02 = movieDTO.movieDTOForMovie(movieDTO);
		
		System.out.println(movie);
		System.out.println(movieDTO);
		System.out.println(movie02);
		
		
		
		
		
	}

}
