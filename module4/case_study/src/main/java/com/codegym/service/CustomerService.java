package com.codegym.service;

import com.codegym.model.Customer;

public interface CustomerService {
    Iterable<Customer> findAll();
    Customer findById(String id);
    void save(Customer customer) throws DuplicateIDException;
    void remove(String id);
    boolean existId(String id);
}
