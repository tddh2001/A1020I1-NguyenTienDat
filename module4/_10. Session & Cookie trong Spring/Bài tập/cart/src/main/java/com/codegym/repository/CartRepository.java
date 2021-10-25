package com.codegym.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;
import com.codegym.model.Cart;

@Service
public interface CartRepository extends JpaRepository<Cart,Integer> {

}
