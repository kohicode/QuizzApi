package com.quizz.api;


import com.quizz.data.ItemData;
import com.quizz.data.QuestionData;
import com.quizz.dto.DtoAnswer;
import com.quizz.dto.DtoItem;
import com.quizz.entity.Item;
import com.quizz.entity.Question;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value="/api/item")
public class GetItemData {

    private static final ItemData itemData = new ItemData();

//    private static final DtoItem dtoItem = new DtoItem(itemData.id,itemData.name);
    @GetMapping
    public List<Item> getItem(){
        return itemData.getItems();
    }

}
