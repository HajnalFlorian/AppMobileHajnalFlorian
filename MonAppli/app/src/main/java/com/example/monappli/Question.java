package com.example.monappli;

import java.util.List;

public class Question {
    private String mQuestion;
    private List<String> mChoiceList;
    private int mAnswerIndex;

    public String getmQuestion() {
        return mQuestion;
    }

    public void setmQuestion(String mQuestion) {
        this.mQuestion = mQuestion;
    }

    public List<String> getmChoiceList() {
        return mChoiceList;
    }

    public void setmChoiceList(List<String> mChoiceList) {
        this.mChoiceList = mChoiceList;
    }

    public int getmAnswerIndex() {
        return mAnswerIndex;
    }

    public void setmAnswerIndex(int mAnswerIndex) {
        this.mAnswerIndex = mAnswerIndex;gti
    }
}
