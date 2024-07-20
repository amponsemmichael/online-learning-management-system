package com.amponsem.lms_platform.service;

import com.amponsem.lms_platform.entity.Role;
import com.amponsem.lms_platform.repository.RoleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class RoleService {

    @Autowired
    private RoleRepository roleRepository;

    public Role save(Role role) {
        return roleRepository.save(role);
    }

    public Role findById(String id) {
        return roleRepository.findById(id).orElse(null);
    }

    public void deleteById(String id) {
        roleRepository.deleteById(id);
    }

    public List<Role> findAll() {
        return roleRepository.findAll();
    }
}

