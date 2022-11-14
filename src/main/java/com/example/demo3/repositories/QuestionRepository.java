package com.example.demo3.repositories;


import com.example.demo3.entiry.Question;
import java.util.Map;
import java.util.Optional;

public class QuestionRepository {

    private final Map<Long, Question> idToQuestion;

    public QuestionRepository(Map<Long, Question> idToQuestion) {
        this.idToQuestion = idToQuestion;
    }

    public Question findAQuestionById(long id){
        return Optional.ofNullable(idToQuestion.get(id)).get();
    }

    @Override
    public String toString() {
        return "QuestionRepository{" +
                "idToQuestion=" + idToQuestion +
                '}';
    }
}
