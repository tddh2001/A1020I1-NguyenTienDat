package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import service.CalculationService;

@Controller
public class CalculationController {
    @GetMapping("/")
    public ModelAndView HomePage(){
        return new ModelAndView("index");
    }
    @Autowired
    CalculationService calculationService;
    @GetMapping("/calculator")
    public ModelAndView plus(@RequestParam Integer num1, @RequestParam Integer num2, @RequestParam String operator){
        ModelAndView modelAndView = new ModelAndView("index");
        double result = 0.0;
        try {
            result= calculationService.calculation(num1, num2, operator);
        }catch (Exception e){
            e.printStackTrace();
        }
        modelAndView.addObject("result", result);
        return modelAndView;
    }
}
