package com.example.pbuskell.studentprofileplanner;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Login extends AppCompatActivity {
    EditText edtTxtUsername;
    EditText edtTxtPassword;
    Button btnLoginRed;
    TextView txtVwErrorRed;
    String userName;
    String password;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        edtTxtUsername = (EditText) findViewById(R.id.edtxtUsername);
        edtTxtPassword = (EditText) findViewById(R.id.edtxtPassword);
        btnLoginRed=(Button)findViewById(R.id.btnLoginRed);
        txtVwErrorRed=(TextView)findViewById(R.id.txtVwErrorRed);
        userName = getIntent().getStringExtra("USERNAME");
        password = getIntent().getStringExtra("PASSWORD");


    }


    public void insertLogin (View vw) {
        Intent studentPlanner = new Intent(this, studentPlanner.class);

        if(userName.equals("USERNAME") && password.equals("PASSWORD")){
            startActivityForResult(studentPlanner, 0);


        }else{
            if (edtTxtUsername.getText().length() == 0 || edtTxtPassword.getText().length() == 0) {
                txtVwErrorRed.setText("YOU MUST FILL IN ALL THE BLANKS IN ORDER TO LOGIN!");

            } else {
                txtVwErrorRed.setText("Your username or password is incorrect!");

            }

        }


        /** If user doesnt put anything on the blanks
        * it will say that you need to fill everything out
        * in order to login
        */

    }


}
