import { Component, OnInit } from '@angular/core';
import {CustomerDAO} from '../../../dao/CustomerDAO';
import {MatDialog} from '@angular/material/dialog';
import {Customer} from '../../../model/Customer';
import {CustomerDetailComponent} from '../customer-detail/customer-detail.component';
import {CustomerDeleteComponent} from '../customer-delete/customer-delete.component';
import {CustomerService} from '../../../service/customer.service';

@Component({
  selector: 'app-customer-list',
  templateUrl: './customer-list.component.html',
  styleUrls: ['./customer-list.component.css']
})
export class CustomerListComponent implements OnInit {

  customers = CustomerDAO;
  // customers: Customer[];
  constructor(public dialog: MatDialog, private customerService: CustomerService) { }

  ngOnInit(): void {
    this.customers = this.customerService.getAllCustomer();
    // this.customerService.getAllCustomer().subscribe(
    //   (data) => this.customers = data,
    //   (error => console.log('Kết nối có lỗi')),
    //   (() => console.log('Hoàn thành kết nối đến backend'))
    // );
  }

  openDetail(customer: Customer){
    const dialogRef = this.dialog.open(CustomerDetailComponent, {
      width: '400px',
      data: customer
    });
  }

  openDelete(customer: Customer){
    const dialogRef = this.dialog.open(CustomerDeleteComponent, {
      data: customer
    });
    dialogRef.afterClosed().subscribe(result => {
      if (result) {
        this.customers = this.customers.filter(item => item !== customer);
      }
    });
  }
}
