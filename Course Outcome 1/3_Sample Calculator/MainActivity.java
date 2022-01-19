package com.example.samplecalculator;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText num1,num2;
    TextView result;
    int n1,n2;
    String s1,s2,s3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void getNum()
    {
        num1 = (EditText) findViewById(R.id.fn);
        num2 = (EditText) findViewById(R.id.sn);
        result = (TextView) findViewById(R.id.res);
        s1 = num1.getText().toString();
        s2 = num2.getText().toString();
    }
    public void sum(View v)
    {
        getNum();
        n1 = Integer.parseInt(s1);
        n2 = Integer.parseInt(s2);
        s3 = String.valueOf(n1+n2);
        result.setText(s3);
    }
    public void sub(View v)
    {
        getNum();
        n1 = Integer.parseInt(s1);
        n2 = Integer.parseInt(s2);
        s3 = String.valueOf(n1-n2);
        result.setText(s3);
    }
    public void mul(View v)
    {
        getNum();
        n1 = Integer.parseInt(s1);
        n2 = Integer.parseInt(s2);
        s3 = String.valueOf(n1*n2);
        result.setText(s3);
    }

    public void div(View v)
    {
        getNum();
        n1 = Integer.parseInt(s1);
        n2 = Integer.parseInt(s2);
        s3 = String.valueOf(n1/n2);
        result.setText(s3);
    }
};