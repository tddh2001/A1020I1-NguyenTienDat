drop database if exists account_management;

create database account_management;

use account_management;

create table accounts (
	account_number int(20) primary key,
	account_type varchar(10),
    `date` date,
    balance bigint
);

create table customers (
	customer_number int(20) primary key,
    fullname varchar(20),
    address varchar(30),
    email varchar(20),
    phone int(11),
    account_number int(20),
    foreign key (account_number) references accounts (account_number)
);

create table transactions (
	tran_number int(20) primary key,
    account_number int(20),
    `date` date,
	amounts bigint,
    descriptions varchar(100),
    foreign key (account_number) references accounts (account_number)
);
