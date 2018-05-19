package com.devlat.veri.bangundatar;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button BtnPersegi, BtnPersegiPanjang, BtnLing, BtnSgTiga;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        BtnPersegi = (Button) findViewById(R.id.BtnPersegi);
        BtnPersegiPanjang = (Button) findViewById(R.id.BtnPersegiPanjang);
        BtnLing = (Button) findViewById(R.id.BtnLigkaran);
        BtnSgTiga = (Button) findViewById(R.id.BtnSegitiga);

        BtnPersegi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, perseegi.class);
                startActivity(intent);
            }
        });

        BtnPersegiPanjang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent pindahPersegiPanjang = new Intent(MainActivity.this, PersegiPanjang.class);
                startActivity(pindahPersegiPanjang);
            }
        });

        BtnLing.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent pinLing = new Intent(MainActivity.this, Lingkaran.class);
                startActivity(pinLing);
            }
        });

        BtnSgTiga.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent pinSgTiga = new Intent(MainActivity.this, Segitiga.class);
                startActivity(pinSgTiga);
            }
        });
    }
}
