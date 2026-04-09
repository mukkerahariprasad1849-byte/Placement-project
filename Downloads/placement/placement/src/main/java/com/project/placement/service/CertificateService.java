package com.project.placement.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.project.placement.model.Certificate;
import com.project.placement.repository.CertificateRepository;

import java.util.List;

@Service
public class CertificateService {

    @Autowired
    private CertificateRepository repo;

    public List<Certificate> getAllCertificates() {
        return repo.findAll();
    }

    public Certificate saveCertificate(Certificate c) {
        return repo.save(c);
    }

    public void deleteCertificate(int id) {
        repo.deleteById(id);
    }

    public Certificate getCertificateById(int id) {
        return repo.findById(id).orElse(null);
    }
}
