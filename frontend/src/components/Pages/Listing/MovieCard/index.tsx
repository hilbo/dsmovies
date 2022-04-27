
import Score from 'components/Pages/Listing/Score';
import 'components/Pages/Listing/MovieCard/style.css';
import { Movie } from 'types/movie';

type Props = {
    movie: Movie
}

function MovieCard({ movie }: Props) {

    return (
        <div className="CardFilmeContainer col-sm-6 col-lg-3 col-xl-2">
            <div className="CardFilme">
                <div className="CardFilmeImg" >
                    <img src={movie.image} alt="" />
                </div>
                <div className="DescriptionBody">
                    <div className="Description">
                        <h3>{movie.title}</h3>
                        <p> Detalhameno:</p>
                    </div>
                    <Score movie={movie} />
                </div>
            </div>
        </div>

    );
}

export default MovieCard;