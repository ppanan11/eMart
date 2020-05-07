import {NgModule} from '@angular/core';
import {Routes, RouterModule} from '@angular/router';
import {LoginComponent} from './login/login.component'
import {RegisterComponent} from './register/register.component';
import {SellerLoginComponent} from './seller-login/seller-login.component'
import {SellerRegisterComponent} from './seller-register/seller-register.component'
import {HomeComponent} from './home/home.component'
import {AuthGuard} from './guard/auth.guard'
import {SellerHomeComponent} from './seller-home/seller-home.component'
import {AddItemComponent} from './add-item/add-item.component'
import {ReportComponent} from './report/report.component'
import {CheckoutComponent} from './checkout/checkout.component'
import {CartComponent} from './cart/cart.component'
import {UserBuyTrasactionsComponent} from './user-buy-trasactions/user-buy-trasactions.component'
const routes: Routes = [

  {path: '', component: HomeComponent, canActivate: [AuthGuard]},
  {path: 'login', component: LoginComponent},
  {path: 'register', component: RegisterComponent},
  {path: 'sellerlogin', component: SellerLoginComponent},
  {path: 'sellerregister', component: SellerRegisterComponent},
  {path: 'sellerhome', component: SellerHomeComponent},
  {path: 'additem', component: AddItemComponent},
  {path: 'report', component: ReportComponent},
  {path:'checkout',component:CheckoutComponent},
  {path: 'cart',component:CartComponent},
  {path: 'history',component:UserBuyTrasactionsComponent},
  {path: '**', redirectTo: 'login'}


];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule {
}
