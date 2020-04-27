package com.example.bustracking;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Route60 extends AppCompatActivity {
    Button routemap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_route60);
        routemap=(Button)findViewById(R.id.button3);
        routemap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(Route60.this,MapsActivity2.class);
                startActivity(i);
            }
        });
    }
}
