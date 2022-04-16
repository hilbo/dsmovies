package com.domain.dsmovie.DTO;

import java.io.Serializable;

import com.domain.dsmovie.entities.Score;

public class ScoreFormDTO implements Serializable{
	private static final long serialVersionUID = 1L;
	
	private Long movieId;
	private String userEmail;
	private Double value;
	
	public ScoreFormDTO() {
	}
				
	public ScoreFormDTO(Score score) {
		this.movieId =score.getMovie().getId();
		this.userEmail = score.getUser().getEmail();
		this.value = score.getValue();
	}

	public Long getMovieId() {
		return movieId;
	}
	public void setMovieId(Long movieId) {
		this.movieId = movieId;
	}
	public String getUserEmail() {
		return userEmail;
	}
	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}
	public Double getValue() {
		return value;
	}
	public void setValue(Double value) {
		this.value = value;
	}
	
	
}
