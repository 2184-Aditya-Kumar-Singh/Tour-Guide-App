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

import org.w3c.dom.Text;

public class nandanbbsr extends AppCompatActivity {
    Button btn12;
    ImageView img4, img5;
    TextView txt4,txt5;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_nandanbbsr);
        btn12=findViewById(R.id.button12);
        img4=findViewById(R.id.imageView4);
        img5=findViewById(R.id.imageView5);
        txt4=findViewById(R.id.textView4);
        txt5=findViewById(R.id.textView5);

        btn12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(nandanbbsr.this,bbsrplaces.class);
                i.putExtra("cityname","Bhubaneswar");
                startActivity(i);
            }
        });
    }
}