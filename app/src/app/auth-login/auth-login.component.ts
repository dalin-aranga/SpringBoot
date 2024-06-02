import { Component, OnInit } from '@angular/core';
import { LoginService } from '../service/login.service';
import { Router } from '@angular/router';
@Component({
  selector: 'app-auth-login',
  templateUrl: './auth-login.component.html',
  styleUrls: ['./auth-login.component.css']
})
export class AuthLoginComponent implements OnInit {
  email: string = "";
  password: string = "";

  public getAuthData: any[] = [];
  constructor( private loginService: LoginService,  private router: Router ) { }

  ngOnInit(): void {
  }
  loginButton() { 
    this.loginService.loginData().subscribe((data: any) => {
    
      this.getAuthData = data;
     
     
      
      for (let element of this.getAuthData) {

        if (element.email === this.email && element.password == this.password) {
          alert("Successfully Logged.");
          this.router.navigate(['/home']); 
          console.log("Success");

          
        }
        else {
          alert("Email or Password Wrong.");
          console.log("Failed", this.email);
        }
        
     
      }
      
    })
  }

}
