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

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_score_screen);

//        Button btnResponder = findViewById(R.id.btnResponder);




        // Retrieve the username from the Intent
//        Intent intent = getIntent();
//        receivedUsername = intent.getStringExtra("text_key");
//
//        TextView textViewUsername = findViewById(R.id.textViewUsername);
//        textViewUsername.setText(receivedUsername);




    }
}