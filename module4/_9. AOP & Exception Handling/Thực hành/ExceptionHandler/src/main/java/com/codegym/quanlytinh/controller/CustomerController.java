package com.codegym.quanlytinh.controller;

import com.codegym.quanlytinh.model.Customer;
import com.codegym.quanlytinh.model.Province;
import com.codegym.quanlytinh.service.CustomerService;
import com.codegym.quanlytinh.service.DuplicateEmailException;
import com.codegym.quanlytinh.service.ProvinceService;
import com.codegym.quanlytinh.service.impl.CustomerServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.Optional;

@Controller
public class CustomerController {
    @Autowired
    CustomerService customerService;
    @Autowired
    ProvinceService provinceService;

    @ModelAttribute("provinces")
    public Page<Province> provinces(Pageable pageable){
        return provinceService.findAll(pageable);
    }
    @GetMapping("/")
    public String index(){
        return "index";
    }

    @GetMapping("/create-customer")
    public String showCreateForm(Model model){
        model.addAttribute("customer", new Customer());
        return "/customer/create";
    }
    @PostMapping("/create-customer")
    public String saveCustomer(@ModelAttribute("customer") Customer customer, Model model) throws DuplicateEmailException{
            customerService.save(customer);
            model.addAttribute("customer", new Customer());
            model.addAttribute("msg", "Create new customer cussessfully");
            return "redirect:/customers";
    }
    @ExceptionHandler(DuplicateEmailException.class)
    public String showInputNotAcceptable(){
        return "inputs-not-acceptable";
    }
    @GetMapping("/customers")
    public String listCustomers(Model model, @RequestParam("s") Optional<String> s, @PageableDefault(value = 5) Pageable pageable){
        Page<Customer> customers;
        if (s.isPresent()){
            customers = customerService.findAllByFirstNameContaining(s.get(), pageable);
        } else {
            customers = customerService.findAll(pageable);
        }
        model.addAttribute("customers", customers);
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
        try {
            customerService.save(customer);
            model.addAttribute("customer", customer);
            redirectAttributes.addFlashAttribute("msg", "Edit customer successfully");
            return "redirect:/customers";
        }catch (DuplicateEmailException e){
            return "inputs-not-acceptable";
        }
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
