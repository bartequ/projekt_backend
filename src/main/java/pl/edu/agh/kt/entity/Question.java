package pl.edu.agh.kt.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

@Entity
public class Question {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @NotNull
    private String content;

    @NotNull
    private String answers;

    @NotNull
    private String correct;

    public Integer getId() {
        return id;
    }

    public String getContent() {
        return content;
    }

    public String getAnswers() {
        return answers;
    }

    public String getCorrect() {
        return correct;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public void setAnswers(String answers) {
        this.answers= answers;
    }

    public void setCorrect(String correct) {
        this.correct = correct;
    }
}
