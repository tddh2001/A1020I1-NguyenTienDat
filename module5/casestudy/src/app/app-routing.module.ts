import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import {CustomerListComponent} from './components/customer/customer-list/customer-list.component';
import {CustomerCreateComponent} from './components/customer/customer-create/customer-create.component';


const routes: Routes = [
  {path: '', component: CustomerListComponent},
  {path: 'create', component: CustomerCreateComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
