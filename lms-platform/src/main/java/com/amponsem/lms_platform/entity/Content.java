package com.amponsem.lms_platform.entity;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Setter
@Getter
@Document(collection = "contents")
public class Content {
    @Id
    private String id;
    private String courseId;
    private String contentType; // e.g., "video", "pdf"
    private String contentUrl;

    // Getters and Setters

}

