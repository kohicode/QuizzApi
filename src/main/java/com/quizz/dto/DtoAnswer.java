package com.quizz.dto;


public class DtoAnswer {
    private int id;
    private String answer;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    public DtoAnswer(int id, String answer) {
        this.id = id;
        this.answer = answer;
    }
}
