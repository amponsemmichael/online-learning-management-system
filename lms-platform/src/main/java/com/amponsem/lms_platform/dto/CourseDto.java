package com.amponsem.lms_platform.dto;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class CourseDto {
    // Getters and setters
    private String id;
    private String title;
    private String description;
    private String category;
    private String instructorId;
    private String startDate;
    private String endDate;

}
