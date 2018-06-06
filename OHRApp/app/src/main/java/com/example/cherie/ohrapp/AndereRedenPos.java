package com.example.cherie.ohrapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class AndereRedenPos extends AppCompatActivity {

    private Button NextARP;
    private Button PreviousARP;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_andere_reden_pos);

        NextARP = (Button)findViewById(R.id.btnNextAndRedPos);
        PreviousARP = (Button)findViewById(R.id.btnPrevAndRedPos);

        NextARP.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Verzonden.class);
                startActivity(intent);
            }
        });

        PreviousARP.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), LijstRedenenPos.class);
            }
        });
    }
}
