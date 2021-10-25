package com.codegym.service;

import com.codegym.model.Blog;
import com.codegym.model.Category;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;
import java.util.UUID;

public interface BlogService {
    public Page<Blog> findAll(Pageable pageable);
    public Blog findById(Long id);
    public void save(Blog blog);
    public void remove(Long id);
    public Page<Blog> findAllByFirstNameContaining(String name, Pageable pageable);
}
