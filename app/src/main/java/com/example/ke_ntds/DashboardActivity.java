package com.example.ke_ntds;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class DashboardActivity extends AppCompatActivity {

    CardView mobilityCdView;
    CardView prevalenceCdView;
    CardView diagnosisCdView;
    CardView treatmentCdView;
    CardView doctorsCdView;
    CardView aboutCdView;

    @SuppressLint("CutPasteId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);

        mobilityCdView = findViewById(R.id.tungiasisCdView);
        prevalenceCdView = findViewById(R.id.glaucomaCdView);
        diagnosisCdView = findViewById(R.id.filariasisCdView);
        treatmentCdView = findViewById(R.id.schistosomiasisCdView);
        doctorsCdView = findViewById(R.id.doctorsCdView);
        aboutCdView = findViewById(R.id.aboutCdView);

        mobilityCdView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), DiseaseMobility.class);
                startActivity(intent);
            }
        });

        prevalenceCdView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), DiseasePrevalence.class);
                startActivity(intent);
            }
        });

        diagnosisCdView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), DiagnosisActivity.class);
                startActivity(intent);
            }
        });

        treatmentCdView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), Treatment.class);
                startActivity(intent);
            }
        });

        doctorsCdView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), Doctors.class);
                startActivity(intent);
            }
        });

        aboutCdView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), AboutUs.class);
                startActivity(intent);
            }
        });
    }
}