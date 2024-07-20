package com.amponsem.lms_platform.dto;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class ContentDto {
    // Getters and setters
    private String id;
    private String courseId;
    private String title;
    private String description;
    private String contentUrl;
    private String contentType;

}

