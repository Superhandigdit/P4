package com.example.cherie.ohrapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class LijstRedenenPos extends AppCompatActivity {

    private Button NextLRP;
    private Button OtherLRP;
    private Button PreviousLRP;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lijst_redenen_pos);

        NextLRP = (Button)findViewById(R.id.btnNextRedPos);
        OtherLRP = (Button)findViewById(R.id.btnOthRedPos);
        PreviousLRP = (Button)findViewById(R.id.btnPrevRedPos);

        NextLRP.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Verzonden.class);
                startActivity(intent);
            }
        });

        OtherLRP.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), AndereRedenPos.class);
                startActivity(intent);
            }
        });

        PreviousLRP.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), LesGoedSlecht.class);
                startActivity(intent);
            }
        });
    }
}
