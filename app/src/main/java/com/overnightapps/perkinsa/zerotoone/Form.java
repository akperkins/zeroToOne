package com.overnightapps.perkinsa.zerotoone;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/**
 * This class is responsible for representing the mapping between question and answers by the user.
 * */
public class Form {
    final private Map<Question, String> map;

    public Form(List<Question> questionList) {
        Preconditions.checkNotEmpty(questionList);
        this.map = new LinkedHashMap<>();
        for(Question question: questionList){
            this.map.put(question, "");
        }
    }

    public boolean hasEmptyField() {
        for(String answer: map.values()){
            if(Util.isEmpty(answer)){
                return true;
            }
        }
        return false;
    }

    public void answer(Question question, String answer) {
        Preconditions.checkNotNull(question);
        Preconditions.checkNotNull(answer);
        map.put(question, answer);
    }
}
