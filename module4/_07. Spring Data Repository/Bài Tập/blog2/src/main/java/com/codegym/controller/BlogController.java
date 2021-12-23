package com.codegym.controller;

import com.codegym.model.Blog;
import com.codegym.model.Category;
import com.codegym.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import com.codegym.service.BlogService;
import com.codegym.service.impl.BlogServiceImpl;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.List;
import java.util.Optional;

@Controller
public class BlogController {
    @Autowired
    private BlogService blogService;
    @Autowired
    private CategoryService categoryService;

    @ModelAttribute("category")
    public Page<Category> categories(Pageable pageable){
        return categoryService.findAll(pageable);
    }

    @GetMapping("/")
    public ModelAndView index(@RequestParam("search") Optional<String> s, @PageableDefault(value = 4) Pageable pageable){
        Page<Blog> blogs;
        ModelAndView modelAndView = new ModelAndView("/blog/index");
        if (s.isPresent()){
            blogs = blogService.findAllByFirstNameContaining(s.get(), pageable);
        }else {
            blogs = blogService.findAll(pageable);
        }
        modelAndView.addObject("blog", blogs);
        return modelAndView;
    }

    @GetMapping("/create-blog")
    private String showCreate(Model model){
        model.addAttribute("blog", new Blog());
        return "/blog/create";
    }
    @PostMapping("/create-blog")
    private String create(@ModelAttribute("blog") Blog blog, Model model, RedirectAttributes redirectAttributes){
        blogService.save(blog);
        model.addAttribute("blog", new Blog());
        redirectAttributes.addFlashAttribute("createSuccess", "Create blog successfully");
        return "redirect:/";
    }

    @GetMapping("/edit-blog/{id}")
    public String showEditForm(Model model, @PathVariable Long id){
        Blog blog = blogService.findById(id);
        model.addAttribute("blog", blog);
        return "/blog/edit";
    }

    @PostMapping("edit-blog")
    public String edit(@ModelAttribute("blog") Blog blog, Model model, RedirectAttributes redirectAttributes){
        blogService.save(blog);
        model.addAttribute("blog", blog);
        redirectAttributes.addFlashAttribute("editSuccess", "Edit Blog successfully");
        return "redirect:/";
    }
    @GetMapping("/delete-blog/{id}")
    public String showDeleteForm(Model model, @PathVariable Long id){
        Blog blog = blogService.findById(id);
        model.addAttribute("blog", blog);
        return "/blog/delete";
    }
    @PostMapping("/delete-blog")
    public String delete(@ModelAttribute("blog") Blog blog, Model model, RedirectAttributes redirectAttributes){
        blogService.remove(blog.getId());
        redirectAttributes.addFlashAttribute("deleteSuccess", "Delete Blog Successfully");
        return "redirect:/";
    }
    @GetMapping("/view-blog/{id}")
    public String showView(Model model, @PathVariable Long id){
        model.addAttribute("blog", blogService.findById(id));
        return "/blog/view";
    }
}
