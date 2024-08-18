package com.example.jcltrucks;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import com.example.jcltrucks.ui.Funcionario.Funcionario;
import com.example.jcltrucks.ui.Gerente.Gerente;

public class MainActivity extends AppCompatActivity {
    private EditText email, senha;
    private Spinner spinner;
    private Button bt_acessar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //Referências
        email = findViewById(R.id.email_usuario);
        senha = findViewById(R.id.senha_usuario);
        spinner = findViewById(R.id.spinner);
        bt_acessar = findViewById(R.id.bt_acessar);

        bt_acessar.setOnClickListener( new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                if (spinner.getSelectedItem().toString().equals("Gerente")){
                    Intent intent = new Intent(getApplicationContext(), Gerente.class);
                    startActivityForResult(intent,1);
                }
                if (spinner.getSelectedItem().toString().equals("Funcionário")){

                    Intent intent = new Intent(getApplicationContext(), Funcionario.class);
                    startActivityForResult(intent,1);
                }else{
                    Toast.makeText(MainActivity.this, "Erro ao acessar!", Toast.LENGTH_LONG).show();
                }
            }

        });
    }



}