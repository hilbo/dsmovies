package com.domain.dsmovie.DTO;

import java.io.Serializable;

import com.domain.dsmovie.entities.Movie;

public class MovieDTO implements Serializable{
	private static final long serialVersionUID = 1L;
	
	private String title;
	private Double score;
	private Integer count;
	private String image;
	
	public MovieDTO() {
	}

	public MovieDTO(Movie movie) {
		this.title = movie.getTitle();
		this.score = movie.getScore();
		this.count = movie.getCount();
		this.image = movie.getImage();
	}
	
    public Movie movieDTOForMovie(MovieDTO movieDTO) {
		Movie movie = new Movie();
		movie.setTitle(movieDTO.getTitle());
    	
    	return movie;
    }
	
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Double getScore() {
		return score;
	}

	public void setScore(Double score) {
		this.score = score;
	}

	public Integer getCount() {
		return count;
	}

	public void setCount(Integer count) {
		this.count = count;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	@Override
	public String toString() {
		return "MovieDTO [title=" + title + ", score=" + score + ", count=" + count + ", image=" + image
				+ "]";
	}
	
	
	
	

}
