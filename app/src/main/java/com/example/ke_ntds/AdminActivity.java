package com.example.ke_ntds;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

public class AdminActivity extends AppCompatActivity {

    CardView mobilityCdView;
    CardView prevalenceCdView;
    CardView diagnosisCdView;
    CardView treatmentCdView;
    CardView doctorsCdView;
    CardView settingsCdView;

    @SuppressLint({"CutPasteId", "MissingInflatedId"})
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admin);

        mobilityCdView = findViewById(R.id.tungiasisCdView);
        prevalenceCdView = findViewById(R.id.glaucomaCdView);
        diagnosisCdView = findViewById(R.id.filariasisCdView);
        treatmentCdView = findViewById(R.id.schistosomiasisCdView);
        doctorsCdView = findViewById(R.id.doctorsCdView);
        settingsCdView = findViewById(R.id.settingsCView);

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

        settingsCdView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), SettingsActivity.class);
                startActivity(intent);
            }
        });
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.admin_menu, menu);
        return true;
    }

    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.settings:
                startActivity(new Intent(getApplicationContext(), SettingsActivity.class));
                return true;

            case R.id.logout:
                startActivity(new Intent(getApplicationContext(), MainActivity.class));
                return (true);
        }
        return (super.onOptionsItemSelected(item));
    }
}