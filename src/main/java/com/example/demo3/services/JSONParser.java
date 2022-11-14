package com.example.demo3.services;

import com.example.demo3.entiry.Answer;
import com.example.demo3.entiry.Question;
import com.example.demo3.repositories.AnswerRepository;
import com.example.demo3.repositories.QuestionRepository;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.util.Map;

public class JSONParser {
    private QuestionRepository questionRepository;
    private AnswerRepository answerRepository;

    public QuestionRepository parseQuestionMap(){
        File questionListJson = new File("C:\\Users\\Jama\\Desktop\\Java\\demo3\\src\\main\\resources\\questionsList.json");
        ObjectMapper mapper = new ObjectMapper();
        try {
            questionRepository = new QuestionRepository(mapper.readValue(questionListJson, Map.class));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return questionRepository;
    }

    public AnswerRepository parseAnswerMap(){
        File answerListJson = new File("C:\\Users\\Jama\\Desktop\\Java\\demo3\\src\\main\\resources\\answersList.json");
        ObjectMapper mapper = new ObjectMapper();
        try {
            answerRepository = new AnswerRepository(mapper.readValue(answerListJson, Map.class));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return answerRepository;
    }
}
