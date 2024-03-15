package com.example.mc_assignment1;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.CheckBox;
import android.widget.RatingBar;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.mc_assignment1.databinding.ActivityMain2Binding;

public class MainActivity2 extends AppCompatActivity {
    ActivityMain2Binding binding2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding2 = ActivityMain2Binding.inflate(getLayoutInflater());
        setContentView(binding2.getRoot());
        binding2.ratingBar1.setEnabled(false);
        binding2.ratingBar2.setEnabled(false);
        binding2.ratingBar3.setEnabled(false);
        binding2.ratingBar4.setEnabled(false);
        binding2.ratingBar5.setEnabled(false);

        // NEXT PAGE
        binding2.button1.setOnClickListener(view -> nextPage());

        // CLEAR DATA
        binding2.button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                binding2.checkBox1.setChecked(false);
                binding2.checkBox2.setChecked(false);
                binding2.checkBox3.setChecked(false);
                binding2.checkBox4.setChecked(false);
                binding2.checkBox5.setChecked(false);

                binding2.ratingBar1.setRating(0F);
                binding2.ratingBar2.setRating(0F);
                binding2.ratingBar3.setRating(0F);
                binding2.ratingBar4.setRating(0F);
                binding2.ratingBar5.setRating(0F);

                binding2.ratingBar1.setEnabled(false);
                binding2.ratingBar2.setEnabled(false);
                binding2.ratingBar3.setEnabled(false);
                binding2.ratingBar4.setEnabled(false);
                binding2.ratingBar5.setEnabled(false);

            }
        });




        // ENABLE/DISABLE RATING BAR
        binding2.checkBox1.setOnClickListener(view -> CLICK(binding2.ratingBar1,binding2.checkBox1));
        binding2.checkBox2.setOnClickListener(view -> CLICK(binding2.ratingBar2,binding2.checkBox2));
        binding2.checkBox3.setOnClickListener(view -> CLICK(binding2.ratingBar3,binding2.checkBox3));
        binding2.checkBox4.setOnClickListener(view -> CLICK(binding2.ratingBar4,binding2.checkBox4));
        binding2.checkBox5.setOnClickListener(view -> CLICK(binding2.ratingBar5,binding2.checkBox5));



        // SEND DATA TO ACTIVITY 3
        binding2.button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity2.this, MainActivity3.class);
                intent.putExtra("musicCheckbox"    ,binding2.checkBox1.isChecked());
                intent.putExtra("DanceCheckbox"    ,binding2.checkBox2.isChecked());
                intent.putExtra("PlayCheckbox"     ,binding2.checkBox3.isChecked());
                intent.putExtra("FashionCheckbox"  ,binding2.checkBox4.isChecked());
                intent.putExtra("FoodCheckbox"     ,binding2.checkBox5.isChecked());

                intent.putExtra("musicRatingBar"   ,binding2.ratingBar1.getRating());
                intent.putExtra("DanceRatingBar"   ,binding2.ratingBar2.getRating());
                intent.putExtra("PlayRatingBar"    ,binding2.ratingBar3.getRating());
                intent.putExtra("FashionRatingBar" ,binding2.ratingBar4.getRating());
                intent.putExtra("FoodRatingBar"    ,binding2.ratingBar5.getRating());

                Toast.makeText(MainActivity2.this,"Form submitted",Toast.LENGTH_SHORT).show();

                startActivity(intent);
            }
        });
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i("State", "Paused Activity 1");
        Toast.makeText(MainActivity2.this, "Paused Activity 1", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.i("State","Restart Activity 2");
        Toast.makeText(MainActivity2.this, "Restart Activity 2", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i("State","Destroy Activity 2");
        Toast.makeText(MainActivity2.this, "Destroy Activity 2", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i("State","Start Activity 2");
        Toast.makeText(MainActivity2.this, "Start Activity 2", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i("State","Stopped Activity 2");
        Toast.makeText(MainActivity2.this, "Stopped Activity 2", Toast.LENGTH_SHORT).show();
    }

    // FUNCTION FOR NEXT ACTIVITY
    public void nextPage(){
        Intent intent = new Intent(this, MainActivity3.class);
        startActivity(intent);
    }

    //FUNCTION FOR ENABLE/DISABLE RATING BAR USING CHECKBOX
    public void CLICK(RatingBar ratingBar, CheckBox checkBox){
        if(checkBox.isChecked()){
            ratingBar.setEnabled(true);

        }
        else{
            ratingBar.setRating(0F);
            ratingBar.setEnabled(false);

        }
    }
}