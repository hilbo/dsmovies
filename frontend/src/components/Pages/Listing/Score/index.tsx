import 'components/Pages/Listing/Score/style.css';
import ButtonAvaliation from 'components/Global/Button/ButtonAvaliation';
import { Link } from 'react-router-dom';
import {Movie} from 'types/movie';
import Star from 'components/Pages/Listing/Star';


type Props = {
    movie : Movie;
}

function score({movie} : Props) {
       
    return (
        <div className="Score">
            <p className="ScoreScore">{movie.score}</p>
            <div className="Star container">
               <Star movie={movie} />
            </div>
            <p className="ScoreCount">{movie.count} Avaliações</p>
            <div className="BtnAvaliation">
                <Link to= {`/form/${movie.id}`}>
                    <ButtonAvaliation />
                </Link>
            </div>

        </div>
    );
}

export default score;