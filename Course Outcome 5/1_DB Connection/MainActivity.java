package com.example.workshopsqlite;

import androidx.appcompat.app.AppCompatActivity;

import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Switch;
import android.widget.Toast;

//codeshare.io/wn3nDK

public class MainActivity extends AppCompatActivity {
    private EditText CustNameET,CustAgeET;
    private Button viewAll,Add;
    private Switch ActiveUser;
    UserDetails UsrDtls;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        CustNameET = findViewById(R.id.CustName);
        CustAgeET = findViewById(R.id.CustAge);
        ActiveUser = findViewById(R.id.switch1);
        viewAll = findViewById(R.id.viewbtn);
        Add = findViewById(R.id.addbtn);

        viewAll.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this,"All User Details",Toast.LENGTH_SHORT).show();
            }
        });

        Add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                     UsrDtls = new UserDetails(1,CustNameET.getText().toString(),Integer.parseInt(CustAgeET.getText().toString()),ActiveUser.isChecked());
//                    Toast.makeText(MainActivity.this,UsrDtls.toString(), Toast.LENGTH_SHORT).show();
                    DatabaseHelp database = new DatabaseHelp(MainActivity.this);
                    Boolean success = database.insertData(UsrDtls);
                    Toast.makeText(MainActivity.this,"Success", Toast.LENGTH_SHORT).show();
                }catch (Exception e){
                    Toast.makeText(MainActivity.this,"Error",Toast.LENGTH_SHORT).show();
                }

                }
        });
    }
}