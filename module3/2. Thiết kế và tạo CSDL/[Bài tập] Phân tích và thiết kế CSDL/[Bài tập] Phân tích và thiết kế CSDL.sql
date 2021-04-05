drop database if exists oto_management;

create database oto_management;

use oto_management;

create table offices(
	officeCode int primary key,
	city varchar(50),
	phone varchar(50),
	addressLine1 varchar(50),
	addressLine2  varchar(50),
	state  varchar(50),
	country varchar(50),
	postalCode varchar(15)
);
create table employees(
	employeeNumber int primary key,
    lastName varchar(50),
    firstName varchar(50),
    email varchar(100),
    jobTitle varchar(50),
    reportTo int,
    foreign key (reportTo) references employees (employeeNumber),
    officeCode int,
    foreign key (officeCode) references offices (officeCode)
);
create table customers(
	customerNumber int(20) primary key,
    customerName varchar(50),
    contactLastName varchar(50),
    contactFirstName varchar(50),
    phone int(50),
    addressLine1 varchar(50),
    addressLine2 varchar(50),
    city varchar(50),
    state varchar(50),
    postalCode int(15),
    country varchar(50),
    creditLimit float,
    employeeNumber int,
    foreign key (employeeNumber) references employees (employeeNumber)
);
create table products_line(
	productLine int primary key,
    textDescription varchar(100),
    image char
);
create table products(
	productCode int primary key,
    productName varchar(70),
    productScale varchar(10),
	productVendor varchar(50),
    productDescription text,
    quantityInStock int,
    buyPrice float,
    MSRP float,
    productLine int,
    foreign key (productLine) references products_line (productLine)
);
create table oders(
	orderNumber int primary key,
    orderDate date,
    requiredDate date,
    shippedDate date,
    `status` varchar(15),
    comments text,
    quantityOrdered int,
    priceEach float,
    customerNumber int(20),
    foreign key (customerNumber) references customers (customerNumber)
);
create table payments(
	customerNumber int(20),
    checkNumber varchar(50),
    paymentDate date,
    amount float,
    foreign key (customerNumber) references customers (customerNumber)
);
create table order_details(
	productCode int,
    orderNumber int,
    foreign key (productCode) references products (productCode),
    foreign key (orderNumber) references oders (orderNumber)
);

