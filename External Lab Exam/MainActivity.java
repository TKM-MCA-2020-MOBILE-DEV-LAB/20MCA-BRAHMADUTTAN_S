package com.example.optionsmenu;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater=getMenuInflater();
        inflater.inflate(R.menu.menus,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        int id=item.getItemId();
        if(id==R.id.action_home)
        {
//            Intent i=new Intent(MainActivity.this,Home.class);
//            startActivity(i);
            Toast.makeText(getApplicationContext(), "You are selected Home Menu", Toast.LENGTH_SHORT).show();
        }
        if(id==R.id.action_profile)
        {
            Intent i=new Intent(MainActivity.this,Profile.class);
            startActivity(i);
        }
        if(id==R.id.action_settings)
        {
            Intent i=new Intent(MainActivity.this,Settings.class);
            startActivity(i);
        }
        if(id==R.id.action_about)
        {
            Intent i=new Intent(MainActivity.this,About.class);
            startActivity(i);
        }
        return super.onOptionsItemSelected(item);

    }
}
