package com.example.workshopactivity2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Switch;
import android.widget.Toast;

import com.google.android.material.tabs.TabLayout;

public class MainActivity extends AppCompatActivity {

    ListView listView;
    ArrayAdapter<String> arrayAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String SuperHeroes[] = {"SpiderMan","SuperMan","BatMan","MinnalMurali","WonderWomen","DareDevil","Hulk","IronMan","CaptainAmerica","AquaMan","Venom"};

        try {
            listView = findViewById(R.id.list);
//            listView = null;
            arrayAdapter = new ArrayAdapter<>(MainActivity.this, android.R.layout.simple_list_item_1,SuperHeroes);
            listView.setAdapter(arrayAdapter);
        }catch (Exception e){
            Toast.makeText(this,e.getMessage(),Toast.LENGTH_SHORT).show();
        }


    }
}