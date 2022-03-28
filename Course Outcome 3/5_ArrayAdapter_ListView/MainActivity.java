package com.example.workshopactivity1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    ListView listView;
    ArrayAdapter<String> arrayAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = findViewById(R.id.list);

        String games[] = {"Football","Badminton","Cricket","Volleyball","Golf","Tennis"};

        arrayAdapter = new ArrayAdapter<>(MainActivity.this,android.R.layout.simple_list_item_1,games);
        listView.setAdapter(arrayAdapter);

    }
}