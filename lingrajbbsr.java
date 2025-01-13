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

public class lingrajbbsr extends AppCompatActivity {
    Button btn11;
    TextView txt1,txt2;
    ImageView img1,img2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_lingrajbbsr);

        btn11=findViewById(R.id.button11);
        txt1=findViewById(R.id.textView2);
        txt2=findViewById(R.id.textView3);
        img1=findViewById(R.id.imageView2);
        img2=findViewById(R.id.imageView3);

        btn11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(lingrajbbsr.this,bbsrplaces.class);
                i.putExtra("cityname","Bhubaneswar");
                startActivity(i);
            }
        });

    }
}