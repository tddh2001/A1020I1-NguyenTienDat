package vn.codegym.service;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import vn.codegym.exception.DuplicateEmailException;
import vn.codegym.model.Customer;

public interface CustomerService {
    Customer findById(int id);

    void save(Customer customer) throws DuplicateEmailException;

    void remove(Customer customer);

    Page<Customer> findAll(Pageable pageable);

    Page<Customer> findAllByFirstNameContaining(String firstname, Pageable pageable);
}
