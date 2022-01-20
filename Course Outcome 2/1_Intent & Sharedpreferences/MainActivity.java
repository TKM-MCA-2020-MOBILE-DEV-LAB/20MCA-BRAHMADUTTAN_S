package com.example.intentsharedpreferences;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.util.Patterns;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {
    EditText fullname,emailid,phon,passwd;
    RadioGroup gender;
    RadioButton genderRadioButton;
    Button register;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        fullname = findViewById(R.id.fullname);
        emailid = findViewById(R.id.email);
        gender = findViewById(R.id.genders);
        phon = findViewById(R.id.phone);
        passwd = findViewById(R.id.passwd);
        register = findViewById(R.id.register);

        register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String name = fullname.getText().toString().trim();
                String email = emailid.getText().toString().trim();
//                String sex = gender.getText().toString().trim();
                String phone = phon.getText().toString().trim();
                String password = passwd.getText().toString().trim();

                if (name.isEmpty()){
                    fullname.setError("Provide your FullName");
                    fullname.requestFocus();
                }else if (name.matches(".*[0-9].*")){
                    fullname.setError("Name does not contain a number");
                    fullname.requestFocus();
                }else if (email.isEmpty()) {
                    emailid.setError("Emailid is required!");
                    emailid.requestFocus();
                } else if (!Patterns.EMAIL_ADDRESS.matcher(email).matches()) {
                    emailid.setError("Enter a valid Emailid");
                    emailid.requestFocus();
                }else if (gender == null) {
                    gender.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
                        @Override
                        public void onCheckedChanged(RadioGroup group, int checkedId) {
                            int selectedId = gender.getCheckedRadioButtonId();
                            genderRadioButton = (RadioButton) findViewById(selectedId);
                            if(selectedId==-1){
                                genderRadioButton.setError("Select your gender");
                                genderRadioButton.requestFocus();
                            }
                        }
                    });
                }else if(phone.isEmpty()){
                    phon.setError("Phone number is required!");
                    phon.requestFocus();
                }else if (phone.length()!=10){
                    phon.setError("Enter valid Phone number");
                    phon.requestFocus();
                }else if (password.isEmpty()) {
                    passwd.setError("Password is required!");
                    passwd.requestFocus();
                }else if(password.length() < 6){
                    passwd.setError("Enter valid Password at least 6 characters");
                    passwd.requestFocus();
                }else if(name.isEmpty() && email.isEmpty() && phone.isEmpty() && password.isEmpty()){
                    Toast.makeText(getApplicationContext(), "Fields Empty!", Toast.LENGTH_SHORT).show();
                }
                else
                {
                    Toast.makeText(getApplicationContext(), "Registration Successfully!!!", Toast.LENGTH_SHORT).show();
                    Intent intent = new Intent(getApplicationContext(),Sharedpreferences_Interface.class);
                    intent.putExtra("Name",name);
                    intent.putExtra("Email",email);
                    intent.putExtra("Phone",phone);
                    startActivity(intent);
                }

            }

        });

    }

    @Override
    protected void onResume() {
        super.onResume();

        // Fetching the stored data
        // from the SharedPreference
        SharedPreferences sh = getSharedPreferences("MySharedPref", MODE_PRIVATE);

        String name = sh.getString("Name", "");
        String email = sh.getString("Email", "");
        String mobile = sh.getString("Phone", "");


        // Setting the fetched data
        // in the EditTexts
        fullname.setText(name);
        emailid.setText(email);
        phon.setText(mobile);
    }
    @Override
    protected void onPause() {
        super.onPause();

        // Creating a shared pref object
        // with a file name "MySharedPref"
        // in private mode
        SharedPreferences sharedPreferences = getSharedPreferences("MySharedPref", MODE_PRIVATE);
        SharedPreferences.Editor Edit = sharedPreferences.edit();

        // write all the data entered by the user in SharedPreference and apply
        Edit.putString("Name", fullname.getText().toString());
        Edit.putString("Email", emailid.getText().toString());
        Edit.putString("Phone", phon.getText().toString());
        Edit.apply();
    }
}