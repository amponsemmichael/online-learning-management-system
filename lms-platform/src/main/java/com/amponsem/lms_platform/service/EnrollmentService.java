package com.amponsem.lms_platform.service;

import com.amponsem.lms_platform.entity.Enrollment;
import com.amponsem.lms_platform.repository.EnrollmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EnrollmentService {

    @Autowired
    private EnrollmentRepository enrollmentRepository;

    public Enrollment save(Enrollment enrollment) {
        return enrollmentRepository.save(enrollment);
    }

    public Enrollment findById(String id) {
        return enrollmentRepository.findById(id).orElse(null);
    }

    public void deleteById(String id) {
        enrollmentRepository.deleteById(id);
    }

    public List<Enrollment> getAllEnrollments() {
        return enrollmentRepository.findAll();
    }
}
