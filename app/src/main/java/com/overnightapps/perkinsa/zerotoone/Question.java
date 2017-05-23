package com.overnightapps.perkinsa.zerotoone;

public class Question {
    final private String text;
    final private int id;
    final private String name;

    Question(String text, int id, String name) {
        this.text = text;
        this.id = id;
        this.name = name;
    }

    String getText() {
        return text;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}
