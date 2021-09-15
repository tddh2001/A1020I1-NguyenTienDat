package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class SandwichController {
    @GetMapping("/")
    public String homePage(){
        return "index";
    }
    @GetMapping("/save")
    public ModelAndView save(@RequestParam("condiment") String condiment){
        ModelAndView modelAndView = new ModelAndView("/index");
        modelAndView.addObject("condiment", condiment);
        modelAndView.addObject("msg", condiment);
        return modelAndView;
    }
}
