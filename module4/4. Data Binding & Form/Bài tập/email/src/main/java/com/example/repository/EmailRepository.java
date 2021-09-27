package com.example.repository;

import com.example.model.Email;

import java.util.List;

public interface EmailRepository {
    List<Email> showAll();
    void addEmail(Email email);
}
