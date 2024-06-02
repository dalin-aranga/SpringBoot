import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Product } from '../model/product';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class ProductService {

  baseUrl = "http://localhost:8080/api/v1/ecommerce"

  constructor(private httpClient: HttpClient) { }

  public addProduct1(productObject: any) {
    return this.httpClient.post<Product>(this.baseUrl + "/save", productObject);
  }
  
  public getProductById(product_id:any){
    return this.httpClient.get<Product>(this.baseUrl + "/getProductById/"+ product_id)
  }

  public getAllProduct(){
    return this.httpClient.get<Product[]>(this.baseUrl + "/getAllProducts")
  }

  public deleteProduct(product_id: any) {
    console.log("Detele",product_id);
    
    return this.httpClient.delete<Product>(this.baseUrl + "/delete/"+ product_id)
  }

  public updateProduct(productUpdateDTO: any): Observable<string> {
    console.log("Update Service")
    console.log("Update Service", this.baseUrl + "/update")
    console.log("Update Service", productUpdateDTO)
    return this.httpClient.put<string>(this.baseUrl + "/update", productUpdateDTO);
  }
}
