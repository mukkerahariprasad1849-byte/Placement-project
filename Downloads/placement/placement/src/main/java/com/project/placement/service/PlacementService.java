package com.project.placement.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.placement.model.Placement;
import com.project.placement.repository.PlacementRepository;

import java.util.List;

@Service
public class PlacementService {

    @Autowired
    private PlacementRepository repo;

    public List<Placement> getAllPlacements() {
        return repo.findAll();
    }

    public Placement savePlacement(Placement p) {
        return repo.save(p);
    }

    public void deletePlacement(int id) {
        repo.deleteById(id);
    }
}