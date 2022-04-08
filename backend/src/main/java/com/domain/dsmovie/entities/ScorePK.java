package com.domain.dsmovie.entities;

import java.io.Serializable;

public class ScorePK implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private Double value;
	private Movie movie;
	private User user;
	
	public Double getValue() {
		return value;
	}
	public void setValue(Double value) {
		this.value = value;
	}
	public Movie getMovie() {
		return movie;
	}
	public void setMovie(Movie movie) {
		this.movie = movie;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	
	
	@Override
	public String toString() {
		return "ScorePK [movie=" + movie + ", user=" + user + "]";
	}
	
	

}
