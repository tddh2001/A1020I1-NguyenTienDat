import {Component, Inject, OnInit} from '@angular/core';
import {MAT_DIALOG_DATA, MatDialogRef} from '@angular/material/dialog';
import {Customer} from '../../../model/Customer';
import {CustomerService} from '../../../service/customer.service';

@Component({
  selector: 'app-customer-delete',
  templateUrl: './customer-delete.component.html',
  styleUrls: ['./customer-delete.component.css']
})
export class CustomerDeleteComponent implements OnInit {

  constructor(
    private dialogRef: MatDialogRef<CustomerDeleteComponent>,
    @Inject(MAT_DIALOG_DATA) public data: any,
    private customerService: CustomerService
    ) { }

  customer: any;

  ngOnInit(): void {
    this.customer = this.data;
  }

  confirmDelete() {
    this.customerService.deleteCustomer(this.customer.id).subscribe(() => {
      this.dialogRef.close();
    });
  }
}
