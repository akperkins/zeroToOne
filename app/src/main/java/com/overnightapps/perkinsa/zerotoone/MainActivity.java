package com.overnightapps.perkinsa.zerotoone;

import android.arch.lifecycle.LifecycleActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.Button;
import android.widget.Toast;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.io.IOException;
import java.lang.reflect.Type;
import java.util.List;

public class MainActivity extends LifecycleActivity {

    private static final String QUESTIONS_FILE_NAME = "questions.json";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        RecyclerView recycler =  (RecyclerView) findViewById(R.id.listOfQuestions);
        recycler.setLayoutManager(new LinearLayoutManager(this));
        try {
            String questionsJson = AndroidUtil.loadStringFromFile(this, QUESTIONS_FILE_NAME);
            Type collectionType = new TypeToken<List<Question>>(){}.getType();
            List<Question> questionList = new Gson().fromJson(questionsJson, collectionType);
            Form form = new Form(questionList);
            ListOfQuestionsAdapter adapter = new ListOfQuestionsAdapter(questionList);
            recycler.setAdapter(adapter);
            Button export = (Button) findViewById(R.id.export);
            export.setOnClickListener(v -> {
                //export form
                if(form.hasEmptyField()){

                }
            });
        } catch (IOException e) {
            displayMessage("Unable to load questions");
        }
    }

    private void displayMessage(String text) {
        Toast.makeText(this, text, Toast.LENGTH_LONG).show();
    }
}