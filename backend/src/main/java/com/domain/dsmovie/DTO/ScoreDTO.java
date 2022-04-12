package com.domain.dsmovie.DTO;

import java.io.Serializable;

public class ScoreDTO implements Serializable{
	private static final long serialVersionUID = 1L;
	
	private Long movieId;
	private String userEmail;
	private Double value;
	
	public ScoreDTO() {
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
