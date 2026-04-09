package com.project.placement.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import com.project.placement.model.Certificate;
import com.project.placement.service.CertificateService;

@Controller
public class CertificateController {

    @Autowired
    private CertificateService service;

    @GetMapping("/certificates")
    public String getCertificates(Model model) {
        model.addAttribute("certificates", service.getAllCertificates());
        return "certificates";
    }

    @PostMapping("/addCertificate")
    public String addCertificate(@ModelAttribute Certificate c) {
        service.saveCertificate(c);
        return "redirect:/certificates";
    }

    @GetMapping("/deleteCertificate/{id}")
    public String deleteCertificate(@PathVariable int id) {
        service.deleteCertificate(id);
        return "redirect:/certificates";
    }

    @GetMapping("/editCertificate/{id}")
    public String editCertificate(@PathVariable int id, Model model) {
        Certificate cert = service.getCertificateById(id);
        model.addAttribute("certificate", cert);
        return "editCertificate";
    }
}
