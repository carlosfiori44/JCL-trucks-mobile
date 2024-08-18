package com.example.jcltrucks.ui.LembretesFuncionarios;

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

public class LembretesFragment extends Fragment {

    private LembretesViewModel lembretesViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        lembretesViewModel =
                new ViewModelProvider(this).get(LembretesViewModel.class);
        View root = inflater.inflate(R.layout.fragment_lembretesfuncionario, container, false);
        final TextView textView = root.findViewById(R.id.text_dashboard);
        lembretesViewModel.getText().observe(getViewLifecycleOwner(), new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
                textView.setText(s);
            }
        });
        return root;
    }
}