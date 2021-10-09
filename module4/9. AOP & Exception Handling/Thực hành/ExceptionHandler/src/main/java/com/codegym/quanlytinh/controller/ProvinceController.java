package com.codegym.quanlytinh.controller;

import com.codegym.quanlytinh.model.Province;
import com.codegym.quanlytinh.service.ProvinceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.Optional;

@Controller
public class ProvinceController {
    @Autowired
    ProvinceService provinceService;

    @GetMapping("/provinces")
    public String list(@RequestParam("s") Optional<String> s, Model model, @PageableDefault(value = 3) Pageable pageable){
        Page<Province> provinces;
        if (s.isPresent()){
            provinces = provinceService.findAllByNameContaining(s.get(), pageable);
        }else {
            provinces = provinceService.findAll(pageable);
        }
        model.addAttribute("provinces", provinces);
        return "/province/list";
    }
    @GetMapping("/create-province")
    public String showCreate(Model model){
        model.addAttribute("province", new Province());
        return "/province/create";
    }
    @PostMapping("create-province")
    public String create(Model model, Province province, RedirectAttributes redirectAttributes){
        provinceService.save(province);
        model.addAttribute("province", province);
        redirectAttributes.addFlashAttribute("msgCreate", "Create Province Successfully");
        return "redirect:/provinces";
    }
    @GetMapping("/edit-province/{id}")
    public String showEdit(Model model, @PathVariable Long id){
        Province province = provinceService.findById(id);
        model.addAttribute("province" , province);
        return "/province/edit";
    }
    @PostMapping("edit-province")
    public String edit(Province province, Model model, RedirectAttributes redirectAttributes){
        provinceService.save(province);
        model.addAttribute("province", province);
        redirectAttributes.addFlashAttribute("msgEdit", "Edit province successfully");
        return "redirect:/provinces";
    }
    @GetMapping("/delete-province/{id}")
    public String showDelete(Model model, @PathVariable Long id){
        Province province = provinceService.findById(id);
        model.addAttribute(province);
        return "/province/delete";
    }
    @PostMapping("delete-province")
    public String delete(Province province, RedirectAttributes redirectAttributes){
        provinceService.remove(province.getId());
        redirectAttributes.addFlashAttribute("msgDelete", "Delete province successfully");
        return "redirect:/provinces";
    }
}
