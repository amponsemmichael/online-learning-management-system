package com.amponsem.lms_platform.repository;

import com.amponsem.lms_platform.entity.Course;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface CourseRepository extends MongoRepository<Course, String> {
}

