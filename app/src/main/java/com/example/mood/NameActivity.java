package com.example.mood;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.res.ResourcesCompat;

import android.graphics.Typeface;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.FrameLayout;
import android.widget.TextView;

public class NameActivity extends AppCompatActivity {
private TextView tv;
private FrameLayout fl;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_name);
        String sentText = getIntent().getStringExtra("NAME");

        tv= findViewById(R.id.tv_name);
        tv.setText(sentText);

        fl = findViewById(R.id.container);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu , menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {

        int id = item.getItemId();

        switch(id){

            case  R.id.item_android :
                setScreenType(R.color.android , R.font.android ,R.drawable.android);
                return true;
            case  R.id.item_egypt :
                setScreenType(R.color.egypt , R.font.egypt ,R.drawable.egypt);
                return true;
            case  R.id.item_fire :
                setScreenType(R.color.fire , R.font.fire ,R.drawable.fire);
                return true;

        }
        return super.onOptionsItemSelected(item);
    }

    private void setScreenType(int color , int fontype , int background){
        fl.setBackgroundResource(background);
        tv.setTextColor(getResources().getColor(color));
        Typeface type3 = ResourcesCompat.getFont(this , fontype);
        tv.setTypeface(type3);
    }
}