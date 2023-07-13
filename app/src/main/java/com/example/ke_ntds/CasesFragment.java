package com.example.ke_ntds;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.ke_ntds.adapter.MyCaseAdapter;
import com.example.ke_ntds.data.CasesData;
import com.example.ke_ntds.model.Case;

import java.util.List;


public class CasesFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = LayoutInflater.from(getContext())
                .inflate(R.layout.fragment_cases, container, false);

        List<Case> casesData = new CasesData().loadCases();

        RecyclerView recyclerView = view.findViewById(R.id.recycleView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this.getContext()));
        recyclerView.setAdapter(new MyCaseAdapter(this.getContext(), casesData));

        return view;
    }
}