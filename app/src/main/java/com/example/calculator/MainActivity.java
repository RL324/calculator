package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;
import android.content.Intent;
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void clickFunction1(View view){
        EditText myTextField=(EditText) findViewById(R.id.editTextTextPersonName);
        //Toast.makeText(MainActivity.this,myTextField.getText().toString(),Toast.LENGTH_LONG).show();
        String value1=myTextField.getText().toString();
        int finalValue1=Integer.parseInt(value1);
        EditText myTextField1=(EditText) findViewById(R.id.editTextTextPersonName2);
        //Toast.makeText(MainActivity.this,myTextField1.getText().toString(),Toast.LENGTH_LONG).show();
        String value2=myTextField1.getText().toString();
        int finalValue2=Integer.parseInt(value2);
        int int3=finalValue1+finalValue2;
        String str=String.valueOf(int3);
        goToActivity2(str);
    }
    public void clickFunction2(View view){
        EditText myTextField=(EditText) findViewById(R.id.editTextTextPersonName);
        //Toast.makeText(MainActivity.this,myTextField.getText().toString(),Toast.LENGTH_LONG).show();
        String value1=myTextField.getText().toString();
        int finalValue1=Integer.parseInt(value1);
        EditText myTextField1=(EditText) findViewById(R.id.editTextTextPersonName2);
        //Toast.makeText(MainActivity.this,myTextField1.getText().toString(),Toast.LENGTH_LONG).show();
        String value2=myTextField1.getText().toString();
        int finalValue2=Integer.parseInt(value2);
        int int3=finalValue1-finalValue2;
        String str=String.valueOf(int3);
        goToActivity2(str);
    }
    public void clickFunction3(View view){
        EditText myTextField=(EditText) findViewById(R.id.editTextTextPersonName);
        //Toast.makeText(MainActivity.this,myTextField.getText().toString(),Toast.LENGTH_LONG).show();
        String value1=myTextField.getText().toString();
        int finalValue1=Integer.parseInt(value1);
        EditText myTextField1=(EditText) findViewById(R.id.editTextTextPersonName2);
        //Toast.makeText(MainActivity.this,myTextField1.getText().toString(),Toast.LENGTH_LONG).show();
        String value2=myTextField1.getText().toString();
        int finalValue2=Integer.parseInt(value2);
        int int3=finalValue1*finalValue2;
        String str=String.valueOf(int3);
        goToActivity2(str);
    }
    public void clickFunction4(View view){
        EditText myTextField=(EditText) findViewById(R.id.editTextTextPersonName);
        //Toast.makeText(MainActivity.this,myTextField.getText().toString(),Toast.LENGTH_LONG).show();
        String value1=myTextField.getText().toString();
        int finalValue1=Integer.parseInt(value1);
        EditText myTextField1=(EditText) findViewById(R.id.editTextTextPersonName2);
        //Toast.makeText(MainActivity.this,myTextField1.getText().toString(),Toast.LENGTH_LONG).show();
        String value2=myTextField1.getText().toString();
        int finalValue2=Integer.parseInt(value2);
        int int3=finalValue1/finalValue2;
        String str=String.valueOf(int3);
        goToActivity2(str);
    }
    public void goToActivity2(String str){
        Intent intent=new Intent(this,MainActivity2.class);
        intent.putExtra("message",str);
        startActivity(intent);
    }
}