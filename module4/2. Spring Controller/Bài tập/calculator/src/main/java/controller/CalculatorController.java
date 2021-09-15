package controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class CalculatorController {
    @GetMapping("/")
    public String homePage(){
        return "index";
    }
    @GetMapping("/calculator")
    public ModelAndView calculator(@RequestParam("num1") Float num1, @RequestParam("num2") Float num2, @RequestParam(value = "operator", required = false) String operator){
        ModelAndView modelAndView = new ModelAndView("index");
        float result = 0;
        switch (operator){
            case "+":
                result = num1 + num2;
                break;
            case "-":
                result = num1 - num2;
                break;
            case "*":
                result = num1 * num2;
                break;
            case "/":
                if (num2 != 0){
                    result = num1 / num2;
                }else {
                    modelAndView.addObject("err1", "Can't devide by 0.");
                }
                break;
        }
        modelAndView.addObject("num1", num1);
        modelAndView.addObject("num2", num2);
        modelAndView.addObject("operator", operator);
        modelAndView.addObject("result", "Result:"+result);
        return modelAndView;
    }
}
