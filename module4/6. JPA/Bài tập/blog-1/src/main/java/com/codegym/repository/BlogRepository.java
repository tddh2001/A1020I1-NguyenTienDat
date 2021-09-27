package com.codegym.repository;

import com.codegym.model.Blog;

import java.util.List;
import java.util.UUID;

public interface BlogRepository<T> {
    List<T> findAll();
    T findById(Long id);
    void save(Blog blog);
    void remove(Long id);
}
