import { ReactComponent as StarFull } from 'assets/img/StarFull.svg';
import { ReactComponent as StarHalf } from 'assets/img/StarHalf.svg';
import { ReactComponent as StarEmpty } from 'assets/img/StarEmpty.svg';
import 'components/Pages/Listing/Score/style.css';

function score() {

    return (
        <div className="Score">
            <a>3,8</a>
            <div className="Star container">
                <StarFull />
                <StarFull />
                <StarFull />
                <StarHalf />
                <StarEmpty />
            </div>
            <p>13 Avaliações</p>
            <div className="AvaliationBtn container">
                <a href="form.html">Avaliar</a>
            </div>
        </div>
    );
}

export default score;