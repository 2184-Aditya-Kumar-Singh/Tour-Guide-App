package com.example.touristguide;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

public class page2 extends AppCompatActivity {
    TextView txt;
    Spinner spinner;
    Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_page2);
        spinner = findViewById(R.id.spinner);
        txt = findViewById(R.id.txtview);
        btn = findViewById(R.id.button2);

        String[] info = {"Bhubaneswar", "Bengaluru", "Gaya", "Kolkata"};
        ArrayAdapter<String> adapter = new ArrayAdapter<>(
                this,
                android.R.layout.simple_spinner_item,
                info
        );
        spinner.setAdapter(adapter);

        String selection = "Bhubaneswar";
        int spinnerPosition = adapter.getPosition(selection);
        spinner.setSelection(spinnerPosition);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Use getSelectedItemPosition() to get the current selection
                String str = spinner.getItemAtPosition(spinner.getSelectedItemPosition()).toString();
                Intent i = new Intent(getApplicationContext(), page3.class);
                i.putExtra("city", str);
                startActivity(i);
            }
        });
    }
}