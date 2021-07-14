package vn.codegym.service;

import vn.codegym.model.Category;

public interface CategoryService {
    Iterable<Category> findAll();

    Category findById(int id);

    void save(Category category);

    void remove(int id);
}
