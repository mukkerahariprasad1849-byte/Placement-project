package com.project.placement.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.project.placement.model.Student;

public interface StudentRepository extends JpaRepository<Student, Integer> {
}