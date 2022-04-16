import NavegationControl from 'components/Pages/Listing/NavegationControl';
import MovieCard from 'components/Pages/Listing/MovieCard';
import 'pages/listing/style.css';
import axios from 'axios';
import { useEffect, useState } from 'react';
import { Movie, MoviePage } from 'types/movie';
import { hostPort} from 'config/conf';


function Listing() {
    const complenent = "movies/1";
    const endPoint = hostPort + complenent;

    const [movieTitle, setMovieTitle] =  useState("titulo");
    const [movieId, setMovieId] = useState(0);

    const [moviePage, setMoviePage] = useState(0);


    useEffect(() => {
        axios.get(endPoint)
        .then(resposta => {
            const data =  resposta.data as Movie;
            console.log(data);           
            setMovieTitle(data.title);
            setMovieId(data.id);

            const data2 = resposta.data as MoviePage;
            console.log(data);
            setMoviePage(data2.number);
        })
    },[]);

    return (
      
        <div className="row Section">
            <p>{movieId} / {movieTitle} Page: {moviePage}</p>
            <NavegationControl />
            <MovieCard />
            <MovieCard />
            <MovieCard />
            <MovieCard />
            <MovieCard />
            <MovieCard />
            <MovieCard />
        </div>
        
        
    );

}

export default Listing;