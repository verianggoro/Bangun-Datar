package com.devlat.veri.bangundatar;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class perseegi extends AppCompatActivity {
    Button BtnLuas, BtnKell, BtnResetPersegi;
    EditText InSisi;
    TextView OutHasil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_perseegi);
        BtnLuas = (Button) findViewById(R.id.Btn_luas_persegi);
        BtnKell = (Button) findViewById(R.id.Btn_kell_persegi);
        InSisi = (EditText) findViewById(R.id.InSisi);
        OutHasil = (TextView) findViewById(R.id.Tv_hasil_persegi);
        BtnResetPersegi = (Button) findViewById(R.id.Btn_reset);

        BtnLuas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (InSisi.length() == 0) {
                    Toast.makeText(getApplication(), "Kolom Sisi Harus Terisi", Toast.LENGTH_LONG).show();
                } else {
                    double sisi = Double.parseDouble(InSisi.getText().toString());
                    double hasil = sisi * sisi;
                    OutHasil.setText(String.valueOf(hasil));
                }
            }
        });

        BtnKell.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (InSisi.length() == 0) {
                    Toast.makeText(getApplication(), "Kolom Sisi Harus Terisi", Toast.LENGTH_LONG).show();
                } else {
                    double sisi = Double.parseDouble(InSisi.getText().toString());
                    double hasil = 4.0 * sisi;
                    OutHasil.setText(String.valueOf(hasil));
                }
            }
        });

        BtnResetPersegi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                InSisi.getText().clear();
                OutHasil.setText("0");
            }
        });
    }
}
