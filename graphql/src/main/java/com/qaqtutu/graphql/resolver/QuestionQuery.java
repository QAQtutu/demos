package com.qaqtutu.graphql.resolver;

import com.qaqtutu.graphql.model.Question;
import graphql.kickstart.tools.GraphQLQueryResolver;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class QuestionQuery implements GraphQLQueryResolver {


    public Question getQuestionById(long id) {
        Question question = new Question();
        question.setId(id);
        question.setTitle("title");
        question.setContent("content");
        question.setUserId(1);
        return question;
    }

    public List<Question> allQuestion() {
        Question question = new Question();
        question.setId(2L);
        question.setTitle("title");
        question.setContent("content");
        question.setUserId(1);
        return new ArrayList<>();
    }
}