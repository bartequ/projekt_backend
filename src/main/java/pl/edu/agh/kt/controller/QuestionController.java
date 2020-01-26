package pl.edu.agh.kt.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
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

    @CrossOrigin(origins = "http://localhost:3000")
    @GetMapping(path = "/questions")
    public List<Question> getQuestions() {
        return questionService.getAllQuestions();
    }

    @CrossOrigin(origins = "http://localhost:3000")
    @GetMapping(path = "/randQuestions")
    public List<Question> getRandQuestions() {
        return questionService.getRandQuestions(5);
    }
}
