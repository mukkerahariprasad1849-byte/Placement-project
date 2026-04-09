package com.project.placement.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import com.project.placement.model.Student;
import com.project.placement.service.StudentService;

@Controller
public class StudentController {

    @Autowired
    private StudentService service;

    @GetMapping("/students")
    public String viewStudents(Model model) {
        model.addAttribute("students", service.getAllStudents());
        return "students";
    }

    @PostMapping("/addStudent")
    public String addStudent(@ModelAttribute Student s) {
        service.saveStudent(s);
        return "redirect:/students";
    }
}
