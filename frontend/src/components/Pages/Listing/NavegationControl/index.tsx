import { ReactComponent as Seta } from 'assets/img/Seta.svg';
import 'components/Pages/Listing/NavegationControl/style.css';
import { useState } from 'react';
import { MoviePage } from 'types/movie';


type Props = {
  moviePage : MoviePage
  changePageNumber : Function  
}

function NavegationControl({moviePage, changePageNumber} : Props) {
    
    function backPage (){
        changePageNumber(moviePage.number - 1);
    }
    function nextPage (){
        changePageNumber(moviePage.number + 1);
    }

    return (
        <div className="SelectionPageContainer container">
            <button disabled={moviePage.first} title="Voltar" className="ButtonLeft" 
            onClick={() => changePageNumber(moviePage.number - 1)}>
            <Seta /></button>
                
            
            <p>{moviePage.number + 1} de {moviePage.totalPages}</p>
            <button disabled={moviePage.last} title="Avançar"
            onClick= {() => nextPage()}>
            <Seta /></button>
        </div>
    );
}

export default NavegationControl;