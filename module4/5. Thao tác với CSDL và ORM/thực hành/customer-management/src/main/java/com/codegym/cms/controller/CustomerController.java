package com.codegym.cms.controller;

import com.codegym.cms.model.Customer;
import com.codegym.cms.service.CustomerService;
import com.codegym.cms.service.impl.CustomerServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.List;

@Controller
public class CustomerController {
    @Autowired
    private CustomerService customerService = new CustomerServiceImpl();
    @GetMapping("/")
    public String showCreateForm(Model model){
        model.addAttribute("customer", new Customer());
        return "/customer/create";
    }
    @PostMapping("/create-customer")
    public String saveCustomer(@ModelAttribute("customer") Customer customer, Model model){
        customerService.save(customer);
        model.addAttribute("customer", new Customer());
        model.addAttribute("msg", "Create new customer cussessfully");
        return "/customer/create";
    }
    @GetMapping("/customers")
    public String listCustomers(Model model){
        List<Customer> customers = customerService.findAll();
        model.addAttribute("customer", customers);
        return "/customer/list";
    }
        @GetMapping("/edit-customer/{id}")
        public String showEditForm(Model model, @PathVariable Long id){
            Customer customer = customerService.findById(id);
                model.addAttribute("customer", customer);
                return "/customer/edit";
        }
    @PostMapping("/edit-customer")
    public String updateCustomer(@ModelAttribute("customer") Customer customer, Model model, RedirectAttributes redirectAttributes){
        customerService.save(customer);
        model.addAttribute("customer", customer);
        redirectAttributes.addFlashAttribute("msg", "Edit customer successfully");
        return "redirect:/customers";
    }

    @GetMapping("/delete-customer/{id}")
    public ModelAndView showDeleteForm(@PathVariable Long id){
        Customer customer = customerService.findById(id);
        if(customer != null) {
            ModelAndView modelAndView = new ModelAndView("/customer/delete");
            modelAndView.addObject("customer", customer);
            return modelAndView;

        }else {
            ModelAndView modelAndView = new ModelAndView("/error.404");
            return modelAndView;
        }
    }

    @PostMapping("/delete-customer")
    public String deleteCustomer(@ModelAttribute("customer") Customer customer, RedirectAttributes redirectAttributes){
        customerService.remove(customer.getId());
        redirectAttributes.addFlashAttribute("delCus", "Delete customer successfully.");
        return "redirect:customers";
    }
}
