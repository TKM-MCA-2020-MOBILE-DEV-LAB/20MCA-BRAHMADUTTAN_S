package com.example.framelayout;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    ImageView image1,image2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        image1=(ImageView) findViewById(R.id.imageView1);
        image2=(ImageView) findViewById(R.id.imageView2);
        image1.setOnClickListener(this);
        image2.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if(v.getId()==R.id.imageView1)
        {
            image1.setVisibility(v.GONE);
            image2.setVisibility(v.VISIBLE);
        }
        else
        {

            image2.setVisibility(v.GONE);
            image1.setVisibility(v.VISIBLE);
        }
    }
}