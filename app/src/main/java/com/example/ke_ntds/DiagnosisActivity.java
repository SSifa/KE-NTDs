package com.example.ke_ntds;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.viewpager.widget.ViewPager;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.google.android.material.tabs.TabLayout;

public class DiagnosisActivity extends AppCompatActivity {
    TabLayout tabLayout;
    ViewPager viewPager;
     @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_diagnosis);

         tabLayout = findViewById(R.id.tabLayout);
         viewPager = findViewById(R.id.viewPager);

         tabLayout.setupWithViewPager(viewPager);

         VPAdapter vpAdapter = new VPAdapter(getSupportFragmentManager(),
                 FragmentPagerAdapter.BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT);
         vpAdapter.addFragment(new GlaucomaFragment(), "GLAUCOMA");
         vpAdapter.addFragment(new TungiasisFragment(), "TUNGIASIS");
         vpAdapter.addFragment(new SchistosomiasisFragment(), "SCHISTOSOMIASIS");
         vpAdapter.addFragment(new FilariasisFragment(), "LYMPHATIC FILARIASIS");
         viewPager.setAdapter(vpAdapter);
    }
}