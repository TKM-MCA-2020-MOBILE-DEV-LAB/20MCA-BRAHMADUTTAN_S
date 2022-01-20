package com.example.intentsharedpreferences;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class Sharedpreferences_Interface extends AppCompatActivity {
    TextView fullnm,gender,email_id,phone_no;

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sharedpreferences_interface);

        fullnm = findViewById(R.id.name);
        gender = findViewById(R.id.gender);
        email_id = findViewById(R.id.mail);
        phone_no = findViewById(R.id.phone1);

        Bundle extras=getIntent().getExtras();
        String name= extras.getString("Name");
        String sex = extras.getString("gender");
        String email= extras.getString("Email");
        String phone = extras.getString("Phone");

        fullnm.setText(name);
        gender.setText(sex);
        email_id.setText(email);
        phone_no.setText(phone);

    }

}