import NavegationPage from 'components/Pages/Listing/NavegationPage';
import MovieCard from 'components/Pages/Listing/MovieCard';
import 'pages/listing/style.css';

function Listing() {
    return (

        <div className="row Section">
            <NavegationPage />
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