package com.example.magictriangle;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.view.View;
import android.widget.Toast;

public class WelcomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);
    }

    public void play(View v) {
        Intent a = new Intent(WelcomeActivity.this, MainActivity.class);
        startActivity(a);
    }

    public void parameters(View v){
        Intent b = new Intent(WelcomeActivity.this, ParametersActivity.class);
        startActivity(b);
    }

    public void about(View v){
        Context context = getApplicationContext();
        CharSequence text = "The application was created in 2021 by Kinga Kalisz";
        int duration = Toast.LENGTH_LONG;
        Toast toast = Toast.makeText(context, text, duration);
        toast.show();
    }

    public void quit(View v){
        this.finish();
    }
}