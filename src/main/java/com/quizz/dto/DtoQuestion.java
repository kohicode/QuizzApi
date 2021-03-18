package com.quizz.dto;

import com.quizz.data.QuestionData;
import com.quizz.entity.Answer;
import com.quizz.entity.Question;

import java.util.List;

public class DtoQuestion {
    private int id;
    private String question;
    private boolean isMultipleChoiceQuestion;
    private int itemId;
    private List<DtoAnswer> answers;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public boolean isMultipleChoiceQuestion() {
        return isMultipleChoiceQuestion;
    }

    public void setMultipleChoiceQuestion(boolean multipleChoiceQuestion) {
        isMultipleChoiceQuestion = multipleChoiceQuestion;
    }

    public int getItemId() {
        return itemId;
    }

    public void setItemId(int itemId) {
        this.itemId = itemId;
    }

    public List<DtoAnswer> getAnswers() {
        return answers;
    }

    public void setAnswers(List<DtoAnswer> answers) {
        this.answers = answers;
    }

    public DtoQuestion(int id, String question, boolean isMultipleChoiceQuestion, int itemId, List<DtoAnswer> answers) {
        this.id = id;
        this.question = question;
        this.isMultipleChoiceQuestion = isMultipleChoiceQuestion;
        this.itemId = itemId;
        this.answers = answers;
    }

    public Question toEntity(){
        return new Question(question);
    }
}
