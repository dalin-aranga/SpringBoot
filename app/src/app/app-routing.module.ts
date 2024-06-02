import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { RegisterProductComponent } from './register-product/register-product.component';
import { ProductDetailsComponent } from './product-details/product-details.component';
import { LandingComponent } from './landing/landing.component';
import { CartComponent } from './cart/cart.component';
import { OrderPlaceComponent } from './order-place/order-place.component';
import { AuthLoginComponent } from './auth-login/auth-login.component';


const routes: Routes = [
  { path: '', component: AuthLoginComponent },
  { path: 'register', component: RegisterProductComponent },
  { path: 'cart/placed', component: OrderPlaceComponent },
  { path: 'cart', component: CartComponent },
  { path: 'home', component: LandingComponent },
  {path:'update',component:RegisterProductComponent},
  {
    path: 'getProductById/:product_id', 
    component: ProductDetailsComponent
  },

];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
