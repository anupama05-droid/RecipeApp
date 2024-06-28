package com.anupama.recipeapp;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    AppCompatButton bn1,bn2,bn3;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        bn1=(AppCompatButton) findViewById(R.id.addbtn);
        bn2=(AppCompatButton) findViewById(R.id.searchbtn);
        bn3=(AppCompatButton) findViewById(R.id.dltbtn);

        bn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in3=new Intent(getApplicationContext(), DeleteRecipe.class);
                startActivity(in3);
            }
        });
        bn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in2=new Intent(getApplicationContext(), SearchRecipe.class);
                startActivity(in2);
            }
        });
        bn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in1=new Intent(getApplicationContext(), AddRecipe.class);
                startActivity(in1);
            }
        });
    }
}