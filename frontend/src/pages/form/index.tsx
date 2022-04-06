import Navbar from "components/Navbar";
import 'pages/form/styles.css';
import { ReactComponent as ImgFilme } from "assets/img/filme01.svg";

function Form() {

    const movie = {
        id: 1,
        image: <ImgFilme />,
        title: "Wrath of Man",
        count: 2,
        score: 4.5
    };

    return (
        <main>
            <section className="formSection">
                <div className="formCardFilme">
                    
                        {movie.image}
                        <h3>{movie.title}</h3>
                    
                    <div className="formDescriptionAvaliar">
                        
                        <form action="" className="formulario">
                            <div className="formularioAvaliacao">
                                <div><label htmlFor="email">Informe seu e-mail</label></div>
                                <div><input type="email" id="email" name="email" /></div>
                                <div><label htmlFor="score">Informe sua avaliação</label></div>
                                <select className="selection" name="" id="">
                                    <option value="1">1</option>
                                    <option value="2">2</option>
                                    <option value="3">3</option>
                                    <option value="4">4</option>
                                    <option value="5">5</option>
                                </select>
                            </div>
                            <div className="formAvaliationBtn">
                                <button type="submit" name="Avaliar">Avaliar</button>
                                <a href="index.html">Voltar</a>
                            </div>
                        </form>
                    </div>
                </div>
            </section>
        </main>
    );
}
export default Form;