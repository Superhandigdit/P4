package com.example.cherie.ohrapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class StudentLogin extends AppCompatActivity {

    private EditText Name;
    private EditText Password;
    private Button Login;
    private TextView Attempts;
    private int Counter = 3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_student_login);

        Name = (EditText)findViewById(R.id.etUsernameS);
        Password = (EditText)findViewById(R.id.etPasswordS);
        Login = (Button)findViewById(R.id.btnLoginS);
        Attempts = (TextView)findViewById(R.id.tvAttemptsS);

        Attempts.setText("Remaining attempts: 3");

        Login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                validate(Name.getText().toString(), Password.getText().toString());

            }
        });
    }

    private void validate(String userNameS, String passwordS){
        if ((userNameS.equals("0940401@hr.nl")) && (passwordS.equals("1234"))){
            Intent intent = new Intent(StudentLogin.this, EnterClassCode.class);
            startActivity(intent);
        }else{
            Counter--;

            Attempts.setText("Remaining attempts: " + String.valueOf(Counter));

            if(Counter == 0){
                Login.setEnabled(false);
            }

        }
    }
}
