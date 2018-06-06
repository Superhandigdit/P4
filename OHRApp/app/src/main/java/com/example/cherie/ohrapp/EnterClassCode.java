package com.example.cherie.ohrapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class EnterClassCode extends AppCompatActivity {

    private Button NextECC;
    private Button PreviousECC;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_enter_class_code);

        NextECC = (Button)findViewById(R.id.btnNextEntClaCod);
        PreviousECC = (Button)findViewById(R.id.btnPrevEntClaCod);

        NextECC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), LesGoedSlecht.class);
                startActivity(intent);
            }
        });
        PreviousECC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), StudentLogin.class);
                startActivity(intent);
            }
        });
    }
}
