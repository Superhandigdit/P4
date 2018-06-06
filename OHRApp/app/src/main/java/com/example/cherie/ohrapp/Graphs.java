package com.example.cherie.ohrapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Graphs extends AppCompatActivity {

    private Button PrevGrph;
    private Button QuitGrph;
    private Button CommentsGrph;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_graphs);

        PrevGrph = (Button)findViewById(R.id.btnPrevGraph);
        QuitGrph = (Button)findViewById(R.id.btnQuitGraph);
        CommentsGrph = (Button)findViewById(R.id.btnComGraph);

        PrevGrph.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Graphs.this, SelectClass.class);
                startActivity(intent);
            }
        });


        CommentsGrph.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Graphs.this, Comments.class);
                startActivity(intent);
            }
        });

        QuitGrph.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Graphs.this, HomeScreen.class);
                intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                intent.putExtra("EXIT", true);
                startActivity(intent);
            }
        });

    }
}
