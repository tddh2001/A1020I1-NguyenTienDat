package com.codegym.quanlytinh.service.impl;

import com.codegym.quanlytinh.model.Province;
import com.codegym.quanlytinh.repository.ProvinceRepository;
import com.codegym.quanlytinh.service.ProvinceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class ProvinceServiceImpl implements ProvinceService {
    @Autowired
    ProvinceRepository provinceRepository;
    @Override
    public Page<Province> findAll(Pageable pageable) {
        return provinceRepository.findAll(pageable);
    }

    @Override
    public Province findById(Long id) {
        return provinceRepository.findById(id).orElse(null);
    }

    @Override
    public void save(Province province) {
        provinceRepository.save(province);
    }

    @Override
    public void remove(Long id) {
        provinceRepository.deleteById(id);
    }

    @Override
    public Page<Province> findAllByNameContaining(String name, Pageable pageable) {
        return provinceRepository.findAllByNameContaining(name, pageable);
    }
}
