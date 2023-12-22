package com.example.simplecalac2;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
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
        Log.e(TAG, "MainActivity::OnCreate");
    }

    @SuppressLint("SetTextI18n")
    public void onBtnClicked(View view) {
        // Get view handle using the view id
        EditText et1 = findViewById(R.id.Num1);
         // Get the view’s text
        String et1Text = et1.getText().toString();
         // Cast the String into Integer
        Integer num1 = Integer.valueOf(et1Text);

        // Get view handle using the view id
        EditText et2 = findViewById(R.id.Num2);
        // Get the view’s text
        String et2Text = et2.getText().toString();
        // Cast the String into Integer
        Integer num2 = Integer.valueOf(et2Text);


        Integer result = null;

        if (!et1Text.equals("") && !et2Text.equals("")) {
            Log.e(TAG, "two of the numbers are not empty");
            // Cast the String into Integer

            if (view.getId() == R.id.btnPlus) {
                Log.e(TAG, "it plus");
                result = num1 + num2;
            }
            if (view.getId() == R.id.btnMinus)
                Log.e(TAG, "it minus");
                result = num1 - num2;
            if (view.getId() == R.id.btnMult)
                Log.e(TAG, "it mult");
                result = num1 * num2;
            if (view.getId() == R.id.btnDiv) {
                Log.e(TAG, "it div");
                if (num2 == 0) {
                    Toast.makeText(this, "Cant divide by 0", Toast.LENGTH_LONG).show();
                } else {
                    result = num1 / num2;
                }
            }
        } else {
            Toast.makeText(this, "One of the integers is empty", Toast.LENGTH_LONG).show();

        }
        TextView tvRes = findViewById(R.id.tvResult);
        if (result != null) {
            Log.e(TAG, "result are not null");
            tvRes.setText(result.toString());
        } else {
            tvRes.setText("");
        }

    }
}
