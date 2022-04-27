import { ReactComponent as StarFull } from 'assets/img/StarFull.svg';
import { ReactComponent as StarHalf } from 'assets/img/StarHalf.svg';
import { ReactComponent as StarEmpty } from 'assets/img/StarEmpty.svg';
import 'components/Pages/Listing/Score/style.css';
import ButtonAvaliation from 'components/Global/Button/ButtonAvaliation';
import { Link } from 'react-router-dom';
import {Movie} from 'types/movie';

type Props = {
    movie : Movie;
}

function score({movie} : Props) {

    const count = 0;
    var score = count * 0.1;

    if (count <= 0) {
        score = 50;
    };

    return (
        <div className="Score">
            <p className="ScoreScore">{score}</p>
            <div className="Star container">
                <StarFull />
                <StarFull />
                <StarFull />
                <StarHalf />
                <StarEmpty />
            </div>
            <p className="ScoreCount">{count} Avaliações</p>
            <div className="BtnAvaliation">
                <Link to= {`/form/${movie.id}`}>
                    <ButtonAvaliation />
                </Link>
            </div>

        </div>
    );
}

export default score;