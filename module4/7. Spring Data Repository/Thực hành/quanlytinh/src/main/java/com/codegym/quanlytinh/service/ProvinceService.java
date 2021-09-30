package com.codegym.quanlytinh.service;

import com.codegym.quanlytinh.model.Province;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface ProvinceService {
    Page<Province> findAll(Pageable pageable);

    Province findById(Long id);

    void save(Province province);

    void remove(Long id);

    Page<Province> findAllByNameContaining(String name, Pageable pageable);
}
