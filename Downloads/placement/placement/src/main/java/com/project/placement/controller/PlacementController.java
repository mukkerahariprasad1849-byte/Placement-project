package com.project.placement.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import com.project.placement.model.Placement;
import com.project.placement.service.PlacementService;

@Controller
public class PlacementController {

    @Autowired
    private PlacementService service;

    @GetMapping("/placements")
    public String getPlacements(Model model) {
        model.addAttribute("placements", service.getAllPlacements());
        return "placements";
    }

    @PostMapping("/addPlacement")
    public String addPlacement(@ModelAttribute Placement p) {
        service.savePlacement(p);
        return "redirect:/placements";
    }

    @GetMapping("/deletePlacement/{id}")
    public String deletePlacement(@PathVariable int id) {
        service.deletePlacement(id);
        return "redirect:/placements";
    }
}
