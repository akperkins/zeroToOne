package com.overnightapps.perkinsa.zerotoone.data;

import android.arch.persistence.room.Database;
import android.arch.persistence.room.RoomDatabase;

@Database(entities = {Answer.class, Form.class}, version = 1)
public abstract class FormDatabase extends RoomDatabase {
    public abstract FormDao formDao();
    public abstract AnswerDao answerDao();
}