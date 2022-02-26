package com.example.samplecalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    float mValueOne, mValueTwo;
    boolean cAddition, mSubtract, cMultiplication, cDivision,cperc;
    TextView op;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        op = findViewById(R.id.opp);
    }
    public void zero(View view){
        op.setText(op.getText() + "0");
    }

    public void one(View view){
        op.setText(op.getText() + "1");
    }
    public void two(View view){
        op.setText(op.getText() + "2");
    }
    public void three(View view){
        op.setText(op.getText() + "3");
    }
    public void four(View view){
        op.setText(op.getText() + "4");
    }
    public void five(View view){
        op.setText(op.getText() + "5");
    }
    public void six(View view){
        op.setText(op.getText() + "6");
    }
    public void seven(View view){
        op.setText(op.getText() + "7");
    }
    public void eight(View view){
        op.setText(op.getText() + "8");
    }
    public void nine(View view){
        op.setText(op.getText() + "9");
    }
    public void add(View view){
        if (op == null) {
            op.setText("");
        } else {
            mValueOne = Float.parseFloat(op.getText() + "");
            cAddition = true;
            op.setText(null);
        }
    }
    public void sub(View view){
        if (op == null) {
            op.setText("");
        } else {
            mValueOne = Float.parseFloat(op.getText() + "");
            mSubtract = true;
            op.setText(null);
        }

    }
    public void mul(View view){
        if (op == null) {
            op.setText("");
        } else {
            mValueOne = Float.parseFloat(op.getText() + "");
            cMultiplication = true;
            op.setText(null);
        }

    }
    public void div(View view){
        if (op == null) {
            op.setText("");
        } else {
            mValueOne = Float.parseFloat(op.getText() + "");
            cDivision = true;
            op.setText(null);
        }
    }

    public void per(View view){
        if (op == null) {
            op.setText("");
        } else {
            mValueOne = Float.parseFloat(op.getText() + "");
            cperc = true;
            op.setText(null);
        }

    }
    public void equal(View view){
        if (op == null) {
            op.setText("");
        } else {
            mValueTwo = Float.parseFloat(op.getText() + "");

            if (cAddition == true) {
                op.setText(Float.toString(mValueOne)+" + "+Float.toString(mValueTwo)+" = "+Float.toString(mValueOne + mValueTwo) + "");
            }

            else if (mSubtract == true) {
                op.setText(Float.toString(mValueOne)+" - "+Float.toString(mValueTwo)+" = "+Float.toString(mValueOne - mValueTwo) + "");
            }

            else if (cMultiplication == true) {
                op.setText(Float.toString(mValueOne)+" × "+Float.toString(mValueTwo)+" = "+Float.toString(mValueOne * mValueTwo )+ "");
            }

            else if (cDivision == true) {
                op.setText(Float.toString(mValueOne)+" ÷ "+Float.toString(mValueTwo)+" =  "+Float.toString(mValueOne / mValueTwo )+ "");
            }
            else if (cperc == true) {
                op.setText("("+Float.toString(mValueOne)+" / "+Float.toString(mValueTwo)+" ) "+" * 100 "+" = "+Float.toString((mValueOne / mValueTwo)*100)+"%");
            }
            cAddition = false;
            mSubtract = false;
            cMultiplication = false;
            cDivision = false;
            cperc = false;
            mValueOne =0 ;
            mValueTwo=0;
        }

    }
    public void clear(View view){
        cAddition = false;
        mSubtract = false;
        cMultiplication = false;
        cDivision = false;
        cperc = false;
        mValueOne =0 ;
        mValueTwo=0;
        op.setText(null);
    }
}