import React, {Component} from 'react';
import './App.css';

class App extends Component {
    state = {};

    render() {
        return (
            <div className="App">
                <h1>Welkom in de familie app</h1>
                <div id="login-form">
                    <form>
                        <input id="username" />
                        <input id="password" />
                        <button id="login-btn">Inloggen</button>
                    </form>
                </div>
            </div>
        );
    }
}

export default App;
