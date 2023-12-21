package com.example.simplecalac2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.e(TAG,  "MainActivity::OnCreate");
    }

    public void onBtnClicked(View view) {
        // Get view handle using the view id
        EditText et1 = findViewById(R.id.Num1);
        EditText et2 = findViewById(R.id.Num2);
    }
}