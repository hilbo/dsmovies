package com.domain.dsmovie;

import com.domain.dsmovie.DTO.ScoreFormDTO;

public class ProgramTeste {

	public static void main(String[] args) {
		Long movieid = 79L;
		String useremail = "teste@teste.com.br";
	    Double value = 10.0;
	    
	    ScoreFormDTO scoreForm = new ScoreFormDTO();
	    scoreForm.setMovieId(movieid);
	    scoreForm.setUserEmail(useremail);
	    scoreForm.setValue(value);
		
		System.out.println(scoreForm);
		
		
		
		
		
		
	}

}
