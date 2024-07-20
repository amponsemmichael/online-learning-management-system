package com.amponsem.lms_platform.dto;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class EnrollmentDto {
    // Getters and setters
    private String id;
    private String studentId;
    private String courseId;
    private String enrollmentDate;
    private String status;

}
