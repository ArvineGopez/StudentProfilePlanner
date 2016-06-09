package com.example.pbuskell.studentprofileplanner;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Login extends AppCompatActivity {
    EditText edtTxtUsername;
    EditText edtTxtPassword;
    Button btnLogin;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        edtTxtUsername = (EditText) findViewById(R.id.edtTxtUsername);
        edtTxtPassword = (EditText) findViewById(R.id.edtTxtPassword);
    }
}
