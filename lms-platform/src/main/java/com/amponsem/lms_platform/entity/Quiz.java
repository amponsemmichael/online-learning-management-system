package com.amponsem.lms_platform.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "quizzes")
public class Quiz {
    @Id
    private String id;
    private String courseId;
    private String question;
    private String answer;

    // Getters and Setters
}

