package com.devlat.veri.bangundatar;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class KellSegitiga extends AppCompatActivity {
    Button BtnHasilKellSgt, BtnResetKellSgt;
    EditText InSisi1, InSisi2, InSisi3;
    TextView OutKellSgt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kell_segitiga);
        BtnHasilKellSgt = (Button) findViewById(R.id.Btn_Hsl_KellSgt);
        BtnResetKellSgt = (Button) findViewById(R.id.Btn_Hps_KellSgt);
        InSisi1 = (EditText) findViewById(R.id.In_Sisi1_Sgt);
        InSisi2 = (EditText) findViewById(R.id.In_Sisi2_Sgt);
        InSisi3 = (EditText) findViewById(R.id.In_Sisi3_Sgt);
        OutKellSgt = (TextView) findViewById(R.id.Tv_HasilKell_Sgt);

        BtnHasilKellSgt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (InSisi1.length() == 0 && InSisi2.length() == 0 && InSisi3.length() == 0) {
                    Toast.makeText(getApplication(), "Kolom Harus Terisi Semua", Toast.LENGTH_LONG).show();
                } else if (InSisi1.length() == 0 && InSisi2.length() == 0) {
                    Toast.makeText(getApplication(), "Kolom Harus Terisi Semua", Toast.LENGTH_LONG).show();
                } else if (InSisi1.length() == 0 && InSisi3.length() == 0) {
                    Toast.makeText(getApplication(), "Kolom Harus Terisi Semua", Toast.LENGTH_LONG).show();
                } else if (InSisi2.length() == 0 && InSisi3.length() == 0) {
                    Toast.makeText(getApplication(), "Kolom Harus Terisi Semua", Toast.LENGTH_LONG).show();
                } else if (InSisi1.length() == 0) {
                    Toast.makeText(getApplication(), "Kolom Sisi 1 Harus Terisi", Toast.LENGTH_LONG).show();
                } else if (InSisi2.length() == 0) {
                    Toast.makeText(getApplication(), "Kolom Sisi 2 Harus Terisi", Toast.LENGTH_LONG).show();
                } else if (InSisi3.length() == 0) {
                    Toast.makeText(getApplication(), "Kolom Sisi 3 Harus Terisi", Toast.LENGTH_LONG).show();
                } else {
                    int sisi1 = Integer.parseInt(InSisi1.getText().toString());
                    int sisi2 = Integer.parseInt(InSisi2.getText().toString());
                    int sisi3 = Integer.parseInt(InSisi3.getText().toString());
                    int hasilKellSgt = sisi1 + sisi2 + sisi3;
                    OutKellSgt.setText(String.valueOf(hasilKellSgt));
                }
            }
        });
        BtnResetKellSgt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                InSisi1.getText().clear();
                InSisi2.getText().clear();
                InSisi3.getText().clear();
                OutKellSgt.setText("0");
            }
        });

    }
}
