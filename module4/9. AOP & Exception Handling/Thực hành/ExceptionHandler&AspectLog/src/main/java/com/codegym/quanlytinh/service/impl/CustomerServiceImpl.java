package com.codegym.quanlytinh.service.impl;

import com.codegym.quanlytinh.model.Customer;
import com.codegym.quanlytinh.repository.CustomerRepository;
import com.codegym.quanlytinh.service.CustomerService;
import com.codegym.quanlytinh.service.DuplicateEmailException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class CustomerServiceImpl implements CustomerService {

    @Autowired
    private CustomerRepository customerRepository;

    @Override
    public Page<Customer> findAll(Pageable pageable) {
        return customerRepository.findAll(pageable);
    }

    @Override
    public Customer findById(Long id) {
        return customerRepository.findById(id).orElse(null);
    }

    @Override
    public void save(Customer customer) throws DuplicateEmailException {
        try {
            customerRepository.save(customer);
        }catch (DataIntegrityViolationException e){
            throw new DuplicateEmailException();
        }

    }

    @Override
    public void remove(Long id) {
        customerRepository.deleteById(id);
    }

    @Override
    public Page<Customer> findAllByFirstNameContaining(String name, Pageable pageable) {
        return customerRepository.findAllByFirstNameContaining(name, pageable);
    }
}
