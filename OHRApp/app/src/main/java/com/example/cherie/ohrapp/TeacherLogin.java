package com.example.cherie.ohrapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class TeacherLogin extends AppCompatActivity {

    private EditText NameT;
    private EditText PasswordT;
    private TextView AttemptsT;
    private Button LoginT;
    private int CounterT = 3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_teacher_login);

        NameT = (EditText)findViewById(R.id.etUsernameT);
        PasswordT = (EditText)findViewById(R.id.etPasswordT);
        AttemptsT = (TextView)findViewById(R.id.tvAttemptsT);
        LoginT = (Button)findViewById(R.id.btnLoginT);

        AttemptsT.setText("Remaining attempts: 3");


        LoginT.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                validateT(NameT.getText().toString(), PasswordT.getText().toString());
            }
        });
    }

    private void validateT(String userNameT, String userPasswordT){
        if((userNameT.equals("A.B.C")) && (userPasswordT.equals("123"))){
            Intent intent = new Intent(TeacherLogin.this, SelectClass.class);
            startActivity(intent);
        }else{
            CounterT--;

            AttemptsT.setText("Remaining attempts: " + String.valueOf(CounterT));

            if(CounterT == 0){
                LoginT.setEnabled(false);
            }



        }
    }
}
