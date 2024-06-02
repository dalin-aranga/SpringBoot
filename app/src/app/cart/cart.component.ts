import { Component, OnInit } from '@angular/core';
import { CartService } from '../service/cart.service';
import { retry } from 'rxjs';
@Component({
  selector: 'app-cart',
  templateUrl: './cart.component.html',
  styleUrls: ['./cart.component.css']
})
export class CartComponent implements OnInit {
  public getCartData: any[] = [];
  quantity = this.getTotalPrice() ;
  
 
  constructor(
    private cartService: CartService,
  ) { }

  ngOnInit(): void {
    this.cartService.getCart().subscribe((data: any) => {
    
      this.getCartData=data;
    })
  }

  getTotalPrice() {
    let totalPrice = 0;
    this.getCartData.forEach(item => {
      totalPrice += item.eachPrice * this.quantity;
    });
    return totalPrice;
  }

  increment() {
    this.quantity++;
    
  }

  decrement() {
    if (this.quantity > 0) {
      this.quantity--;
     
    }
  }

}
