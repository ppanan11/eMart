import { Component, OnInit } from '@angular/core';
import {FormBuilder, FormGroup, Validators, FormsModule} from '@angular/forms';

@Component({
  selector: 'app-checkout',
  templateUrl: './checkout.component.html',
  styleUrls: ['./checkout.component.css']
})
export class CheckoutComponent implements OnInit {
  checkoutForm:FormBuilder

  constructor( private formBuilder: FormBuilder) { }

  ngOnInit() {
    
}
update() {}
}
