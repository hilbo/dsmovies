import {
  BrowserRouter,
  Routes,
  Route
} from "react-router-dom";
import Listing from 'pages/listing';
import Form from "pages/form";
import Navbar from "components/Pages/Global/Navbar";
import NavegationPage from "components/Pages/Listing/NavegationPage";

function App() {
  return (
    <BrowserRouter>
     <Navbar />
      <Routes>
        <Route path="/dev" element={<NavegationPage />} />
        <Route path="/" element={<Listing />} />
        <Route path="/form">
          <Route path=":movieId" element={<Form />} />
        </Route>
      </Routes>
    </BrowserRouter>
  );
}

export default App;