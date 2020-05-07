import { Component, OnInit } from '@angular/core';
import {FormBuilder, FormGroup, Validators, FormsModule} from '@angular/forms';

@Component({
  selector: 'app-cart',
  templateUrl: './cart.component.html',
  styleUrls: ['./cart.component.css']
})
export class CartComponent implements OnInit {
  cartForm: FormGroup;

  constructor(
    private formBuilder: FormBuilder

  ) { 
    
  }

  ngOnInit() {
    this.cartForm=this.formBuilder.group({
  });
}

update() {}
  
}