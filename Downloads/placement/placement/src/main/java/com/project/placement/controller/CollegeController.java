package com.project.placement.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import com.project.placement.model.College;
import com.project.placement.service.CollegeService;

@Controller
public class CollegeController {

    @Autowired
    private CollegeService service;

    @GetMapping("/colleges")
    public String getColleges(Model model) {
        model.addAttribute("colleges", service.getAllColleges());
        return "colleges";
    }

    @PostMapping("/addCollege")
    public String addCollege(@ModelAttribute College c) {
        service.saveCollege(c);
        return "redirect:/colleges";
    }

    @GetMapping("/deleteCollege/{id}")
    public String deleteCollege(@PathVariable int id) {
        service.deleteCollege(id);
        return "redirect:/colleges";
    }

    @GetMapping("/editCollege/{id}")
    public String editCollege(@PathVariable int id, Model model) {
        College college = service.getCollegeById(id);
        model.addAttribute("college", college);
        return "editCollege";
    }
}
