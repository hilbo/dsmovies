
import { ReactComponent as GithubIcon } from 'assets/img/github.svg';
import 'components/Pages/Global/Navbar/styles.css';

function Navbar() {
   
   return (
      <header>
         <nav className='container'>
            <div className='InfoGlobal'>
               <h1>DSMove</h1>
               <h2>V1.0.0</h2>
            </div>
            
            <div className='StyleGithub'>
               <div className='StyleGithubimg'>
                  <GithubIcon />
               </div>
               <a href="https://github.com/hilbo">/hilbo</a>
            </div>
         </nav>
      </header>
   );
}
export default Navbar;