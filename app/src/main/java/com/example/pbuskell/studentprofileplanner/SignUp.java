package com.example.pbuskell.studentprofileplanner;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class SignUp extends AppCompatActivity {
    private EditText edtTxtUsername;
    private EditText edtTxtEmail;
    private EditText edtTxtPassword;
    private TextView txtvwError;
    private TextView txtvwSuccessSignUp;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);
        edtTxtUsername = (EditText)findViewById(R.id.edtTxtUsername);
        edtTxtEmail=(EditText)findViewById(R.id.edtTxtEmail);
        edtTxtPassword=(EditText)findViewById(R.id.edtTxtPassword);
        txtvwError=(TextView) findViewById(R.id.txtvwError);
        txtvwSuccessSignUp=(TextView) findViewById(R.id.txtvwSuccessSignUp);

    }
    public void btnSignUpToLogin(View view){
        Intent SignUp=new Intent(this, Login.class);
        if (edtTxtUsername.getText().length()==0 ||edtTxtEmail.getText().length()==0
                || edtTxtPassword.getText().length()==0)
        {
            txtvwError.setText("YOU MUST FILL IN ALL THE INFORMATION!!!");
        }
        else
        {

            txtvwSuccessSignUp.setText("YOU HAVE SUCCESFULLY SIGNED UP!!!!");
            startActivityForResult(SignUp, 0);

        }




    }

}
