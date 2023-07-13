package com.example.ke_ntds;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.ke_ntds.adapter.MyExpertAdapter;
import com.example.ke_ntds.data.ExpertsData;
import com.example.ke_ntds.model.Expert;

import java.util.ArrayList;
import java.util.List;

public class Doctors extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_doctors);

        List<Expert> expertsData = new ExpertsData().loadExperts();
        RecyclerView recyclerView = findViewById(R.id.recycleView);

        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(new MyExpertAdapter(getApplicationContext(), expertsData));
    }
}