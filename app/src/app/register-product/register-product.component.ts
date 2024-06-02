import { Component, OnInit } from '@angular/core';
import { FormControl, FormGroup, Validators } from '@angular/forms';
import { Product } from '../model/product';
import { MatSnackBar } from '@angular/material/snack-bar';
import { ProductService } from '../service/product.service';
import { Observable, Subscriber } from 'rxjs';
import { ActivatedRoute } from '@angular/router';
import { Location } from '@angular/common';
export interface Fruit {
  name: string;
}
@Component({
  selector: 'app-register-product',
  templateUrl: './register-product.component.html',
  styleUrls: ['./register-product.component.css']
})
export class RegisterProductComponent implements OnInit {
  currentUrl: string;
  productForm: FormGroup;
  productObj: Product = new Product();
  file = [];
  image: string = '';
 emptyObject: {} = {};
  

  constructor(private _snackBar: MatSnackBar,private route: ActivatedRoute,private location: Location,
    private productService: ProductService) {
      this.currentUrl = this.location.path();
    this.productForm = new FormGroup({
      name: new FormControl("", [Validators.required]),
      price: new FormControl("", [Validators.required]),
      description: new FormControl("", [Validators.required]),
      image : new FormControl("", [Validators.required]),
     
    });
  }

  ngOnInit() {
    const navigation = window.history.state;
  this.emptyObject = navigation.productData;
    if (navigation && navigation.productData) {
      this.productForm.patchValue(navigation.productData);
      
    }

  }

  

  handleFileInput(files) {
    this.prepareFilesList(files);
  }
  prepareFilesList(files: Array<any>) {
    for (const item of files) {
      item.progress = 0;
      this.file.push(item);
    }
    this.uploadFilesSimulator(0);
  }
  uploadFilesSimulator(index: number) {
    setTimeout(() => {
      if (index === this.file.length) {
        return;
      } else {
        const progressInterval = setInterval(() => {
          if (this.file[index].progress === 100) {
            clearInterval(progressInterval);
            this.uploadFilesSimulator(index + 1);
          } else {
            this.file[index].progress += 5;
          }
        }, 200);
      }
    }, 1000);
  }

  onClickSubmitForm() {

    if (!this.productForm.invalid) {
      console.log("Current URL", this.currentUrl);
      if (this.currentUrl.includes('update')) {
        const jsonString = JSON.stringify(this.emptyObject);
        this.productService.updateProduct(jsonString);
      }
      else {
        this.productObj.name = this.productForm.value.name;
      this.productObj.price = this.productForm.value.price;
      this.productObj.description = this.productForm.value.description;
      this.productObj.image = this.base64code;
      this.productService.addProduct1(this.productObj).subscribe(data =>
        console.log(data)
      )
     this.productForm.reset();
      }
      
    } else {
      this.popup('Input error', 'Retry');
    }
  }

  popup(var1, var2) {
    this._snackBar.open(var1, var2, {
      duration: 3000,
      horizontalPosition: 'right',
      verticalPosition: 'top',
    });
  }


  myImage!: Observable<any>;
  base64code!: any;
  onChange = ($event: Event) => {
    const target = $event.target as HTMLInputElement;
    const file: File = (target.files as FileList)[0];
    //console.log(file)
    this.convertToBase64(file)
  }
  convertToBase64(file: File) {
    const observable = new Observable((subscriber: Subscriber<any>) => {
      this.readFile(file, subscriber)
    })
    observable.subscribe((d) => {
      // console.log(d)
      this.myImage = d
      this.base64code = d
    })
  }
  readFile(file: File, subscriber: Subscriber<any>) {
    const filereader = new FileReader();
    filereader.readAsDataURL(file)
    filereader.onload = () => {
      subscriber.next(filereader.result)
      subscriber.complete()
    }
    filereader.onerror = () => {
      subscriber.error()
      subscriber.complete()
    }
  }

}
