package com.devlat.veri.bangundatar;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Lingkaran extends AppCompatActivity {
    Button BtnLuasLing, BtnKellLing, BtnHapusLing;
    EditText InJariLing;
    TextView OutLing;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lingkaran);
        BtnLuasLing = (Button) findViewById(R.id.Btn_Luas_Ling);
        BtnKellLing = (Button) findViewById(R.id.Btn_Kell_Ling);
        BtnHapusLing = (Button) findViewById(R.id.Btn_reset_Ling);
        InJariLing = (EditText) findViewById(R.id.In_jari);
        OutLing = (TextView) findViewById(R.id.Tv_Hasil_Ling);

        BtnLuasLing.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (InJariLing.length() == 0) {
                    Toast.makeText(getApplication(), "Kolom Jari-Jari Tidak Boleh Kosong", Toast.LENGTH_LONG).show();
                } else {
                    double InJari = Double.parseDouble(InJariLing.getText().toString());
                    double hasil = 3.14 * InJari * InJari;
                    OutLing.setText(String.valueOf(hasil));
                }
            }
        });
        BtnKellLing.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (InJariLing.length() == 0) {
                    Toast.makeText(getApplication(), "Kolom Jari-Jari Tidak Boleh Kosong", Toast.LENGTH_LONG).show();
                } else {
                    double InJari = Double.parseDouble(InJariLing.getText().toString());
                    double hasil = 3.14 * 2 * InJari;
                    OutLing.setText(String.valueOf(hasil));
                }
            }
        });
        BtnHapusLing.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                InJariLing.getText().clear();
                OutLing.setText("0");
            }
        });
    }
}
