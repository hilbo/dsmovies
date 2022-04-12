import { ReactComponent as Seta } from 'assets/img/Seta.svg';
import 'components/Pages/Listing/NavegationControl/style.css';

function NavegationControl() {

    return (
        <div className="SelectionPageContainer container">
            <button disabled={false} title="Voltar" className="ButtonLeft"><Seta /></button>
            <p>1 de 200</p>
            <button disabled={true} title="Avançar"><Seta /></button>
        </div>
    );
}

export default NavegationControl;