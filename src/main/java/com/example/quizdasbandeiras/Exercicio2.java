package com.example.quizdasbandeiras;

import android.annotation.SuppressLint;
import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

public class Exercicio2 extends AppCompatActivity {

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

