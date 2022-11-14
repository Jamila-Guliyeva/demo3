package com.example.demo3.repositories;

import com.example.demo3.entiry.Answer;
import com.example.demo3.entiry.Question;
import com.example.demo3.services.JSONParser;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class QuestRepository {
    JSONParser parser = new JSONParser();
    private QuestionRepository questionRepository = parser.parseQuestionMap();
    private AnswerRepository answerRepository = parser.parseAnswerMap();

    public QuestionRepository getQuestionRepository() {
        return questionRepository;
    }

    public void setQuestionRepository(QuestionRepository questionRepository) {
        this.questionRepository = questionRepository;
    }

    public AnswerRepository getAnswerRepository() {
        return answerRepository;
    }

    public void setAnswerRepository(AnswerRepository answerRepository) {
        this.answerRepository = answerRepository;
    }
}
