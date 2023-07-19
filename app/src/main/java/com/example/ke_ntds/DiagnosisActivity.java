package com.example.ke_ntds;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class DiagnosisActivity extends AppCompatActivity {
    CardView tungiasisCV, glaucomaCV, filariasisCV, schistosomiasisCV;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_diagnosis);

        tungiasisCV = findViewById(R.id.tungiasisCdView);
        glaucomaCV = findViewById(R.id.glaucomaCdView);
        filariasisCV = findViewById(R.id.filariasisCdView);
        schistosomiasisCV = findViewById(R.id.schistosomiasisCdView);

        tungiasisCV.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(), TungiasisActivity.class));
            }
        });
    }
}