import 'components/Pages/FormCard/styles.css';
import ButtonBack from 'components/Global/Button/ButtonBack';
import { Link } from 'react-router-dom';
import { Movie } from 'types/movie';
import React, { useEffect, useState } from 'react';
import axios, { AxiosRequestConfig, AxiosRequestHeaders } from 'axios';
import { hostPort } from 'config/conf';

type Props = {
    movieId : string
}

function FormCard(movieId : Props) {
    
    const [movie, setMovie] = useState<Movie>();
    useEffect(() => {
        axios.get(`http://localhost:8070/movies/${movieId.movieId}`)
            .then(resposta => {
                const data2 = resposta.data as Movie;
                setMovie(data2);
            })
    }, [movieId]);

    function handleSubmit (event : React.FormEvent){
        event.preventDefault();
        const email = (event.target as any).email.value;
        const score = (event.target as any).score.value;
        console.log(email, score, movieId, movie?.title);
        
        const conf : AxiosRequestConfig = {
            baseURL : `${hostPort}`,
            method : 'POST',
            url : '/scores',
            data : {
                userEmail : email,
                value : score,
                movieId : movie?.id
            }
        }

        axios(conf).then(response => {
            console.log(response.data);
        })
     }

    return (
        <main>
            <section className="formSection">
                <div className="formCardFilme">
                    <div className="FormCardFilmeImg">
                        <img src= {movie?.image} alt="" />
                    </div>
                    <div className="formDescriptionAvaliar">
                        <h3>{movie?.title}</h3>
                        <form action="" className="formulario" onSubmit={handleSubmit}>
                            <label htmlFor="email">Informe seu e-mail</label>
                            <input type='email' id="email" name="email" />
                            <label htmlFor="score">Informe sua avaliação</label>
                            <select className="selection" name="" id="score">
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

                                <Link to={'/'}>
                                    <ButtonBack />
                                </Link>
                            </div>
                        </form>
                    </div>
                </div>
            </section>
        </main>
    );

    
}
export default FormCard;
