package com.amponsem.lms_platform.controller;

import com.amponsem.lms_platform.entity.Quiz;
import com.amponsem.lms_platform.service.QuizService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/quizzes")
public class QuizController {

    @Autowired
    private QuizService quizService;

    @PostMapping
    public Quiz createQuiz(@RequestBody Quiz quiz) {
        return quizService.save(quiz);
    }

    @GetMapping("/{id}")
    public Quiz getQuizById(@PathVariable String id) {
        return quizService.findById(id);
    }

    @PutMapping("/{id}")
    public Quiz updateQuiz(@PathVariable String id, @RequestBody Quiz quiz) {
        quiz.setId(id);
        return quizService.save(quiz);
    }

    @DeleteMapping("/{id}")
    public void deleteQuiz(@PathVariable String id) {
        quizService.deleteById(id);
    }
}
