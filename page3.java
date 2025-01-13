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

public class page3 extends AppCompatActivity {
    ImageView img;
    Button btn;
    Button btn2;
    TextView txt;
    Button btn5;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_page3);
        img=findViewById(R.id.imageView);
        btn=findViewById(R.id.button3);
        btn2=findViewById(R.id.button4);
        btn5=findViewById(R.id.button5);
        txt=findViewById(R.id.textView);


        String cityname=getIntent().getStringExtra("city");
        txt.setText(cityname);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(txt.getText().equals("Bhubaneswar")){
                    Intent i=new Intent(getApplicationContext(),bbsrplaces.class);
                    i.putExtra("cityname",txt.getText());
                    startActivity(i);
                    }
                else if(txt.getText().equals("Gaya")){
                    Intent i=new Intent(getApplicationContext(),underconstruction.class);
                    i.putExtra("name",txt.getText());
                    startActivity(i);
                }else if(txt.getText().equals("Bengaluru")){
                    Intent i=new Intent(getApplicationContext(),underconstruction.class);
                    i.putExtra("name",txt.getText());
                    startActivity(i);
                }else if(txt.getText().equals("Kolkata")){
                    Intent i=new Intent(getApplicationContext(),underconstruction.class);
                    i.putExtra("name",txt.getText());
                    startActivity(i);
                }
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(txt.getText().equals("Bhubaneswar")){
                    Intent i=new Intent(getApplicationContext(),bbsrfood.class);
                    i.putExtra("cityname",txt.getText());
                    startActivity(i);
                }
                else if(txt.getText().equals("Gaya")){
                    Intent i=new Intent(getApplicationContext(),underconstruction.class);
                    i.putExtra("name",txt.getText());
                    startActivity(i);
                }else if(txt.getText().equals("Bengaluru")){
                    Intent i=new Intent(getApplicationContext(),underconstruction.class);
                    i.putExtra("name",txt.getText());
                    startActivity(i);
                }else if(txt.getText().equals("Kolkata")){
                    Intent i=new Intent(getApplicationContext(),underconstruction.class);
                    i.putExtra("name",txt.getText());
                    startActivity(i);
                }
            }
        });
        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Explicit Intent
                Intent i=new Intent(page3.this,page2.class);
                startActivity(i);
            }
        });
    }
}