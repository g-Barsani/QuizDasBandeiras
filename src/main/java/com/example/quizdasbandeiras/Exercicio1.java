package com.example.quizdasbandeiras;

import android.annotation.SuppressLint;
import android.os.Bundle;

import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class Exercicio1 extends AppCompatActivity {

//    private TextView tv;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_exercicio1);

//        tv = findViewById(R.id.tv);


        MainActivity mainActivity = new MainActivity();
//        tv.setText(mainActivity.getName());



    }


}

