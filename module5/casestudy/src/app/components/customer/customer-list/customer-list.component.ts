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

  // customers = CustomerDAO;
  // customers: Customer[];
  collection: any;

  constructor(public dialog: MatDialog, private customerService: CustomerService) { }

  ngOnInit(): void {
    // this.customers = this.customerService.getAllCustomer();
    this.customerService.getAllCustomer().subscribe( data => {
      this.collection = data;
    });
  }

  openDetail(id){
    this.customerService.findById(id).subscribe(data => {
      const dialogRef = this.dialog.open(CustomerDetailComponent, {
        width: '400px',
        data: data
      });
    });
  }

  openDelete(id){
    this.customerService.findById(id).subscribe(data => {
      const dialogRef = this.dialog.open(CustomerDeleteComponent, {
        width: '300px',
        height: '200px',
        data : data
      });
      dialogRef.afterClosed().subscribe( () => {
        this.ngOnInit();
      });
    });

  }
}
