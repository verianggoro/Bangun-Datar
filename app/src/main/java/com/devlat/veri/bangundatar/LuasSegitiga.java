package com.devlat.veri.bangundatar;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class LuasSegitiga extends AppCompatActivity {
    Button HasilLuasSgt, ResetLuasSgt;
    EditText InAlasSgt, InTinggiSgt;
    TextView OutLuasSgt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_luas_segitiga);
        HasilLuasSgt = (Button) findViewById(R.id.Btn_Hsl_LuasSgt);
        ResetLuasSgt = (Button) findViewById(R.id.Btn_Hps_LuasSgt);
        InAlasSgt = (EditText) findViewById(R.id.In_Alas_Sgt);
        InTinggiSgt = (EditText) findViewById(R.id.In_Tinggi_Sgt);
        OutLuasSgt = (TextView) findViewById(R.id.Tv_HasilLuas_Sgt);

        HasilLuasSgt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (InAlasSgt.length() == 0 && InTinggiSgt.length() == 0) {
                    Toast.makeText(getApplication(), "Koloom Alas dan Tinggi Harus Terisi", Toast.LENGTH_LONG).show();
                } else if (InAlasSgt.length() == 0) {
                    Toast.makeText(getApplication(), "Kolom Alas Harus Terisi", Toast.LENGTH_LONG).show();
                } else if (InTinggiSgt.length() == 0) {
                    Toast.makeText(getApplication(), "Kolom Tinggi Harus Terisi", Toast.LENGTH_LONG).show();
                } else {
                    double alasSgt = Double.parseDouble(InAlasSgt.getText().toString());
                    double tinggiSgt = Double.parseDouble(InTinggiSgt.getText().toString());
                    double hasilLuasSgt = (alasSgt * tinggiSgt) / 2;
                    OutLuasSgt.setText(String.valueOf(hasilLuasSgt));
                }
            }
        });

        ResetLuasSgt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                InAlasSgt.getText().clear();
                InTinggiSgt.getText().clear();
                OutLuasSgt.setText("0");
            }
        });
    }
}
