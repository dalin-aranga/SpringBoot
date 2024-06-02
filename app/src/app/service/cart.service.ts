import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { cart } from '../model/cart';



@Injectable({
  providedIn: 'root'
})
export class CartService {
  baseUrl = "http://localhost:8080/api/v1/ecommerce"

  constructor(private httpClient: HttpClient) { } 
    public getCart(){
      return this.httpClient.get<cart[]>(this.baseUrl + "/productCart");
      
    }
  
}
