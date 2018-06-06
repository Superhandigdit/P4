package com.example.cherie.ohrapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;

public class SelectClass extends AppCompatActivity {

    private Button PrevSlCls;
    private Button NextSlCls;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_select_class);

        PrevSlCls = (Button)findViewById(R.id.btnPrevSelClass);
        NextSlCls = (Button)findViewById(R.id.btnNextSelClass);

        PrevSlCls.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SelectClass.this, TeacherLogin.class);
                startActivity(intent);
            }
        });

        NextSlCls.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SelectClass.this, Graphs.class);
                startActivity(intent);

            }
        });

        Spinner spinner = findViewById(R.id.spnClass);
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this, R.array.Classes, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);
    }
}
