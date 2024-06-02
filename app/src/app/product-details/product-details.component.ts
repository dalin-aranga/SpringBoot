import { Component, OnInit } from '@angular/core';
import { ProductService } from '../service/product.service';
import { DomSanitizer } from '@angular/platform-browser';
import { ActivatedRoute } from '@angular/router';
import { Router } from '@angular/router';

@Component({
  selector: 'app-product-details',
  templateUrl: './product-details.component.html',
  styleUrls: ['./product-details.component.css']
})
export class ProductDetailsComponent implements OnInit {
  name = "One Plus 9r";
  price = "Patna,Bihar";
  description = "";
  image:string="";
  product_id = 2;

  constructor(
    private _productdetailsService: ProductService,
    private domSanitizer: DomSanitizer,
    private productService: ProductService,
    private _route: ActivatedRoute,
    private router: Router 
  ) {}

  ngOnInit(): void {
  
    
    this.product_id = this._route.snapshot.params['product_id'];
    

    this.productService.getProductById(this.product_id).subscribe((data) => {
  
      this.product_id = data[0].product_id
      this.name = data[0].name
      this.price = data[0].price
      this.description = data[0].description
      this.image = data[0].image
  

      
      

    })
  }
 

  deleteProduct(product_id: any) {
    this.productService.deleteProduct(product_id).subscribe(
      () => {
        console.log('Product deleted successfully');
       
      },
      (error) => {
        alert("Product Deleted");
        this.router.navigate(['/']); 
        console.error('Delete failed', error);
      }
    );
  }

  addToCart(): void{
    const productUpdateDTO = {
      product_id: this.product_id,
      name: this.name,
      price: this.price,
      description: this.description,
      image: this.image
    };
    console.log("Cart", productUpdateDTO);
  }

  updateProduct(): void {
    const productUpdateDTO = {
      product_id: this.product_id,
      name: this.name,
      price: this.price,
      description: this.description,
      image: this.image
    };
    this.router.navigate(['/update'],{ state: { productData: productUpdateDTO } });
    
  }

}
