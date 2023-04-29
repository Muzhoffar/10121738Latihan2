//NIM   : 10121738
//Nama  : Rifqi Sirojul Muzhoffar
//Kelas : IF-9
//Tanggal Pengerjaan : 17/04/2023

package com.example.a10121738latihan2;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;
import java.util.Objects;

public class AlmostThereActivity extends AppCompatActivity{

    Button verifyBtn;

    @Override
    protected void onCreate(Bundle savedInstaceState) {
        super.onCreate(savedInstaceState);
        setContentView(R.layout.activity_almost_there);
        Objects.requireNonNull(getSupportActionBar()).hide();

        verifyBtn = findViewById(R.id.verify);
        verifyBtn.setOnClickListener((v)->{
            Intent intent = new Intent(this, VerifyActivity.class);
            startActivity(intent);
        });
    }
}

