package com.quizz.data;

import com.google.gson.Gson;
import com.quizz.entity.Item;
import com.quizz.entity.Question;
import com.quizz.method.FileUltil;

import java.util.Arrays;
import java.util.List;

public class QuestionData {
    private static List<Question> questions;

    public QuestionData() {
        String questionJson = FileUltil.readFile("src/main/resources/data/question.json");

        Gson gson = new Gson();

        Question[] questionArray = gson.fromJson(questionJson, Question[].class);
        questions = Arrays.asList(questionArray);
    }

    public List<Question> getQuestions() {
        return questions;
    }

}
