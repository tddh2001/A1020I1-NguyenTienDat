import { Injectable } from '@angular/core';
import {CustomerDAO} from '../dao/CustomerDAO';
import {Customer} from '../model/Customer';
import {Observable} from 'rxjs';
import {HttpClient} from '@angular/common/http';

@Injectable()
export class CustomerService {

  customers: Customer[] = CustomerDAO;
  // customers: Customer[] = [];
  // readonly API_URL = 'http://localhost:3000/';

  // constructor(private httpClient: HttpClient) { }
  constructor() { }

  getAllCustomer(){
    return this.customers;
  }

  // getAllCustomer(): Observable<Customer[]>{
  //   return this.httpClient.get<Customer[]>(this.API_URL);
  // }

  addCustomer(customer: Customer){
    this.customers.push(customer);
  }
}
