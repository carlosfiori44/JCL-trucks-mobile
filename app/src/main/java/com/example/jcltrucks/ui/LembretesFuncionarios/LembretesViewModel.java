package com.example.jcltrucks.ui.LembretesFuncionarios;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class LembretesViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public LembretesViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is dashboard fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}