package com.example.quizdasbandeiras;

import android.content.Intent;
import android.os.Bundle;

import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private Button btnIniciarQuiz;
    private Button btnSair;
    private EditText editTextNome;
    private String username;
    private String inputUsername = "";
    private int pontos;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        btnIniciarQuiz = findViewById(R.id.btnIniciarQuiz);
        btnSair = findViewById(R.id.btnResponder);
        editTextNome = findViewById(R.id.editTextNome);

        // Set an OnClickListener on the btnSair button
        btnSair.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish(); // Close the current activity
            }
        });

        btnIniciarQuiz.setOnClickListener(this::iniciar);


        // TextWatcher é uma classe que oferece métodos para quando o texto é modificado em editText
        editTextNome.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int start, int count, int after) {
                // No action needed
            }

            @Override
            public void onTextChanged(CharSequence charSequence, int start, int before, int count) {
                // No action needed
            }

            @Override
            public void afterTextChanged(Editable editable) {
                String input = editable.toString();
                inputUsername = input;
                btnIniciarQuiz.setEnabled(!input.trim().isEmpty());
            }
        });



    }



    private void iniciar(View v) {
        username = editTextNome.toString();


        // Declarando uma variável do tipo intent
        Intent it = new Intent(getApplicationContext(), Exercicio1.class);

        // Put the text as an extra
        it.putExtra("text_key", inputUsername);

        // Iniciando a tela desejada
        startActivity(it);

    }

    public String getName() {
        return username;
    }
}

