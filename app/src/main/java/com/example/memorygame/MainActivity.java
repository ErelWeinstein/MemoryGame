package com.example.memorygame;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void knock(View view) {

        ImageView eggImageView = findViewById(R.id.imageView);
        eggImageView.setImageResource(R.drawable.surprise_egg);
    }
}