package com.quizz.api;

import com.quizz.data.ItemData;
import com.quizz.entity.Item;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value="/api/item")

public class GetItemData {

    private static final ItemData itemData = new ItemData();

    @GetMapping
    public List<Item> getItems(){
        return itemData.getItems();
    }

}
