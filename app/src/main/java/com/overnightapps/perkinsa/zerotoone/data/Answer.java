package com.overnightapps.perkinsa.zerotoone.data;

import android.arch.persistence.room.Entity;
import android.arch.persistence.room.ForeignKey;
import android.arch.persistence.room.Index;
import android.arch.persistence.room.PrimaryKey;

@Entity(indices = @Index("formId"),
        foreignKeys = @ForeignKey(entity = Form.class,
        parentColumns = "name",
        childColumns = "formId",
        onDelete = ForeignKey.CASCADE))
public class Answer {

    @PrimaryKey
    private int questionId;

    private int formId;

    private String text;

    public int getQuestionId() {
        return questionId;
    }

    public void setQuestionId(int questionId) {
        this.questionId = questionId;
    }

    public int getFormId() {
        return formId;
    }

    public void setFormId(int formId) {
        this.formId = formId;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
