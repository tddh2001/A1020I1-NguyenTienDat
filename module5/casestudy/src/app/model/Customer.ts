import {TypeCustomer} from './TypeCustomer';

export interface Customer{
  id: number;
  name: string;
  typeCustomer: TypeCustomer;
  dateOfBirth: Date;
  iDCard: string;
  email: string;
  phone: string;
  address: string;
}
