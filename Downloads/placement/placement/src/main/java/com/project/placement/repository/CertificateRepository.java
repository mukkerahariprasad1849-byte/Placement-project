package com.project.placement.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.project.placement.model.Certificate;

public interface CertificateRepository extends JpaRepository<Certificate, Integer> {
}
