package controller;

import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.HashMap;
import java.util.Map;

@Controller
public class DictionaryController {
    @GetMapping("/")
    public String homePage(){
        return "index";
    }

    @GetMapping("/dictionary")
    public ModelAndView lookup(@RequestParam String vietnamese){
        ModelAndView modelAndView = new ModelAndView("index");
        Map<String, String> list = new HashMap<>();
        list.put("Con mèo", "A cat");
        list.put("Con chó", "A dog");
        list.put("Xin chào", "Hello");
        list.put("Bạn là nhất", "You're best");
        list.put("Siêu nhân", "Super man");

        String result = list.get(vietnamese);
        if (result != null) {
            modelAndView.addObject("result","Result: "+ result);
        }else {
            modelAndView.addObject("result", "Not found");
        }
        return modelAndView;
    }
}
