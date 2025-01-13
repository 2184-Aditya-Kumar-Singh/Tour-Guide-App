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

public class chehanpodabbsr extends AppCompatActivity {
    ImageView img10,img11;
    Button btn21;
    TextView txt10,txt11;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_chehanpodabbsr);

        img10=findViewById(R.id.imageView10);
        img11=findViewById(R.id.imageView11);
        btn21=findViewById(R.id.button21);
        txt10=findViewById(R.id.textView10);
        txt11=findViewById(R.id.textView11);

        btn21.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(chehanpodabbsr.this,bbsrfood.class);
                i.putExtra("cityname","Bhubaneswar");
                startActivity(i);
            }
        });
    }
}