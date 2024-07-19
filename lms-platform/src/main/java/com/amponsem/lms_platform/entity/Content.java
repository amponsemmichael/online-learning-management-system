package com.amponsem.lms_platform.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "contents")
public class Content {
    @Id
    private String id;
    private String courseId;
    private String contentType; // e.g., "video", "pdf"
    private String contentUrl;

    // Getters and Setters
}

