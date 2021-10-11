package com.codegym.quanlytinh.service;

import com.codegym.quanlytinh.model.Customer;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface CustomerService {
    public Page<Customer> findAll(Pageable pageable);
    public Customer findById(Long id);
    public void save(Customer customer) throws DuplicateEmailException;
    public void remove(Long id);
    public Page<Customer> findAllByFirstNameContaining(String name, Pageable pageable);
}
