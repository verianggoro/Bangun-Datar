package com.devlat.veri.bangundatar;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class PersegiPanjang extends AppCompatActivity {
    Button BtnLuasPersegiPnjng, BtnResetPersegiPnjng, BtnKellPersegiPnjng;
    TextView OutHasilPersegiPnjng;
    EditText InPanjang, InLebar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_persegi_panjang);
        BtnKellPersegiPnjng = (Button) findViewById(R.id.Btn_Kell_persegiPanjang);
        BtnLuasPersegiPnjng = (Button) findViewById(R.id.Btn_Luas_persegiPanjang);
        BtnResetPersegiPnjng = (Button) findViewById(R.id.Btn_reset_persegiPanjang);
        OutHasilPersegiPnjng = (TextView) findViewById(R.id.Tv_hasil_Persegi_Pnjng);
        InPanjang = (EditText) findViewById(R.id.In_Pnjg_PP);
        InLebar = (EditText) findViewById(R.id.In_Lbr_PP);

        BtnLuasPersegiPnjng.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (InPanjang.length() == 0 && InLebar.length() == 0) {
                    Toast.makeText(getApplication(), "Kolom Panjang dan Lebar harus terisi", Toast.LENGTH_LONG).show();
                } else if (InPanjang.length() == 0) {
                    Toast.makeText(getApplication(), "Kolom Panjang Harus Terisi", Toast.LENGTH_LONG).show();
                } else if (InLebar.length() == 0) {
                    Toast.makeText(getApplication(), "Kolom lebar harus terisi", Toast.LENGTH_LONG).show();
                } else {
                    int panjang = Integer.parseInt(InPanjang.getText().toString());
                    int lebar = Integer.parseInt(InLebar.getText().toString());
                    int hasil = panjang * lebar;
                    OutHasilPersegiPnjng.setText(String.valueOf(hasil));
                }
            }
        });
        BtnKellPersegiPnjng.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (InPanjang.length() == 0 && InLebar.length() == 0) {
                    Toast.makeText(getApplication(), "Kolom Panjang dan Lebar harus terisi", Toast.LENGTH_LONG).show();
                } else if (InPanjang.length() == 0) {
                    Toast.makeText(getApplication(), "Kolom Panjang Harus Terisi", Toast.LENGTH_LONG).show();
                } else if (InLebar.length() == 0) {
                    Toast.makeText(getApplication(), "Kolom lebar harus terisi", Toast.LENGTH_LONG).show();
                } else {
                    int panjang = Integer.parseInt(InPanjang.getText().toString());
                    int lebar = Integer.parseInt(InLebar.getText().toString());
                    int hasil = 2 * (panjang + lebar);
                    OutHasilPersegiPnjng.setText(String.valueOf(hasil));
                }
            }
        });
        BtnResetPersegiPnjng.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                InPanjang.getText().clear();
                InLebar.getText().clear();
                OutHasilPersegiPnjng.setText("0");
            }
        });
    }
}
