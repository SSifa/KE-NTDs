package com.example.ke_ntds.data;

import com.example.ke_ntds.R;
import com.example.ke_ntds.model.Case;

import java.util.ArrayList;
import java.util.List;

public class CasesData {
    List<Case> cases = new ArrayList<>();
    public List<Case> loadCases(){
        cases.add(new Case(R.drawable.tungiasis2, "Tungiosis", "Severe", "Lurambi"));
        cases.add(new Case(R.drawable.filariasis, "Lymphatic Filariasis", "Moderate", "Shikhambi"));
        cases.add(new Case(R.drawable.tungiasis, "Tungiosis", "Mild", "Kefinko"));
        cases.add(new Case(R.drawable.filariasis, "Glaucoma", "Severe", "Khayega"));
        cases.add(new Case(R.drawable.tungiasis2, "Schistosomiasis", "Severe", "Lurambi"));
        cases.add(new Case(R.drawable.filariasis, "Lymphatic Filariasis", "Moderate", "Shikhambi"));
        cases.add(new Case(R.drawable.tungiasis, "Tungiosis", "Mild", "Kefinko"));
        cases.add(new Case(R.drawable.filariasis, "Glaucoma", "Severe", "Khayega"));

        return cases;
    }
}
