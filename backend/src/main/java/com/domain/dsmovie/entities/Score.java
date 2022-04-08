package com.domain.dsmovie.entities;

import java.io.Serializable;

public class Score implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private Double value;
	
	private ScorePK scorePK = new ScorePK();
	
	public Score() {
	}

	public Double getValue() {
		return value;
	}

	public void setValue(Double value) {
		this.value = value;
	}
	
	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public ScorePK getScorePK() {
		return scorePK;
	}

	public void setScorePK(ScorePK scorePK) {
		this.scorePK = scorePK;
	}

}
