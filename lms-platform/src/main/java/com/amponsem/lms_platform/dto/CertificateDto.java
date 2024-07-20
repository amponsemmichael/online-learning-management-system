package com.amponsem.lms_platform.dto;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class CertificateDto {
    // Getters and setters
    private String id;
    private String studentId;
    private String courseId;
    private String issueDate;
    private String expirationDate;
    private String status;

}
