package com.quizz.api;

import com.quizz.data.ItemData;
import com.quizz.data.QuestionData;
import com.quizz.dto.DtoAnswer;
import com.quizz.dto.DtoQuestion;
import com.quizz.entity.Item;
import com.quizz.entity.Question;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value="/api/question")

public class GetQuestionData {

    private static final QuestionData questionData = new QuestionData();

    @GetMapping
    public List<Question> getQuestions(){
        return questionData.getQuestions();
    }

}
