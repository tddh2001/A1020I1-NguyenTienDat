package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.List;

@Controller
public class SandwichCondiments {
    @GetMapping("/")
    public ModelAndView homePage(){
        return new ModelAndView("index");
    }
    @PostMapping("/sandwich")
    public ModelAndView sandwich(@RequestParam String[] sandwich){
        ModelAndView modelAndView = new ModelAndView("index");
            List<String> list = new ArrayList<>();
            for (String sw:sandwich){
                list.add(sw);
            }
        modelAndView.addObject("list", list);
        return modelAndView;
    }
}
