package com.amponsem.lms_platform.controller;

import com.amponsem.lms_platform.entity.Role;
import com.amponsem.lms_platform.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/roles")
public class RoleController {

    @Autowired
    private RoleService roleService;

    @GetMapping
    public List<Role> getAllRoles() {
        return roleService.findAll();
    }

    @PostMapping
    public Role createRole(@RequestBody Role role) {
        return roleService.save(role);
    }

    @GetMapping("/{id}")
    public Role getRoleById(@PathVariable String id) {
        return roleService.findById(id);
    }

    @PutMapping("/{id}")
    public Role updateRole(@PathVariable String id, @RequestBody Role role) {
        role.setId(id);
        return roleService.save(role);
    }

    @DeleteMapping("/{id}")
    public void deleteRole(@PathVariable String id) {
        roleService.deleteById(id);
    }
}

