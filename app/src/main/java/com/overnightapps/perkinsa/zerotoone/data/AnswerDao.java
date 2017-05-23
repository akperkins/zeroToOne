package com.overnightapps.perkinsa.zerotoone.data;

import android.arch.persistence.room.Entity;
import android.arch.persistence.room.Insert;

@Entity
public interface AnswerDao {
    @Insert
    long insertAnswer(Answer answer);
}
