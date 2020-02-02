package pl.edu.agh.kt.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.edu.agh.kt.entity.Question;
import pl.edu.agh.kt.repository.QuestionRepository;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

@Service
public class QuestionService {

    private QuestionRepository questionRepository;

    @Autowired
    public QuestionService(QuestionRepository questionRepository) {
        this.questionRepository = questionRepository;
    }

    public List<Question> getAllQuestions() {
        return questionRepository.findAll();
    }

    public List<Question> getRandQuestions(int amountOfQuestions) {
        List<Question> allQuestions = getAllQuestions();
        List<Question> randomQuestions = new ArrayList<>();
        for (int i = 0; i < amountOfQuestions; i++) {
           getQuestion(allQuestions, randomQuestions);
        }
        return randomQuestions;
    }

    private void getQuestion(List<Question> allQuestions, List<Question> randomQuestions) {
        int randomInt = ThreadLocalRandom.current().nextInt(1, allQuestions.size());
        Question question = allQuestions.get(randomInt);
        if (!randomQuestions.contains(question)) {
            randomQuestions.add(question);
        } else {
            getQuestion(allQuestions, randomQuestions);
        }
    }
}
