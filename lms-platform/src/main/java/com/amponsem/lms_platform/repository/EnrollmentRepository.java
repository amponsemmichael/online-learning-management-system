package com.amponsem.lms_platform.repository;

import com.amponsem.lms_platform.entity.Enrollment;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface EnrollmentRepository extends MongoRepository<Enrollment, String> {

}


