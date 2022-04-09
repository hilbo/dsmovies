package com.domain.dsmovie.entities;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "tb_score")
public class Score implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private Double value;
	
	@Id
	@GeneratedValue
	private Long id;
			
	@OneToOne
	@JoinColumn(name="movie_id")
	private Movie movie;
	
	@OneToOne
	@JoinColumn(name="User_id")
	private User user;
	
	public Score() {
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

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
		return "Score [value=" + value + ", id=" + id + ", movie=" + movie + ", user=" + user + "]";
	}
	
	
}

	