package com.example.jcltrucks.ui.Gerente;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

import com.example.jcltrucks.R;
import com.ogaclejapan.smarttablayout.SmartTabLayout;
import com.ogaclejapan.smarttablayout.utils.v4.FragmentPagerItemAdapter;
import com.ogaclejapan.smarttablayout.utils.v4.FragmentPagerItems;

public class Gerente extends AppCompatActivity {
    private SmartTabLayout smartTabLayout;
    private ViewPager viewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gerente);
        //REFERENCIAS
         smartTabLayout = findViewById(R.id.viewpagertab);
         viewPager = findViewById(R.id.viewpager);

        FragmentPagerItemAdapter adapter = new FragmentPagerItemAdapter(
                getSupportFragmentManager(), FragmentPagerItems.with(this)
                .add("Funcionários", Funcionarios.class)
                .add("Informações", Informacoes.class)
                .add("Perfil Gerente", PerfilGerente.class)
                .create());


        viewPager.setAdapter(adapter);

        smartTabLayout.setViewPager(viewPager);
    }
}