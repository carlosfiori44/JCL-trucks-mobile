package com.example.jcltrucks.ui.PerfilFuncionario;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;

import com.example.jcltrucks.R;

public class PerfilFuncionarioFragment extends Fragment {

    private PerfilFuncionarioViewModel perfilFuncionarioViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        perfilFuncionarioViewModel =
                new ViewModelProvider(this).get(PerfilFuncionarioViewModel.class);
        View root = inflater.inflate(R.layout.fragment_perfilfuncionario, container, false);
        final TextView textView = root.findViewById(R.id.text_notifications);
        perfilFuncionarioViewModel.getText().observe(getViewLifecycleOwner(), new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
                textView.setText(s);
            }
        });
        return root;
    }
}