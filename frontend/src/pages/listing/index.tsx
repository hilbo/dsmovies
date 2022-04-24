import NavegationControl from 'components/Pages/Listing/NavegationControl';
import MovieCard from 'components/Pages/Listing/MovieCard';
import 'pages/listing/style.css';
import axios from 'axios';
import { useEffect, useState } from 'react';
import { MoviePage } from 'types/movie';
import { hostPort } from 'config/conf';

function Listing() {
    const [pageNumber, setPageNumber] = useState(0);
    
    const [Page, setPage] = useState<MoviePage>({
        content: [],
        last: true,
        totalPages: 0,
        totalElements: 0,
        size: 8,
        number: 0,
        first: true,
        numberOfElements: 0,
        empty: true,
    });

    const complenent = `movies?size=${pageNumber}`;
    const endPoint = hostPort + complenent;

    useEffect(() => {
        axios.get(endPoint)
            .then(resposta => {
                const data2 = resposta.data as MoviePage;
                console.log(data2);
                setPage(data2);
            })
    }, [endPoint]);

    return (
        <>
            <NavegationControl />
            <div className="row Section">
                {Page.content.map(movie => (
                    <MovieCard key={movie.id} movie={movie} />
                ))}
            </div>
        </>
    );

}

export default Listing;