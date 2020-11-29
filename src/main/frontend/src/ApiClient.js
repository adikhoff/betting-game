import React, {Component} from 'react';
import { axios } from 'axios';


export default class ApiClient extends Component {
    BASE_URL = 'http://localhost:8080/api/';

    httpGet = (requestUrl) => {
        return fetch(this.BASE_URL + requestUrl, {
            crossDomain: true,
            method: 'GET',
            headers: {'Content-Type': 'application/json'},
        })
    }
}
