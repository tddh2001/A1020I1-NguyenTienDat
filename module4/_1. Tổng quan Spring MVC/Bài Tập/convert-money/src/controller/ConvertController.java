package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.text.NumberFormat;

@Controller
public class ConvertController {
    @GetMapping("/")
    public String homePage(){
        return "index";
    }

    @GetMapping("/convert")
    public ModelAndView convertMoney(@RequestParam double money){
        ModelAndView modelAndView = new ModelAndView("index");
        double result = money*23000;
        NumberFormat numberFormat = NumberFormat.getCurrencyInstance();
        String moneyString = numberFormat.format(result);
        modelAndView.addObject("result", moneyString);
        return modelAndView;
    }
}
