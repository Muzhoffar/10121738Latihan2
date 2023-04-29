//NIM   : 10121738
//Nama  : Rifqi Sirojul Muzhoffar
//Kelas : IF-9
//Tanggal Pengerjaan : 17/04/2023

package com.example.a10121738latihan2;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.Objects;

public class MainActivity extends AppCompatActivity {
    TextView registerBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Objects.requireNonNull(getSupportActionBar()).hide();

        registerBtn = findViewById(R.id.register_btn);

        registerBtn.setOnClickListener((v) -> {
            Intent intent = new Intent(this, RegisterActivity.class);
            startActivity(intent);
        });
    }
}
