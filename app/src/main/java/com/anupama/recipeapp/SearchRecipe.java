package com.anupama.recipeapp;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class SearchRecipe extends AppCompatActivity {

    EditText e1;
    AppCompatButton b1,b2;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_search_recipe);

        e1=(EditText) findViewById(R.id.recipebtn);
        b1=(AppCompatButton) findViewById(R.id.searchbn);
        b2=(AppCompatButton) findViewById(R.id.backtologinbtn);

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(getApplicationContext(), MainActivity.class);
                startActivity(i);
            }
        });
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String getRecipe=e1.getText().toString();
                
                Toast.makeText(getApplicationContext(),"Recipe Found",Toast.LENGTH_LONG).show();

            }
        });
    }
}