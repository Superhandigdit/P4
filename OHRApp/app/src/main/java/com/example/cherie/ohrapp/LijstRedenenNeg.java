package com.example.cherie.ohrapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class LijstRedenenNeg extends AppCompatActivity {

    private Button NextLRN;
    private Button OtherLRN;
    private Button PreviousLRN;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lijst_redenen_neg);

        NextLRN = (Button)findViewById(R.id.btnNextRedNeg);
        OtherLRN = (Button)findViewById(R.id.btnOthRedNeg);
        PreviousLRN = (Button)findViewById(R.id.btnPrevRedNeg);


        NextLRN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Verzonden.class);
                startActivity(intent);
            }
        });
        OtherLRN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), AndereRedenNeg.class);
                startActivity(intent);
            }
        });
        PreviousLRN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), LesGoedSlecht.class);
                startActivity(intent);
            }
        });
    }
}
