package com.example.quizapp.controller;

import com.example.quizapp.service.QuizService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("quiz")
public class QuizController {

    @Autowired
    QuizService quizService;

    @RequestMapping("create")
    public ResponseEntity<String> createQuiz(@RequestParam String title, @RequestParam String category, @RequestParam int numQ) {
        return quizService.createQuiz(title, category, numQ);
    }
}