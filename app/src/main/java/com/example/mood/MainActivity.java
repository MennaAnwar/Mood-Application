package com.example.mood;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.google.android.material.textfield.TextInputEditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void openActivity(View view) {
        TextInputEditText editText= findViewById(R.id.vt_name);
        String writtentext = editText.getText().toString();
        Intent i = new Intent(MainActivity.this , NameActivity.class);

        i.putExtra("NAME" , writtentext);
        
        startActivity(i);
    }
}