package com.amponsem.lms_platform.entity;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Setter
@Getter
@Document(collection = "quizzes")
public class Quiz {
    // Getters and Setters
    @Id
    private String id;
    private String courseId;
    private String question;
    private String answer;


}

