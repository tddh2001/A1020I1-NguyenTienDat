package com.codegym.controller;

import com.codegym.model.User;
import com.codegym.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.validation.Valid;

@Controller
public class UserController {
    @Autowired
    UserService userService;

    @GetMapping("/")
    public String index(Model model){
        Iterable<User> users =userService.findAll();
        model.addAttribute("users", users);
        return "/index";
    }

    @GetMapping("/create")
    public String showCreate(Model model){
        model.addAttribute("user", new User());
        return "/create";
    }

    @PostMapping("/create")
    public String create(@Valid @ModelAttribute User user, BindingResult bindingResult, RedirectAttributes redirectAttributes){
        if (bindingResult.hasErrors()){
            return "/create";
        } else {
            userService.save(user);
            redirectAttributes.addFlashAttribute("createSuccess", "Create user successfully.");
            return "redirect:/";
        }
    }
}
