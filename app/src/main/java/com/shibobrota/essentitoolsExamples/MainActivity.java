package com.shibobrota.essentitoolsExamples;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.shibobrota.essentitools.Log;
import com.shibobrota.essentitools.Tools;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("UNIQUE_TAG", "A Long, Very Long message.");
        try {
            android.util.Log.d("PACKAGE NAME", "onCreate: " + Tools.getPackageName(getApplicationContext()));
        } catch (Exception e) {
            android.util.Log.e("PACKAGE_NAME_EXCEPTION", "onCreate: " + e.getMessage());
        }
    }
}
