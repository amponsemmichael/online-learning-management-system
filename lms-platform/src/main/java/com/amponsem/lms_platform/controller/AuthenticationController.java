package com.amponsem.lms_platform.controller;

import com.amponsem.lms_platform.service.UserService;
import com.amponsem.lms_platform.util.JwtUtil;
import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import org.springframework.security.core.userdetails.UserDetails;

@RestController
@RequestMapping("/auth")
public class AuthenticationController {

    @Autowired
    private JwtUtil jwtUtil;

    @Autowired
    private UserService userService;

    @PostMapping("/login")
    public ResponseEntity<String> authenticateUser(@RequestBody LoginRequest loginRequest) {
        String username = loginRequest.getUsername();
        String password = loginRequest.getPassword();

        // Obtain UserDetails from UserService
        UserDetails userDetails = userService.loadUserByUsername(username);

        // Validate the password (use your own logic here)
        if (userDetails != null && userDetails.getPassword().equals(password)) { // This is just for illustration; use proper password encoding in production
            // Generate JWT token
            String token = jwtUtil.generateToken(userDetails);
            return ResponseEntity.ok(token);
        } else {
            return ResponseEntity.status(401).body("Invalid credentials");
        }
    }

    // DTO for login request
    @Setter
    @Getter
    public static class LoginRequest {
        // Getters and setters
        private String username;
        private String password;

    }
}
