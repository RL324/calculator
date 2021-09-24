package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;
import android.widget.TextView;
import android.os.Bundle;
import android.content.Intent;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        TextView textView2;
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        textView2=(TextView) findViewById(R.id.textView2);
        Intent intent=getIntent();
        String str=intent.getStringExtra("message");
        textView2.setText(str);
    }
}