package com.amponsem.lms_platform.entity;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Setter
@Getter
@Document(collection = "certificates")
public class Certificate {
    @Id
    private String id;
    private String studentId;
    private String courseId;
    private String certificateUrl;

    // Getters and Setters

}

