import { ReactComponent as StarEmpty } from 'assets/img/StarEmpty.svg';
import { ReactComponent as StarFull } from 'assets/img/StarFull.svg';
import { ReactComponent as StarHalf } from 'assets/img/StarHalf.svg';
import { Movie } from 'types/movie';

type Props = {
    movie: Movie
}

function Star({movie} : Props) {

    var star1 = <StarEmpty />;
    var star2 = <StarEmpty />;
    var star3 = <StarEmpty />;
    var star4 = <StarEmpty />;
    var star5 = <StarEmpty />;

    function star() {

        if (movie.score === 5.0) {
            star1 = <StarFull />;
            star2 = <StarFull />;
            star3 = <StarFull />;
            star4 = <StarFull />;
            star5 = <StarFull />;
        } else if (movie.score === 1) {
            star1 = <StarFull />;
            star2 = <StarEmpty />;
            star3 = <StarEmpty />;
            star4 = <StarEmpty />;
            star5 = <StarEmpty />;

        } if (movie.score > 1 && movie.score < 2) {
            star1 = <StarFull />;
            star2 = <StarHalf />;
            star3 = <StarEmpty />;
            star4 = <StarEmpty />;
            star5 = <StarEmpty />;

        } if (movie.score === 2) {
            star1 = <StarFull />;
            star2 = <StarFull />;
            star3 = <StarEmpty />;
            star4 = <StarEmpty />;
            star5 = <StarEmpty />;

        } if (movie.score > 2 && movie.score < 3) {
            star1 = <StarFull />;
            star2 = <StarFull />;
            star3 = <StarHalf />;
            star4 = <StarEmpty />;
            star5 = <StarEmpty />;

        } if (movie.score === 3) {
            star1 = <StarFull />;
            star2 = <StarFull />;
            star3 = <StarFull />;
            star4 = <StarEmpty />;
            star5 = <StarEmpty />;

        } if (movie.score > 3 && movie.score < 4) {
            star1 = <StarFull />;
            star2 = <StarFull />;
            star3 = <StarFull />;
            star4 = <StarHalf />;
            star5 = <StarEmpty />;

        } if (movie.score === 4) {
            star1 = <StarFull />;
            star2 = <StarFull />;
            star3 = <StarFull />;
            star4 = <StarFull />;
            star5 = <StarEmpty />;

        } if (movie.score > 4 && movie.score < 5) {
            star1 = <StarFull />;
            star2 = <StarFull />;
            star3 = <StarFull />;
            star4 = <StarFull />
            star5 = <StarHalf />;
        };
    }

    return (
        <>
            {star()}
            {star1}
            {star2}
            {star3}
            {star4}
            {star5}
        </>

    );
}
export default Star;