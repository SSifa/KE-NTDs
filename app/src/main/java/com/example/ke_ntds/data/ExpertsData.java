package com.example.ke_ntds.data;

import com.example.ke_ntds.R;
import com.example.ke_ntds.model.Expert;

import java.util.ArrayList;
import java.util.List;

public class ExpertsData {
    public List<Expert> loadExperts(){
        List<Expert> expert = new ArrayList<Expert>();
        expert.add(new Expert(R.drawable.a,"Ngombo", "sifangombo254@gmail.com", "Developer", 701249103, "Malindi"));
        expert.add(new Expert(R.drawable.b, "Sifa", "sifangombo2@gmail.com", "Nutritionist", 701249103, "Nyeri"));
        expert.add(new Expert(R.drawable.c,"Stephen", "sifangombo25@gmail.com", "Vetrinary Officer", 701249103, "Mombasa"));
        expert.add(new Expert(R.drawable.d, "Kithi", "sifangombo24@gmail.com", "Developer", 701249103, "Vihiga"));
        expert.add(new Expert(R.drawable.e, "Kalu", "sifangombo54@gmail.com", "Consultant", 701249103, "Webuye"));
        expert.add(new Expert(R.drawable.f, "Rehema", "sifangombo524@gmail.com", "Developer", 701249103, "Bungoma"));
        expert.add(new Expert(R.drawable.g, "Sidi", "sifangombo542@gmail.com", "Finance", 701249103, "Mumias"));
        expert.add(new Expert(R.drawable.h, "Sanita", "sifangombo425@gmail.com", "Developer", 701249103, "Kitale"));
        expert.add(new Expert(R.drawable.a, "Thinga", "sifangombo254@gmail.com", "Developer", 701249103, "Matungu"));
        expert.add(new Expert(R.drawable.b, "Jefa", "sifangombo2@gmail.com", "Nutritionist", 701249103, "Shinyalu"));
        expert.add(new Expert(R.drawable.c, "Kache", "sifangombo25@gmail.com", "Vetrinary Officer", 701249103, "Endebes"));
        expert.add(new Expert(R.drawable.d, "Mwango", "sifangombo24@gmail.com", "Developer", 701249103, "Kimilili"));
        expert.add(new Expert(R.drawable.e, "Karembo", "sifangombo54@gmail.com", "Consultant", 701249103,"Kakamega"));

        return expert;
    }
}
