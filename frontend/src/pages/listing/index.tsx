import NavegationControl from 'components/Pages/Listing/NavegationControl';
import MovieCard from 'components/Pages/Listing/MovieCard';
import 'pages/listing/style.css';

function Listing() {
    return (

        <div className="row Section">
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