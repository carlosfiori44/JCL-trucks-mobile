package com.example.jcltrucks.ui.PerfilFuncionario;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class PerfilFuncionarioViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public PerfilFuncionarioViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is notifications fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}