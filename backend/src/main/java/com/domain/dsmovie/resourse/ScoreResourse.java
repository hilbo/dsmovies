package com.domain.dsmovie.resourse;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.domain.dsmovie.entities.Score;
import com.domain.dsmovie.service.ScoreService;

@RestController
@RequestMapping("/scores")
public class ScoreResourse {
	
	@Autowired ScoreService scoreService;
	
	@GetMapping
	public ResponseEntity<List<Score>> findAll(){
		return ResponseEntity.ok().body(scoreService.findAll());
	}
}
