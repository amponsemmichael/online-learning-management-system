package com.amponsem.lms_platform.repository;



import com.amponsem.lms_platform.entity.Content;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ContentRepository extends MongoRepository<Content, String> {
}

