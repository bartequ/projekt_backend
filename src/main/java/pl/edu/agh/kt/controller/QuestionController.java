package pl.edu.agh.kt.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import pl.edu.agh.kt.entity.Question;
import pl.edu.agh.kt.service.QuestionService;

import java.util.List;

@RestController
public class QuestionController {

    private QuestionService questionService;

    @Autowired
    public QuestionController(QuestionService questionService) {
        this.questionService = questionService;
    }

    @GetMapping(path = "/questions")
    public List<Question> getQuestions() {
        return questionService.getAllQuestions();
    }
}
