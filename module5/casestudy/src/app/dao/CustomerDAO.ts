import {Customer} from '../model/Customer';
import {TypeCustomerDAO} from './TypeCustomerDAO';


export let CustomerDAO: Customer[] = [
  {
    id: 1,
    name: 'Nguyễn Tiến Đạt',
    typeCustomer: TypeCustomerDAO[2],
    // @ts-ignore
    dateOfBirth: '2001-11-18',
    iDCard: '197385811',
    email: 'ngtiendat@gmail.com',
    phone: '0858158157',
    address: 'Quảng Trị'
  },
  {
    id: 2,
    name: 'Trần Vũ Hồng Đan',
    typeCustomer: TypeCustomerDAO[1],
    // @ts-ignore
    dateOfBirth: '2001-12-18',
    iDCard: '198723823',
    email: 'tvhdan@gmail.com',
    phone: '0912345678',
    address: 'Kon Tum'
  }
];
