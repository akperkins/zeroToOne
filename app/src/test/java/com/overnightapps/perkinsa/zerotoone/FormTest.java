package com.overnightapps.perkinsa.zerotoone;/*
 * Copyright (c) 2016 Nick Mobile as an unpublished work. Neither
 * this material nor any portion thereof may be copied or distributed
 * without the express written consent of Nick Mobile.
 * This material also contains proprietary and confidential information
 * of 2016 Nick Mobile and its suppliers, and may not be used by or
 * disclosed to any person, in whole or in part, without the prior written
 * consent of 2016 Nick Mobile.
 */

import android.support.annotation.NonNull;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class FormTest {

    @Test(expected = AssertionError.class)
    public void constructor_nullListPassed_exceptionThrown() throws Exception {
        Form form = new Form(null);
    }

    @Test(expected = AssertionError.class)
    public void constructor_listIsEmpty_exceptionThrown() throws Exception {
        Form form = new Form(Collections.emptyList());
    }

    @Test(expected = AssertionError.class)
    public void answer_questionIsNull_exceptionThrown() throws Exception {
        Question o = getQuestion(0);
        Form form = new Form(Collections.singletonList(o));
        form.answer(o, null);

        boolean isEmptyField = form.hasEmptyField();

        assertThat(isEmptyField).isTrue();
    }

    @Test(expected = AssertionError.class)
    public void answer_answerIsNull_exceptionThrown() throws Exception {
        Question o = getQuestion(0);
        Form form = new Form(Collections.singletonList(o));
        form.answer(null, "");

        boolean isEmptyField = form.hasEmptyField();

        assertThat(isEmptyField).isTrue();
    }

    @Test
    public void hasEmptyField_listContainsSingleUnansweredQuestion_returnsTrue() throws Exception {
        Question o = getQuestion(0);
        Form form = new Form(Collections.singletonList(o));

        boolean isEmptyField = form.hasEmptyField();

        assertThat(isEmptyField).isTrue();
    }

    @Test
    public void hasEmptyField_listContainsSingleAnsweredQuestion_returnsFalse() throws Exception {
        Question o = getQuestion(0);
        Form form = new Form(Collections.singletonList(o));

        form.answer(o, "question");
        boolean isEmptyField = form.hasEmptyField();

        assertThat(isEmptyField).isFalse();
    }

    @Test
    public void hasEmptyField_listContainsAnsweredAndUnansweredQuestions_returnsTrue() throws Exception {
        List<Question> questionList = new ArrayList<>();
        Question firstQuestion = getQuestion(0);
        questionList.add(firstQuestion);
        questionList.add(getQuestion(1));
        Form form = new Form(questionList);

        form.answer(firstQuestion, "answered");

        boolean isEmptyField = form.hasEmptyField();

        assertThat(isEmptyField).isTrue();
    }

    @NonNull
    private Question getQuestion(int id) {
        return new Question("", id, "");
    }

    @Test
    public void hasEmptyField_listContainsTwoAnsweredQuestions_returnsFalse() throws Exception {
        List<Question> questionList = new ArrayList<>();
        Question firstQuestion = getQuestion(0);
        questionList.add(firstQuestion);
        Question secondQuestion = getQuestion(1);
        questionList.add(secondQuestion);
        Form form = new Form(questionList);

        form.answer(firstQuestion, "answered");
        form.answer(secondQuestion, "answered");
        boolean isEmptyField = form.hasEmptyField();

        assertThat(isEmptyField).isFalse();
    }
}