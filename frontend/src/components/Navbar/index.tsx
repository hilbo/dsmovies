
import { ReactComponent as GithubIcon } from 'assets/img/github.svg';
import 'components/Navbar/styles.css';

function Navbar() {
   return (
      <header>
         <nav className="container">
            <h1>DSMove</h1>
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