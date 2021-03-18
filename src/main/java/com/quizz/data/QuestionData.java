package com.quizz.data;

import com.quizz.entity.Question;

import java.util.List;

public class QuestionData {
    private static List<Question> questions;

    public QuestionData() {

    }

    public static List<Question> getQuestions() {
        return questions;
    }
}
