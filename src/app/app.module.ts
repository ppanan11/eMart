import {BrowserModule} from '@angular/platform-browser';
import {NgModule} from '@angular/core';
import {ReactiveFormsModule} from '@angular/forms';
import {HttpClientModule, HTTP_INTERCEPTORS} from '@angular/common/http';

import {AppRoutingModule} from './app-routing.module';
import {AppComponent} from './app.component';
import {LoginComponent} from './login/login.component';
import {RegisterComponent} from './register/register.component';
import {BackendProvider} from './helper/backend';

import {ErrorInterceptor} from './helper/error.interceptor';
import {JwtInterceptor} from './helper/jwt.interceptor';
import {AlertComponent} from './alert/alert.component';
import {HomeComponent} from './home/home.component';
import {SellerLoginComponent} from './seller-login/seller-login.component';
import {SellerRegisterComponent} from './seller-register/seller-register.component';
import {SellerHomeComponent} from './seller-home/seller-home.component';
import {AddItemComponent} from './add-item/add-item.component';
import {ReportComponent} from './report/report.component';
import {NgbModule} from '@ng-bootstrap/ng-bootstrap';
import { UserBuyTrasactionsComponent } from './user-buy-trasactions/user-buy-trasactions.component';
import { CheckoutComponent } from './checkout/checkout.component';
import { CartComponent } from './cart/cart.component';


@NgModule({
  declarations: [
    AppComponent,
    LoginComponent,
    RegisterComponent,
    AlertComponent,
    HomeComponent,
    SellerLoginComponent,
    SellerRegisterComponent,
    SellerHomeComponent,
    AddItemComponent,
    ReportComponent,
    UserBuyTrasactionsComponent,
    CheckoutComponent,
    CartComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    ReactiveFormsModule,
    HttpClientModule,
    NgbModule
  ],
  providers: [
    {provide: HTTP_INTERCEPTORS, useClass: JwtInterceptor, multi: true},
    {provide: HTTP_INTERCEPTORS, useClass: ErrorInterceptor, multi: true},
    BackendProvider
  ],
  bootstrap: [AppComponent],
})
export class AppModule {
}




