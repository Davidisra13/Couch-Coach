package com.example.myapplication.ui.Questions;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class QuestionsViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public QuestionsViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("Please Answer For Personalized Recommendations");
    }

    public LiveData<String> getText() {
        return mText;
    }
}