package com.example.conversordeunidades;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;
public class MainActivity extends AppCompatActivity {
    Button btmtd, btmmon, btmmasa, btmlongi, btmvolu, btmtiempo, btmalma;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btmmon= findViewById(R.id.btmmon);
        btmmon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(),MonedaActivity.class));

            }
        });
        btmvolu= findViewById(R.id.btmvolu);
        btmvolu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(),VolumenActivity.class));
            }
        });

        btmalma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
        btmlongi= findViewById(R.id.btmlongi);
        btmlongi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(),longitud.class));
            }
        });
        btmmasa= findViewById(R.id.btmmasa);
        btmmasa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
        btmtiempo= findViewById(R.id.btmtiempo);
        btmtiempo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(),TiempoActivity.class));
            }
        });

        }

    }



