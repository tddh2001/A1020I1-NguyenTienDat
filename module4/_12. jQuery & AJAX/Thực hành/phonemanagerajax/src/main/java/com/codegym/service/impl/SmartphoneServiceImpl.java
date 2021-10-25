package com.codegym.service.impl;

import com.codegym.model.Smartphone;
import com.codegym.repository.SmartphoneRepository;
import com.codegym.service.SmartphoneService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class SmartphoneServiceImpl implements SmartphoneService {
    @Autowired
    SmartphoneRepository smartphoneRepository;
    @Override
    public List<Smartphone> findAll() {
        return smartphoneRepository.findAll();
    }

    @Override
    public Smartphone findById(Integer id) {
        return smartphoneRepository.findById(id).orElse(null);
    }

    @Override
    public Smartphone save(Smartphone phone) {
        smartphoneRepository.save(phone);
        return phone;
    }

    @Override
    public Smartphone remove(Integer id) {
        Smartphone phone = findById(id);
        smartphoneRepository.deleteById(id);
        return phone;
    }
}
