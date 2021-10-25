package com.codegym.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import com.codegym.model.Credential;
import com.codegym.model.User;

@Controller
public class HomeController {

    @GetMapping("/")
    public String index(@ModelAttribute("credential") Credential credential){
        return "index";
    }

    @PostMapping("/login")
    public String dashboard(@ModelAttribute("credential") Credential credential, Model model) {
        User user = new User();
        user.setUserName(credential.getUsername());
        model.addAttribute("user", user);
        return "redirect:dashboard";
    }
}