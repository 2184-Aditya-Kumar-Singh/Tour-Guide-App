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

public class khandgiribbsr extends AppCompatActivity {
    Button btn13;
    ImageView img6,img7;
    TextView txt6,txt7;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_khandgiribbsr);
        btn13=findViewById(R.id.button13);
        img6=findViewById(R.id.imageView6);
        img7=findViewById(R.id.imageView7);
        txt6=findViewById(R.id.textView6);
        txt7=findViewById(R.id.textView7);

        btn13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(khandgiribbsr.this,bbsrplaces.class);
                i.putExtra("cityname","Bhubaneswar");
                startActivity(i);
            }
        });
    }
}