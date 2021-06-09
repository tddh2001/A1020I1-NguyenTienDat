package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import service.CustomerService;

@Controller
@RequestMapping(value = "customer")
public class CustomerController {
    @Autowired
    CustomerService customerService;
    @RequestMapping(value = "/list", method = RequestMethod.GET)
    public ModelAndView showCustomerList(){
        return new ModelAndView("list", "customerList", customerService.findAll());
    }
}
