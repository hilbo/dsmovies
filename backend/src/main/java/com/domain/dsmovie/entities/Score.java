package com.domain.dsmovie.entities;

import java.io.Serializable;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "tb_score")
public class Score implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@EmbeddedId
	private ScorePK scorePkId = new ScorePK();
	
	private Double value;
					
	public Score() {
	}

	public Double getValue() {
		return value;
	}

	public void setValue(Double value) {
		this.value = value;
	}

	public void setMovie(Movie movie) {
		scorePkId.setMovie(movie);
	}
	
	public void setUser(User user) {
		scorePkId.setUser(user);
	}

	@Override
	public String toString() {
		return "Score [scorePkId=" + scorePkId + ", value=" + value + "]";
	}
		
}

	