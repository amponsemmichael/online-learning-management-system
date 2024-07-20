package com.amponsem.lms_platform.repository;

import com.amponsem.lms_platform.entity.Role;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface RoleRepository extends MongoRepository<Role, String> {
    // Additional query methods can be defined here
}
