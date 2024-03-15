package com.example.mc_assignment1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

import com.example.mc_assignment1.databinding.ActivityMain3Binding;

public class MainActivity3 extends AppCompatActivity {
    ActivityMain3Binding binding3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding3 = ActivityMain3Binding.inflate(getLayoutInflater());
        setContentView(binding3.getRoot());
        Intent intent = getIntent();
        binding3.checkBox6.setChecked(intent.getBooleanExtra("musicCheckbox",true));
        binding3.checkBox7.setChecked(intent.getBooleanExtra("DanceCheckbox",true));
        binding3.checkBox8.setChecked(intent.getBooleanExtra("PlayCheckbox",true));
        binding3.checkBox9.setChecked(intent.getBooleanExtra("FashionCheckbox",true));
        binding3.checkBox10.setChecked(intent.getBooleanExtra("FoodCheckbox",true));

        binding3.ratingBar6.setRating(intent.getFloatExtra("musicRatingBar",0F ));
        binding3.ratingBar7.setRating(intent.getFloatExtra("DanceRatingBar",0F ));
        binding3.ratingBar8.setRating(intent.getFloatExtra("PlayRatingBar",0F ));
        binding3.ratingBar9.setRating(intent.getFloatExtra("FashionRatingBar",0F ));
        binding3.ratingBar10.setRating(intent.getFloatExtra("FoodRatingBar",0F ));

        binding3.checkBox6.setEnabled(false);
        binding3.checkBox7.setEnabled(false);
        binding3.checkBox8.setEnabled(false);
        binding3.checkBox9.setEnabled(false);
        binding3.checkBox10.setEnabled(false);

        binding3.ratingBar6.setIsIndicator(true);
        binding3.ratingBar7.setIsIndicator(true);
        binding3.ratingBar8.setIsIndicator(true);
        binding3.ratingBar9.setIsIndicator(true);
        binding3.ratingBar10.setIsIndicator(true);

    }
    @Override
    protected void onPause() {
        super.onPause();
        Log.i("State", "Paused Activity 3");
        Toast.makeText(MainActivity3.this, "Paused Activity 3",Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.i("State","Restart Activity 3");
        Toast.makeText(MainActivity3.this, "Restart Activity 3", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i("State","Destroy Activity 3");
        Toast.makeText(MainActivity3.this, "Destroy Activity 3", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i("State","Start Activity 3");
        Toast.makeText(MainActivity3.this, "Start Activity 3", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i("State","Stopped Activity 3");
        Toast.makeText(MainActivity3.this, "Stopped Activity 3", Toast.LENGTH_SHORT).show();
    }
}