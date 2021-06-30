package vn.codegym.blog.repository;

import vn.codegym.blog.model.Blog;

import java.util.List;

public interface BlogRepository {
    List<Blog> findAll();
    Blog findById(int id);
    void save(Blog blog);
    void remove(Blog blog);
    List<Blog> searchByName(String kq);
    void update(Blog blog);

}