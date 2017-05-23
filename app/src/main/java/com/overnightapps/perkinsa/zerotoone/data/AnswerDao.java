package com.overnightapps.perkinsa.zerotoone.data;

import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Insert;

@Dao
public interface AnswerDao {
    @Insert
    long insertAnswer(Answer answer);
}
