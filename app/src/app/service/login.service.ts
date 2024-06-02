import { Injectable } from '@angular/core';
import { login } from '../model/login';
import { HttpClient } from '@angular/common/http';

@Injectable({
  providedIn: 'root'
})
export class LoginService {

  
  baseUrl = "http://localhost:8080/api/v1/ecommerce"

  constructor(private httpClient: HttpClient) { } 
    public loginData(){
      return this.httpClient.get<login[]>(this.baseUrl + "/auth");
      
    }
}
