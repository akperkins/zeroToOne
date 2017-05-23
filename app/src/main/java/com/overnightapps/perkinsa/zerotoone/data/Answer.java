package com.overnightapps.perkinsa.zerotoone.data;

import android.arch.persistence.room.Entity;
import android.arch.persistence.room.ForeignKey;
import android.arch.persistence.room.PrimaryKey;

@Entity(foreignKeys = @ForeignKey(entity = Form.class,
        parentColumns = "name",
        childColumns = "formId",
        onDelete = ForeignKey.CASCADE))
public class Answer {

    @PrimaryKey
    private int questionId;

    private int formId;

    private String text;
}
