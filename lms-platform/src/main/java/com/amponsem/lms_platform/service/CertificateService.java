package com.amponsem.lms_platform.service;

import com.amponsem.lms_platform.entity.Certificate;
import com.amponsem.lms_platform.repository.CertificateRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CertificateService {

    @Autowired
    private CertificateRepository certificateRepository;

    public Certificate save(Certificate certificate) {
        return certificateRepository.save(certificate);
    }

    public Certificate findById(String id) {
        return certificateRepository.findById(id).orElse(null);
    }

    public void deleteById(String id) {
        certificateRepository.deleteById(id);
    }
}
