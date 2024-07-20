package com.amponsem.lms_platform.controller;

import com.amponsem.lms_platform.entity.Enrollment;
import com.amponsem.lms_platform.service.EnrollmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/enrollments")
public class EnrollmentController {

    @Autowired
    private EnrollmentService enrollmentService;

    @PostMapping
    public Enrollment createEnrollment(@RequestBody Enrollment enrollment) {
        return enrollmentService.save(enrollment);
    }

    @GetMapping("/{id}")
    public Enrollment getEnrollmentById(@PathVariable String id) {
        return enrollmentService.findById(id);
    }

    @PutMapping("/{id}")
    public Enrollment updateEnrollment(@PathVariable String id, @RequestBody Enrollment enrollment) {
        enrollment.setId(id);
        return enrollmentService.save(enrollment);
    }

    @DeleteMapping("/{id}")
    public void deleteEnrollment(@PathVariable String id) {
        enrollmentService.deleteById(id);
    }
}

