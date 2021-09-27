package com.example.service;

import com.example.model.Email;
import com.example.repository.EmailRepository;
import com.example.repository.EmailRepositoryImpl;

import java.util.List;

public class EmailServiceImpl implements EmailService {
    EmailRepository emailRepo= new EmailRepositoryImpl();

    @Override
    public List<Email> showAll() {
        return emailRepo.showAll();
    }

    @Override
    public void addEmail(Email email) {
        emailRepo.addEmail(email);
    }
}