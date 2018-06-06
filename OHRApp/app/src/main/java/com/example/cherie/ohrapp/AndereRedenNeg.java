package com.example.cherie.ohrapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class AndereRedenNeg extends AppCompatActivity {

    private Button NextARN;
    private Button PreviousARN;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_andere_reden_neg);

        NextARN = (Button)findViewById(R.id.btnNextAndRedNeg);
        PreviousARN = (Button)findViewById(R.id.btnPrevAndRedNeg);

        NextARN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Verzonden.class);
            }
        });

        PreviousARN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), LijstRedenenNeg.class);
            }
        });
    }
}
