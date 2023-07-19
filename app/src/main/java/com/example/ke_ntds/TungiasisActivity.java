package com.example.ke_ntds;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class TungiasisActivity extends AppCompatActivity {

    TextView sympTitle, sympText, diagTitle, diagText;
    ImageView imageView;

    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tungiasis);

        imageView = findViewById(R.id.item_image);
        sympTitle = findViewById(R.id.symptoms_title);
        sympText = findViewById(R.id.symptoms_text);
        diagTitle = findViewById(R.id.diagnosis_title);
        diagText = findViewById(R.id.diagnosis_text);

        imageView.setImageResource(R.drawable.image1);
        sympTitle.setText("Symptoms");
        sympText.setText("1.\tItchy\n2.\tAbdominal pain\n3.\tChest pain\n4.\tMusch pain.");
        diagTitle.setText("Diagnosis");
        diagText.setText("1.\tMacroacopic examination");
    }
}