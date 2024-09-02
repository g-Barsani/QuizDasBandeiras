package com.example.quizdasbandeiras;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

public class Exercicio5 extends AppCompatActivity {

    private Button btnResponder;
    private RadioButton radioButtonAnswer;
    private RadioGroup radioGroup;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_exercicio5);

        // Initialize the RadioGroup and RadioButton
        radioGroup = findViewById(R.id.radioGroup);
        radioButtonAnswer = findViewById(R.id.radioButtonAnswer);

        btnResponder = findViewById(R.id.btnResponder); // Update button ID if needed
        btnResponder.setOnClickListener(this::responder);
    }

    private void responder(View v) {
        // Get the ID of the checked RadioButton
        int selectedId = radioGroup.getCheckedRadioButtonId();

        // Check if any RadioButton is checked
        if (selectedId != -1) {
            // A RadioButton is checked
            if (radioButtonAnswer.isChecked()) {
                ScoreManager.getInstance().addPoints(1);
            }

            // Move to the next activity
            Intent it = new Intent(getApplicationContext(), Exercicio6.class);
            startActivity(it);

        } else {
            // No RadioButton is checked
            Toast.makeText(this, "Selecione uma resposta", Toast.LENGTH_SHORT).show();
        }
    }
}
