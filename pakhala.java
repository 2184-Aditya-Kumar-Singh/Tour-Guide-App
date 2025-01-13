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

public class pakhala extends AppCompatActivity {
    ImageView img12,img13;
    TextView txt12,txt13;
    Button btn22;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_pakhala);
        img12=findViewById(R.id.imageView12);
        img13=findViewById(R.id.imageView13);
        txt12=findViewById(R.id.textView12);
        txt13=findViewById(R.id.textView13);
        btn22=findViewById(R.id.button22);

        btn22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(pakhala.this,bbsrfood.class);
                i.putExtra("cityname","Bhubaneswar");
                startActivity(i);
            }
        });
    }
}