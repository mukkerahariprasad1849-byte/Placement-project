package com.project.placement.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.project.placement.model.College;
import com.project.placement.repository.CollegeRepository;

import java.util.List;

@Service
public class CollegeService {

    @Autowired
    private CollegeRepository repo;

    public List<College> getAllColleges() {
        return repo.findAll();
    }

    public College saveCollege(College c) {
        return repo.save(c);
    }

    public void deleteCollege(int id) {
        repo.deleteById(id);
    }

    public College getCollegeById(int id) {
        return repo.findById(id).orElse(null);
    }
}
