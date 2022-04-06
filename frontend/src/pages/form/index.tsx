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
                    <div className="FormCardFilmeImg">
                    {movie.image}
                    </div>
                   
                    <div className="formDescriptionAvaliar">
                        <h3>{movie.title}</h3>
                        <form action="" className="formulario">
                            
                                <label htmlFor="email">Informe seu e-mail</label>
                                <input type="email" id="email" name="email" />
                                <label htmlFor="score">Informe sua avaliação</label>
                                <select className="selection" name="" id="">
                                    <option value="1">1</option>
                                    <option value="2">2</option>
                                    <option value="3">3</option>
                                    <option value="4">4</option>
                                    <option value="5">5</option>
                                </select>
                            
                            <div className="formAvaliationBtn">
                                <div className="ButtonAvaliarContainer">
                                    <button type="submit" name="Avaliar">Avaliar</button>
                                </div>
                                <div className="ButtonVoltarContainer">
                                    <a href="index.html">Voltar</a>
                                </div>
                            </div>
                        </form>
                    </div>
                </div>
            </section>
        </main>
    );
}
export default Form;