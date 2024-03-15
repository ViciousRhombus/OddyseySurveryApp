package com.example.mc_assignment1;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.mc_assignment1.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
    ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        binding.button.setOnClickListener(view -> nextPage());
        binding.editTextTextPersonName1.addTextChangedListener(loginTextWatcher);
        binding.editTextTextPersonName2.addTextChangedListener(loginTextWatcher);

    }


    @Override
    protected void onPause() {
        super.onPause();
        Log.i("State", "Paused Activity 1");
        Toast.makeText(MainActivity.this, "Paused Activity 1", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.i("State","Restart Activity 1");
        Toast.makeText(MainActivity.this, "Restart Activity 1", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i("State","Destroy Activity 1");
        Toast.makeText(MainActivity.this, "Destroy Activity 1", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i("State","Start Activity 1");
        Toast.makeText(MainActivity.this, "Start Activity 1", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i("State","Stopped Activity 1");
        Toast.makeText(MainActivity.this, "Stopped Activity 1", Toast.LENGTH_SHORT).show();
    }


    private TextWatcher loginTextWatcher = new TextWatcher() {
        @Override
        public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

        }

        @Override
        public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
            String Name = binding.editTextTextPersonName1.getText().toString().trim();
            String Role = binding.editTextTextPersonName2.getText().toString().trim();
            if(Name.isEmpty() && Role.isEmpty()){

            }
            binding.button.setEnabled(!Name.isEmpty() && !Role.isEmpty());
        }

        @Override
        public void afterTextChanged(Editable editable) {

        }
    };
    public void nextPage(){
        if(!binding.button.isEnabled()){
            Toast.makeText(MainActivity.this,"Fields are empty",Toast.LENGTH_SHORT).show();
        }
        Intent intent = new Intent(this, MainActivity2.class);
        startActivity(intent);

    }
}