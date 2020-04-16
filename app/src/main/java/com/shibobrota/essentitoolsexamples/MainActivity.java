package com.shibobrota.essentitoolsexamples;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.shibobrota.essentitools.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("UNIQUE_TAG", "A Long, Very Long message.");
    }
}
