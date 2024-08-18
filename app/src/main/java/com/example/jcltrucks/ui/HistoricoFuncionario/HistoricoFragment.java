package com.example.jcltrucks.ui.HistoricoFuncionario;

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

public class HistoricoFragment extends Fragment {

    private HistoricoViewModel historicoViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        historicoViewModel =
                new ViewModelProvider(this).get(HistoricoViewModel.class);
        View root = inflater.inflate(R.layout.fragment_historicofuncionario, container, false);
        final TextView textView = root.findViewById(R.id.text_home);
        historicoViewModel.getText().observe(getViewLifecycleOwner(), new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
                textView.setText(s);
            }
        });
        return root;
    }
}