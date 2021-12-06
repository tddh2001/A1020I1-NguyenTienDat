import { Component, OnInit } from '@angular/core';
import {CustomerDAO} from '../../../dao/CustomerDAO';
import {Customer} from '../../../model/Customer';
import {FormControl, FormGroup, Validators} from '@angular/forms';
import {TypeCustomerDAO} from '../../../dao/TypeCustomerDAO';
import {min} from 'rxjs/operators';
import {CustomerService} from '../../../service/customer.service';
import {Router} from '@angular/router';

@Component({
  selector: 'app-customer-create',
  templateUrl: './customer-create.component.html',
  styleUrls: ['./customer-create.component.css']
})
export class CustomerCreateComponent implements OnInit {
  customerForm: FormGroup;

  constructor(private customerService: CustomerService, private router: Router) { }

  typeCustomers = TypeCustomerDAO;

  ngOnInit(): void {
    this.customerForm = new FormGroup({
      id: new FormControl('', [Validators.required, Validators.min(0)]),
      name: new FormControl('', [Validators.required]),
      typeCustomer: new FormControl('', [Validators.required]),
      // @ts-ignore
      dateOfBirth: new FormControl('', [Validators.required]),
      iDCard: new FormControl('', [Validators.required]),
      email: new FormControl('', [Validators.required, Validators.email]),
      phone: new FormControl('', [Validators.required]),
      address: new FormControl('', [Validators.required])
    });
  }

  getCustomerValue(){
    if (this.customerForm.valid){
      this.customerService.addCustomer(this.customerForm.value);
      this.router.navigateByUrl('/');
    }
  }
}
