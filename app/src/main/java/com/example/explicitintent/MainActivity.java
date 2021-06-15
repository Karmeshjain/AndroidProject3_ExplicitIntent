package com.example.explicitintent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void callSecondActivity(View view){
        Intent i = new Intent(getApplicationContext(), SecondactivityKarmesh.class);
        i.putExtra("Value1", "Karmesh(500075888)");
        i.putExtra("Value2", "R142219014");
        // Set the request code to any code you like, you can identify the
        // callback via this code
        startActivity(i);
    }
}