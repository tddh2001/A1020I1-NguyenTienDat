package vn.codegym.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import vn.codegym.model.MyCounter;

@Controller
public class CounterController {
    @ModelAttribute("mycounter")
    public MyCounter setUpCounter(){
        return new MyCounter();
    }
    @GetMapping("/")
    public String get(@ModelAttribute("mycounter") MyCounter myCounter){
        myCounter.increment();
        return "index";
    }
}
