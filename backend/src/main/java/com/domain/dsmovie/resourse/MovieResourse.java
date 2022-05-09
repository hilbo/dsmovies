package com.domain.dsmovie.resourse;

import java.net.URI;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;
import com.domain.dsmovie.DTO.MovieDTO;
import com.domain.dsmovie.entities.Movie;
import com.domain.dsmovie.service.MovieService;

@RestController
@RequestMapping("/movies")
public class MovieResourse {
	
	@Autowired MovieService movieService;
	
	/* FindAll pageable com order determinada
	@GetMapping
	public ResponseEntity<Page<Movie>> findAll(@PageableDefault(sort = {"title"}) Pageable pageable){
		return ResponseEntity.ok().body(movieService.findAll(pageable));
	}
	*/
	
	// FindAll com order pelo query repository
	@GetMapping
	public ResponseEntity<Page<Movie>> findAll( Pageable pageable){
		return ResponseEntity.ok().body(movieService.findAll(pageable));
	}
		
	@GetMapping("/findalldto")
	public ResponseEntity<Page<MovieDTO>> findAllDTO(Pageable pageable){
		return ResponseEntity.ok().body(movieService.findAllDTO(pageable));
	}
	
	@PostMapping
	public ResponseEntity<Movie> save(@RequestBody Movie movie){
		movie = movieService.save(movie);
		URI uri = ServletUriComponentsBuilder.fromCurrentRequestUri().path("/" + movie.getId()).build().toUri();
		return ResponseEntity.created(uri).body(movie);
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Movie> findById(@PathVariable Long id){
		return ResponseEntity.ok().body(movieService.findById(id));
		}
}
