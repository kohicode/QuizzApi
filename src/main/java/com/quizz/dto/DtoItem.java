package com.quizz.dto;

import com.quizz.entity.Item;
import com.quizz.entity.Question;

public class DtoItem {

    private int id;
    private String name;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public DtoItem(int id, String name) {
        this.id = id;
        this.name = name;
    }
}
