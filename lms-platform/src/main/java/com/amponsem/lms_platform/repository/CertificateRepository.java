package com.amponsem.lms_platform.repository;

import com.amponsem.lms_platform.entity.Certificate;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface CertificateRepository extends MongoRepository<Certificate, String> {
}

