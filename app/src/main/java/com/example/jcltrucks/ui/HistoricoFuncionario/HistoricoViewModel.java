package com.example.jcltrucks.ui.HistoricoFuncionario;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class HistoricoViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public HistoricoViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is home fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}