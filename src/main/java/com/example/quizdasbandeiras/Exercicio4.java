package com.example.quizdasbandeiras;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

public class Exercicio4 extends AppCompatActivity {

    private Button btnResponder;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_exercicio1);

        btnResponder = findViewById(R.id.btnResponder);
        btnResponder.setOnClickListener(this::responder);
    }

    private void responder (View v) {
        // Declarando uma variável do tipo intent
        Intent it = new Intent(getApplicationContext(), Exercicio5.class);
        // Iniciando a tela desejada
        startActivity(it);
    }



}

