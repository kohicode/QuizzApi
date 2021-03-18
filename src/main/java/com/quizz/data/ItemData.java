package com.quizz.data;

import com.google.gson.Gson;
import com.quizz.entity.Item;
import com.quizz.entity.Question;
import com.quizz.method.FileUltil;

import java.util.Arrays;
import java.util.List;

public class ItemData {
    private List<Item> items;

    public ItemData() {
        String itemJson = FileUltil.readFile("src/main/resources/data/item.json");

        Gson gson = new Gson();

        Item[] itemArray = gson.fromJson(itemJson, Item[].class);
        items = Arrays.asList(itemArray);
    }

    public List<Item> getItems() {
        return items;
    }
}
