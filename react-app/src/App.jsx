import logo from "./logo.svg";
import "./App.css";
import LoginButtonBox from "./LoginButtonBox";

function App() {
  return (
    <div className="App">
      <header className="App-header">
        <img src={logo} className="App-logo" alt="logo" />
        <LoginButtonBox />
      </header>
    </div>
  );
}

export default App;
