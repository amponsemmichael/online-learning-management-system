package com.amponsem.lms_platform.controller;

import com.amponsem.lms_platform.entity.Certificate;
import com.amponsem.lms_platform.service.CertificateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/certificates")
public class CertificateController {

    @Autowired
    private CertificateService certificateService;

    @PostMapping
    public Certificate createCertificate(@RequestBody Certificate certificate) {
        return certificateService.save(certificate);
    }

    @GetMapping("/{id}")
    public Certificate getCertificateById(@PathVariable String id) {
        return certificateService.findById(id);
    }

    @PutMapping("/{id}")
    public Certificate updateCertificate(@PathVariable String id, @RequestBody Certificate certificate) {
        certificate.setId(id);
        return certificateService.save(certificate);
    }

    @DeleteMapping("/{id}")
    public void deleteCertificate(@PathVariable String id) {
        certificateService.deleteById(id);
    }
}

