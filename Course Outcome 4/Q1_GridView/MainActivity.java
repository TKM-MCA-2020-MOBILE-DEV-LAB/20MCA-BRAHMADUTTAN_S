package com.example.gridview;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;

public class MainActivity extends AppCompatActivity {

    GridView gridView;

    int logos[] = {R.drawable.logo_facebook, R.drawable.logo_insta,R.drawable.logo_amazon,R.drawable.logo_postgress,R.drawable.logo_android,R.drawable.logo_linkedin,R.drawable.logo_twitter,R.drawable.logo_youtube};
    String[] names = {"Facebook","Instagram","Amazon","PostgresQL","Android","Linkedin","Twitter","Youtube"};
    final Context context = this;
    AlertDialog.Builder builder;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        gridView = findViewById(R.id.gridViewId);
        gridView.setAdapter(new ImageAdapter(this));
        builder = new AlertDialog.Builder(this);

        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            public void onItemClick(AdapterView<?> parent, View view, int position,long id){
                builder.setMessage("Name: "+String.valueOf(names[position])).setCancelable(false).setPositiveButton("Ok", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int id) {

                    }
                });
                AlertDialog alert = builder.create();
                alert.setTitle("Icon Information");
                alert.show();
            }
        });

    }
}