package com.example.touristguide;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class bbsrfood extends AppCompatActivity {
    Button btn19,btn17,btn18,btn20,btn16;
    TextView txt9;
    ImageView img9;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_bbsrfood);
        txt9=findViewById(R.id.textView9);
        img9=findViewById(R.id.imageView9);
        btn19=findViewById(R.id.button19);
        btn17=findViewById(R.id.button17);
        btn18=findViewById(R.id.button18);
        btn20=findViewById(R.id.button20);
        btn16=findViewById(R.id.button16);

        String citynname=getIntent().getStringExtra("cityname");

        btn17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
//                chehanpoda
                Intent i=new Intent(getApplicationContext(),chehanpodabbsr.class);
                startActivity(i);
            }
        });

        btn18.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
//                pakhala
                Intent i=new Intent(getApplicationContext(),pakhala.class);
                startActivity(i);
            }
        });

        btn20.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                khaja
            }
        });

        btn19.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
//                dalma
            }
        });

        btn16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
//               back
                Intent i=new Intent(bbsrfood.this, page3.class);
                i.putExtra("city",citynname);
                startActivity(i);
            }
        });
    }
}