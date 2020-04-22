import {Component, OnInit} from '@angular/core';
import {Router} from '@angular/router';
import {FormBuilder, FormGroup, Validators} from '@angular/forms';
import {first} from 'rxjs/operators';

import {AlertService} from 'src/app/service/alert.service';
import {UserService} from 'src/app/service/user.service';
import {AuthenticationService} from 'src/app/service/authentication.service';

@Component({
  selector: 'app-seller-register',
  templateUrl: './seller-register.component.html',
  styleUrls: ['./seller-register.component.css']
})
export class SellerRegisterComponent implements OnInit {
  registerForm: FormGroup;
  loading = false;
  submitted = false;


  constructor(
    private formBuilder: FormBuilder,
    private router: Router,
    private authenticationService: AuthenticationService,
    private userService: UserService,
    private alertService: AlertService
  ) {
    // redirect to home if already logged in
    if (this.authenticationService.currentUserValue) {
      this.router.navigate(['/']);
    }
  }

  ngOnInit(): void {
    this.registerForm = this.formBuilder.group({
      email: ['', Validators.required],
      phone: ['', Validators.required],
      username: ['', Validators.required],
      password: ['', Validators.required],
      company: ['', Validators.required],
      GSTIN: ['', Validators.required],
      postal: ['', Validators.required],
      website: ['', Validators.required],
      brief: ['', Validators.required],
      // password: ['', [Validators.required, Validators.minLength(6)]]
    });
  }

  // convenience getter for easy access to form fields
  get f() {
    return this.registerForm.controls;
  }

  onSubmit() {
    this.submitted = true;

    // stop here if form is invalid
    if (this.registerForm.invalid) {
      return;
    }
    console.log(this.registerForm.value)
    this.loading = true;
    // console.log('usss'+this.userService.register(this.registerForm.value).subscribe())
    this.userService.register(this.registerForm.value)
      .pipe(first())
      .subscribe(
        data => {
          console.log('data' + data)
          this.alertService.success('Seller Registration successful', true);
          this.router.navigate(['/sellerlogin']);
        },
        error => {
          this.alertService.error(error);
          this.loading = false;
        });
  }


}
