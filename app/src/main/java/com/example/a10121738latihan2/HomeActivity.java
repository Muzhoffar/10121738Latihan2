//NIM   : 10121738
//Nama  : Rifqi Sirojul Muzhoffar
//Kelas : IF-9
//Tanggal Pengerjaan : 17/04/2023

package com.example.a10121738latihan2;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import java.util.Objects;

public class HomeActivity extends AppCompatActivity{

    @Override
    protected void onCreate(Bundle savedInstaceState){
        super.onCreate(savedInstaceState);
        setContentView(R.layout.activity_home);
        Objects.requireNonNull(getSupportActionBar()).hide();
    }
}
