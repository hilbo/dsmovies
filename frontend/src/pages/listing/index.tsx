import 'pages/listing/styles.css'
import { ReactComponent as Seta } from 'assets/img/Seta.svg';
import { ReactComponent as MovieImg } from 'assets/img/filme01.svg';
import 'components/Pages/Listing/Score';
import 'components/Pages/Listing/Score/style.css';
import Score from 'components/Pages/Listing/Score';
import SelectionPage from 'components/Pages/Listing/NavegationPage';


function Listing() {
    return (
        <div className="All">
            <SelectionPage />
            <div className="row Section">
                <div className="col-sm-6 col-lg-3 col-xl-2">
                    <div className="CardFilme">
                        <div className="CardFilmeImg" >
                            <MovieImg />
                        </div>
                        <div className="DescriptionBody">
                            <div className="Description">
                                <h3>Mulher em fúria: Produção de ação</h3>
                                <a> Detalhameno: dfsdsdfs fdas d </a>
                            </div>
                            <Score />
                        </div>
                    </div>
                </div>
            </div>
        </div>
    );

}

export default Listing;