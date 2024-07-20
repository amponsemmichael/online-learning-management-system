package com.amponsem.lms_platform.repository;

import com.amponsem.lms_platform.entity.Quiz;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface QuizRepository extends MongoRepository<Quiz, String> {
}

