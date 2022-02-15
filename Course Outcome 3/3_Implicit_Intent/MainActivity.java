package com.example.implicit_intent;

import static android.content.Intent.ACTION_VIEW;

import androidx.activity.result.contract.ActivityResultContracts;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
    public void facebook(View view){
        Intent intent = new Intent(ACTION_VIEW);
        intent.setData(Uri.parse("https://www.facebook.com/"));
        startActivity(intent);
    }

    public void instagram(View view){
        Intent intent = new Intent(ACTION_VIEW);
        intent.setData(Uri.parse("https://www.instagram.com/"));
        startActivity(intent);
    }

    public void twitter(View view){
        Intent intent = new Intent(ACTION_VIEW);
        intent.setData(Uri.parse("https://twitter.com/"));
        startActivity(intent);
    }

    public void linkedin(View view){
        Intent intent = new Intent(ACTION_VIEW);
        intent.setData(Uri.parse("https://www.linkedin.com/"));
        startActivity(intent);
    }
}