package com.overnightapps.perkinsa.zerotoone.data;

import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;

@Entity
public class Form {
    @PrimaryKey
    private String name;

    private String description;
}
