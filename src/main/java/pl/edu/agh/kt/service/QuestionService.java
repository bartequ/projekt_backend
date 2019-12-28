package pl.edu.agh.kt.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.edu.agh.kt.entity.Question;
import pl.edu.agh.kt.repository.QuestionRepository;

import java.util.List;

@Service
public class QuestionService {

    //TODO Add function to query 5 random questions from db
    private QuestionRepository questionRepository;

    @Autowired
    public QuestionService(QuestionRepository questionRepository) {
        this.questionRepository = questionRepository;
    }

    public List<Question> getAllQuestions() {
        return questionRepository.findAll();
    }
}
