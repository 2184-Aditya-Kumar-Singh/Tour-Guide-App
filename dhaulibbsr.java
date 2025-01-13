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

public class dhaulibbsr extends AppCompatActivity {
    ImageView img7,img8;
    TextView txt7,txt8;
    Button btn14;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_dhaulibbsr);
        img7=findViewById(R.id.imageView7);
        img8=findViewById(R.id.imageView8);
        txt7=findViewById(R.id.textView7);
        txt8=findViewById(R.id.textView8);
        btn14=findViewById(R.id.button14);

        btn14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(getApplicationContext(),bbsrplaces.class);
                i.putExtra("cityname","Bhubaneswar");
                startActivity(i);
            }
        });

    }
}