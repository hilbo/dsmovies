import { ReactComponent as MovieImg } from 'assets/img/filme01.svg';
import Score from 'components/Pages/Listing/Score';
import 'components/Pages/Listing/MovieCard/style.css';

function MovieCard() {

    return (
        
            <div className="CardFilmeContainer col-sm-6 col-lg-3 col-xl-2">
                <div className="CardFilme">
                    <div className="CardFilmeImg" >
                        <MovieImg />
                    </div>
                    <div className="DescriptionBody">
                        <div className="Description">
                            <h3>Mulher em fúria: Produção de ação</h3>
                            <p> Detalhameno:</p>
                        </div>
                        <Score />
                    </div>
                </div>
            </div>
        
    );
}

export default MovieCard;