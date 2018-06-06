package com.example.cherie.ohrapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Comments extends AppCompatActivity {

    private Button GraphCom;
    private Button PreviousCom;
    private Button QuitCom;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_comments);

        GraphCom = (Button)findViewById(R.id.btnGrphCom);
        PreviousCom = (Button)findViewById(R.id.btnPrevCom);
        QuitCom = (Button)findViewById(R.id.btnQuitCom);

        GraphCom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Graphs.class);
                startActivity(intent);
            }
        });

        PreviousCom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), SelectClass.class);
                startActivity(intent);
            }
        });
        QuitCom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), HomeScreen.class);
                intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                intent.putExtra("EXIT", true);
                startActivity(intent);
            }
        });
    }
}
