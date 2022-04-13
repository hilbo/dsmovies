package com.domain.dsmovie.resourse;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.domain.dsmovie.DTO.ScoreFormDTO;
import com.domain.dsmovie.entities.Score;
import com.domain.dsmovie.service.ScoreService;

@RestController
@RequestMapping("/scores")
public class ScoreResourse {
	
	@Autowired 
	private ScoreService scoreService;
				
	@GetMapping
	public ResponseEntity <List<Score>> findAll(){
		return ResponseEntity.ok().body(scoreService.findAll());
	}
	
	@PostMapping
	public ResponseEntity<Score> save(@RequestBody ScoreFormDTO scoreFormDTO){
		return ResponseEntity.ok(scoreService.save(scoreFormDTO));
	}
	
	@GetMapping("/listdto")
	public ResponseEntity <List<ScoreFormDTO>> findAllDTO(){
		return ResponseEntity.ok().body(scoreService.listScoreDTO());
	}
	
	@GetMapping("/movie/{id}")
	public ResponseEntity<List<Score>> scorePerMovie(@PathVariable Long id){
		return ResponseEntity.ok().body(scoreService.scorePerMovie(id));
	}
	
}
