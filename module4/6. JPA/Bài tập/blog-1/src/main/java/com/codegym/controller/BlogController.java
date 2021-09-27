package com.codegym.controller;

import com.codegym.model.Blog;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import com.codegym.service.BlogService;
import com.codegym.service.impl.BlogServiceImpl;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.List;

@Controller
public class BlogController {
    @Autowired
    private BlogService blogService = new BlogServiceImpl();
    @GetMapping("/")
    public String index(Model model){
        List<Blog> blogs = blogService.findAll();
        model.addAttribute("blog", blogs);
//        Blog blog = new Blog("Oda", "One piece", "content chap 1000");
//        this.blogService.save(blog);
        return "/blog/index";
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
