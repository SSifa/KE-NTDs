package com.example.ke_ntds;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class RegisterActivity extends AppCompatActivity {

    FirebaseDatabase db;
    DatabaseReference reference;
    TextView tvLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        tvLogin = findViewById(R.id.txtRegLogin);

        tvLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(), MainActivity.class));
            }
        });
    }
    public static boolean isValid(String passwd){
        int f1 = 0, f2 = 0, f3 = 0;
        if (passwd.length() < 8){
            return false;
        }else {
            for (int p = 0; p < passwd.length(); p++){
                if (Character.isLetter(passwd.charAt(p))){
                    f1 = 1;
                }
            }
            for (int r = 0; r < passwd.length(); r++){
                if (Character.isDigit(passwd.charAt(r))){
                    f2 = 1;
                }
            }
            for (int s = 0; s < passwd.length(); s++){
                char c = passwd.charAt(s);
                if (c >= 33 && c <= 46 || c == 64){
                    f3 = 1;
                }
            }
            if (f1 ==1 && f2 == 1 && f3 == 1)
                return true;
            return false;
        }
    }
}