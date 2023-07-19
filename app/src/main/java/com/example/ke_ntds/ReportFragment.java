package com.example.ke_ntds;

import android.content.Intent;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;

import androidx.core.content.ContextCompat;
import androidx.fragment.app.Fragment;

import android.preference.PreferenceManager;
import android.provider.MediaStore;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.Toast;

import java.io.IOException;
import java.util.Objects;

public class ReportFragment extends Fragment {

    Button btnReport;
    AutoCompleteTextView autoCompleteTextView, autoCompleteTextView1;
    String[] mobilityState = {"Severe", "Moderate", "Mild"};
    String[] caseTypes = {"Diagnosis", "Lymphatic filariasis", "Glaucoma", "Schistomiasis"};
    ArrayAdapter<String> arrayAdapter1;
    ArrayAdapter<String> arrayAdapter;
    String selectedCaseType, selectedMobility;
    ArrayAdapter<CharSequence> adapterItems;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_report, container, false);

        btnReport = view.findViewById(R.id.btn_report_case);

        autoCompleteTextView = view.findViewById(R.id.auto_complete_text);
        arrayAdapter = new ArrayAdapter<String>(this.getContext(), R.layout.case_types, mobilityState);
        autoCompleteTextView.setAdapter(arrayAdapter);

        autoCompleteTextView1 = view.findViewById(R.id.auto_complete_text1);
        arrayAdapter1 = new ArrayAdapter<String>(this.getContext(), R.layout.case_types, caseTypes);
        autoCompleteTextView1.setAdapter(arrayAdapter1);

        autoCompleteTextView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                selectedMobility = adapterView.getItemAtPosition(i).toString();
                Toast.makeText(getContext(), "Item: " + selectedMobility, Toast.LENGTH_SHORT).show();
            }
        });
        autoCompleteTextView1.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                selectedCaseType = adapterView.getItemAtPosition(i).toString();
                Toast.makeText(getContext(), "Item: " + selectedCaseType, Toast.LENGTH_SHORT).show();
            }
        });

        btnReport.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getActivity(), "Button clicked", Toast.LENGTH_SHORT).show();
            }
        });

        // Inflate the layout for this fragment
        return view;
    }
}