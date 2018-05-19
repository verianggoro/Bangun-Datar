package com.devlat.veri.bangundatar;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Segitiga extends AppCompatActivity {

    Button BtnLuasSgt, BtnKellSgt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segitiga);
        BtnLuasSgt = (Button) findViewById(R.id.Btn_Luas_Sgt);
        BtnKellSgt = (Button) findViewById(R.id.Btn_Kell_Sgt);

        BtnLuasSgt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent MoveLuasSgt = new Intent(Segitiga.this, LuasSegitiga.class);
                startActivity(MoveLuasSgt);
            }
        });
        BtnKellSgt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent MoveKellSgt = new Intent(Segitiga.this, KellSegitiga.class);
                startActivity(MoveKellSgt);
            }
        });
    }
}
