package com.example.demo3.services;

import com.example.demo3.entiry.Answer;
import com.example.demo3.entiry.Question;
import com.example.demo3.repositories.AnswerRepository;
import com.example.demo3.repositories.QuestionRepository;
import java.util.ArrayList;
import java.util.List;

public class GameServices {

    QuestionRepository questionRepository;
    AnswerRepository answerRepository;

    public GameServices(QuestionRepository questionRepository, AnswerRepository answerRepository) {
        this.questionRepository = questionRepository;
        this.answerRepository = answerRepository;
    }

    public List<Answer> findAnswersById(int id){
        Question question = questionRepository.findAQuestionById(id);
        List<Long> answersIds = question.getAnswersIdList();
        List<Answer> answers = new ArrayList<>();
        for (Long answerId: answersIds) {
            answers.add(answerRepository.findAnswerById(answerId));
        }
        return answers;
    }
}
