package com.example.quizdasbandeiras;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

public class ScoreScreen extends AppCompatActivity {

    private String receivedUsername;
    private TextView textViewScore;
    private TextView textViewUsername;
    private Button btnHomeScreen;
    private Button btnRedoQuiz;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_score_screen);

        textViewUsername = findViewById(R.id.textViewUsername);
        textViewScore = findViewById(R.id.textViewScore);
        btnRedoQuiz = findViewById(R.id.btnRedoQuiz);
        btnHomeScreen = findViewById(R.id.btnHomeScreen);



        String score = String.valueOf(ScoreManager.getInstance().getScore());
        String username = UserManager.getInstance().getUserName();

        textViewUsername.setText(username);
        textViewScore.setText(score);

        btnRedoQuiz.setOnClickListener(this::redoQuiz);
        btnHomeScreen.setOnClickListener(this::returnHome);
    }

    private void redoQuiz (View view) {
        ScoreManager.getInstance().resetScore();

        // Declarando uma variável do tipo intent
        Intent it = new Intent(getApplicationContext(), Exercicio1.class);

        // Iniciando a tela desejada
        startActivity(it);
    }

    private void returnHome (View view) {
        ScoreManager.getInstance().resetScore();

        // Declarando uma variável do tipo intent
        Intent it = new Intent(getApplicationContext(), MainActivity.class);

        // Iniciando a tela desejada
        startActivity(it);
    }
}