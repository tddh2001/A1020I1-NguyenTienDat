package controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("converter")
public class ConverterController {
    @RequestMapping(value = "/converter", method = RequestMethod.GET)
    public String converter(){
        return "converter";
    }
    @RequestMapping(value = "/usd", method = RequestMethod.POST)
    public String submit(@RequestParam String usd, String rate, Model model){
        float result = Float.parseFloat(usd)*Float.parseFloat(rate);
        model.addAttribute("result1", result);
        return "submit";
    }
}
