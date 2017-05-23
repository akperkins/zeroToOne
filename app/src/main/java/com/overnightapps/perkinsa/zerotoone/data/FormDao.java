package com.overnightapps.perkinsa.zerotoone.data;

import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Insert;

@Dao
public interface FormDao {
    @Insert
    long insertFrom(Form form);
}
