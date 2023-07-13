package com.example.ke_ntds;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Spinner;
import android.widget.Toast;

public class ReportFragment extends Fragment {

    AutoCompleteTextView autoCompleteTextView, autoCompleteTextView1;
    String[] mobilityState = {"Severe", "Moderate", "Mild"};
    String[] caseTypes = {"Tungiasis", "Lymphatic filariasis", "Glaucoma", "Schistomiasis"};
    ArrayAdapter<String> arrayAdapter1;
    ArrayAdapter<String> arrayAdapter;
    String selectedCaseType, selectedMobility;
    ArrayAdapter<CharSequence> adapterItems;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = LayoutInflater.from(getContext())
                .inflate(R.layout.fragment_report, container, false);

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

        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_report, container, false);
    }
}