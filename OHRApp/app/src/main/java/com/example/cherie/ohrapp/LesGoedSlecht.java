package com.example.cherie.ohrapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class LesGoedSlecht extends AppCompatActivity {

    private Button BadGS;
    private Button GoodGS;
    private Button PreviousGS;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_les_goed_slecht);

        BadGS = (Button)findViewById(R.id.btnBadGoodBad);
        GoodGS = (Button)findViewById(R.id.btnGoodGoodBad);
        PreviousGS = (Button)findViewById(R.id.btnPrevGoodBad);

        BadGS.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), LijstRedenenNeg.class);
                startActivity(intent);
            }
        });
        GoodGS.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), LijstRedenenPos.class);
                startActivity(intent);
            }
        });
        PreviousGS.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), StudentLogin.class);
                startActivity(intent);
            }
        });
    }
}
