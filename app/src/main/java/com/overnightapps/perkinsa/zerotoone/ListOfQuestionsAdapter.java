package com.overnightapps.perkinsa.zerotoone;

import android.support.design.widget.TextInputLayout;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;

import java.util.List;

class ListOfQuestionsAdapter extends RecyclerView.Adapter<ListOfQuestionsAdapter.QuestionHolder> {
    private final List<Question> questionList;

    ListOfQuestionsAdapter(List<Question> questionList) {
        this.questionList = questionList;
    }

    @Override
    public QuestionHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        View v = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.question_layout, viewGroup, false);
        return new QuestionHolder(v);
    }

    @Override
    public void onBindViewHolder(QuestionHolder viewHolder, int i) {
        viewHolder.update();
    }

    @Override
    public int getItemCount() {
        return questionList.size();
    }

    class QuestionHolder extends RecyclerView.ViewHolder {

        QuestionHolder(View itemView) {
            super(itemView);
        }

        void update() {
            Question question = questionList.get(getLayoutPosition());
            TextInputLayout inputLayout = (TextInputLayout) itemView.findViewById(R.id.input_layout_question);
            EditText et = (EditText) itemView.findViewById(R.id.answer);
            inputLayout.setHint(question.getText());
        }
    }
}
