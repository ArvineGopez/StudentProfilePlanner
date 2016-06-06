package com.example.pbuskell.studentprofileplanner;

import android.content.ContentValues;
import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteOpenHelper;
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
        edtTxtUsername = (EditText) findViewById(R.id.edtTxtUsername);
        edtTxtEmail = (EditText) findViewById(R.id.edtTxtEmail);
        edtTxtPassword = (EditText) findViewById(R.id.edtTxtPassword);
        txtvwError = (TextView) findViewById(R.id.txtvwError);
        txtvwSuccessSignUp = (TextView) findViewById(R.id.txtvwSuccessSignUp);

    }

    public void insertData(View view) {
        String studentUserName;
        String studentEmail;
        String studentPassword;
        SQLiteDatabase db =null;
        ContentValues studentValues = new ContentValues();
        SQLiteOpenHelper StudentDataBase = new StudentDataBase(this, null, null, 0);
        try {
            db = StudentDataBase.getWritableDatabase();

            Intent SignUp = new Intent(this, Login.class);
            if (edtTxtUsername.getText().length() == 0 || edtTxtEmail.getText().length() == 0
                    || edtTxtPassword.getText().length() == 0) {
                txtvwError.setText("YOU MUST FILL IN ALL THE INFORMATION!!!");
            } else {

                studentEmail=edtTxtEmail.getText().toString();
                studentUserName=edtTxtUsername.getText().toString();
                studentPassword=edtTxtPassword.getText().toString();
                studentValues.put("USERNAME", studentUserName);
                studentValues.put("EMAIL", studentEmail);
                studentValues.put("PASSWORD", studentPassword);
                /**
                 * 1.Set each variable equal to the values from the EditTexts
                 * 2. put each value into the ContentValues variable
                 * 3. Call the StudentDataBase insertElement method
                 * 4.Display that the element has been added successfully
                 */


                txtvwSuccessSignUp.setText("YOU HAVE SUCCESFULLY SIGNED UP!!!!");
                startActivityForResult(SignUp, 0);

            }
            db.close();
        } catch (SQLiteException e) {
            txtvwError.setText("The database was not found");

        }

    }
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        edtTxtEmail.setText("");
        edtTxtUsername.setText("");
        edtTxtPassword.setText("");

    }
}
