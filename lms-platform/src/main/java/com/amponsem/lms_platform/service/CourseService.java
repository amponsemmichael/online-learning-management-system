package com.amponsem.lms_platform.service;

import com.amponsem.lms_platform.entity.Course;
import com.amponsem.lms_platform.repository.CourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CourseService {

    @Autowired
    private CourseRepository courseRepository;

    public List<Course> findAll() {
        return courseRepository.findAll();
    }

    public Course save(Course course) {
        return courseRepository.save(course);
    }

    public Course findById(String id) {
        return courseRepository.findById(id).orElse(null);
    }

    public void deleteById(String id) {
        courseRepository.deleteById(id);
    }
}
