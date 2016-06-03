package com.example.pbuskell.studentprofileplanner;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }

    public void loginOnClick(View view) {
        Intent clickedLogin = new Intent(this, Login.class);
        startActivityForResult(clickedLogin, 0);
    }
    public void signUpOnClick(View view){
        Intent clickedSignUp=new Intent(this, SignUp.class);
        startActivityForResult(clickedSignUp,0);
    }

    //http://www.ideaswatch.com/startup-idea/student-profile-and-planner-mobile-app
}
