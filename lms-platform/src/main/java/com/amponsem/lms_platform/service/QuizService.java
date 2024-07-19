package com.amponsem.lms_platform.service;

import com.amponsem.lms_platform.entity.Quiz;
import com.amponsem.lms_platform.repository.QuizRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class QuizService {

    @Autowired
    private QuizRepository quizRepository;

    public Quiz save(Quiz quiz) {
        return quizRepository.save(quiz);
    }

    public Quiz findById(String id) {
        return quizRepository.findById(id).orElse(null);
    }

    public void deleteById(String id) {
        quizRepository.deleteById(id);
    }
}
