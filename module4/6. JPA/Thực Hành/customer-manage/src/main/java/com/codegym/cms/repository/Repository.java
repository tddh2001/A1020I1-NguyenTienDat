package com.codegym.cms.repository;

import com.codegym.cms.model.Customer;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface Repository <T> {
    List<T> findAll();

    T findById(Long id);

    void save(T model);

    void remove(Long id);

    Page<Customer> findAllByFirstNameContaining(String firstname, Pageable pageable);
}