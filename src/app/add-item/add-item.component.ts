import {Component, OnInit} from '@angular/core';
import {FormBuilder, FormGroup, Validators, FormsModule} from '@angular/forms';

@Component({
  templateUrl: './add-item.component.html'
})
export class AddItemComponent implements OnInit {
  additemForm: FormGroup;
  submitted = false;
  
  constructor(
    private formBuilder: FormBuilder
  ) {
  }
  

  ngOnInit(): void {
    this.additemForm=this.formBuilder.group({
    })
  }

  onSubmit() {
    this.submitted = true;

    // stop here if form is invalid
    if (this.additemForm.invalid) {
      return;
    }
  }
}
