package com.project.placement.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.project.placement.model.College;

public interface CollegeRepository extends JpaRepository<College, Integer> {
}