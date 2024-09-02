package com.example.quizdasbandeiras;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;

import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

public class Exercicio1 extends AppCompatActivity {
    private Button btnResponder;
    private RadioButton radioButtonAnswer;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_exercicio1);

        btnResponder = findViewById(R.id.btnResponder);
        radioButtonAnswer = findViewById(R.id.radioButtonAnswer);

        btnResponder.setOnClickListener(this::responder);

        MainActivity mainActivity = new MainActivity();
    }

    private void responder (View v) {
        // Declarando uma variável do tipo intent
//        Intent it = new Intent(getApplicationContext(), ScoreScreen.class);
        if (radioButtonAnswer.isChecked()) {
            ScoreManager.getInstance().addPoints(1);
        }


        Intent it = new Intent(getApplicationContext(), Exercicio2.class);
        // Iniciando a tela desejada
        startActivity(it);
    }
}

