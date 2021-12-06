import { Injectable } from '@angular/core';
import {CustomerDAO} from '../dao/CustomerDAO';
import {Customer} from '../model/Customer';
import {Observable} from 'rxjs';
import {HttpClient} from '@angular/common/http';

@Injectable()
export class CustomerService {

  customers: Customer[] = CustomerDAO;
  // customers: Customer[] = [];

  customerURL = 'http://localhost:3000/customers';
  customerTypeURL = 'http://localhost:3000/typeCustomer';

  constructor(private httpClient: HttpClient) { }
  // constructor() { }

  // getAllCustomer(){
  //   return this.customers;
  // }

  getAllCustomer(): Observable<Customer[]>{
    // @ts-ignore
    return this.httpClient.get(this.customerURL);
  }

  getAllCustomerType(): Observable<Customer[]>{
    // @ts-ignore
    return this.httpClient.get(this.customerTypeURL);
  }

  addCustomer(customer){
    return this.httpClient.post(this.customerURL, customer);
    // this.httpClient.put(this.customerURL);
  }

  findById(id){
    return this.httpClient.get(this.customerURL + '/' + id);
  }

  deleteCustomer(id){
    return this.httpClient.delete(this.customerURL + '/' + id);
  }


}
