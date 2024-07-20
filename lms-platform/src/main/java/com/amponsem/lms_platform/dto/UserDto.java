package com.amponsem.lms_platform.dto;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class UserDto {
    // Getters and setters
    private String id;
    private String username;
    private String password;
    private String role;
    private String email;
    private String firstName;
    private String lastName;

}

