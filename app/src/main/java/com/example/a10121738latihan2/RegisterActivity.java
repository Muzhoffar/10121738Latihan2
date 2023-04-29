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

public class RegisterActivity extends AppCompatActivity {
    Button regButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        Objects.requireNonNull(getSupportActionBar()).hide();

        regButton = findViewById(R.id.register2_btn);
        regButton.setOnClickListener((v)->{
            Intent intent = new Intent(this, AlmostThereActivity.class);
            startActivity(intent);
        });
    }
}
