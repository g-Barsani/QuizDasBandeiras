package com.example.quizdasbandeiras;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class ScoreScreen extends AppCompatActivity {

    private String receivedUsername;
    private TextView textViewScore;
    private TextView textViewUsername;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_score_screen);

        textViewUsername = findViewById(R.id.textViewUsername);
        textViewScore = findViewById(R.id.textViewScore);

        String score = String.valueOf(ScoreManager.getInstance().getScore());
        String username = UserManager.getInstance().getUserName();

        textViewUsername.setText(username);
        textViewScore.setText(score);

    }
}