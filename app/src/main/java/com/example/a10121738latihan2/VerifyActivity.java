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

public class VerifyActivity extends AppCompatActivity{
    Button sendBtn;

    @Override
    protected void onCreate(Bundle savedIstanceState) {
        super.onCreate(savedIstanceState);
        setContentView(R.layout.activity_verify);
        Objects.requireNonNull(getSupportActionBar()).hide();

        sendBtn = findViewById(R.id.btn_send);
        sendBtn.setOnClickListener((v)->{
            Intent intent = new Intent(this, HomeActivity.class);
            startActivity(intent);
        });
    }
}

