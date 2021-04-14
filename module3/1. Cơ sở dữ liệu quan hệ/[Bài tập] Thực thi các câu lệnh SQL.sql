create database customers_management;

use customers_management;

create table customers(
customername varchar(30),
phone int,
city varchar(50),
country varchar(50)
);

insert into customers
value('Đạt', 091234567, 'Đà Nẵng', 'Việt Nam');

insert into customers
value('Đan', 093232453, 'Đà Nẵng', 'Việt Nam');

insert into customers
value('Cường', 093232533, 'Quảng Trị', 'Việt Nam');

select *
from customers;

select customerName, phone, city, country 
from customers;

select *
from customers
where customername = 'Đan';

select *
from customers
where customername
like '%t%';

select * 
from customers
where city
in ('Quảng Trị');
