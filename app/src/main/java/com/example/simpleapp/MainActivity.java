package com.example.simpleapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button signupbtn,exitbtn;
    EditText fname,lname,emailid,pw,confirmpw;

    RadioGroup rg;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

       init();
       setListeners();
    }
    private void init()
    {
        signupbtn = findViewById(R.id.signupbtn);
        exitbtn = findViewById(R.id.exitbtn);
        fname = findViewById(R.id.firstname);
        lname = findViewById(R.id.lastname);
        emailid = findViewById(R.id.email);
        pw = findViewById(R.id.password);
        confirmpw = findViewById(R.id.confirmpassword);
        rg = findViewById(R.id.radioGroup);

    }
    private void setListeners()
    {
        signupbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String firstName = fname.getText().toString().trim();
                String lastName = lname.getText().toString().trim();
                String email = emailid.getText().toString().trim();
                String password = pw.getText().toString().trim();
                String confirmPassword = confirmpw.getText().toString().trim();

                if (TextUtils.isEmpty(firstName) || TextUtils.isEmpty(lastName) || TextUtils.isEmpty(email) || TextUtils.isEmpty(password) || TextUtils.isEmpty(confirmPassword)) {
                    Toast.makeText(MainActivity.this, "Fill all fields!", Toast.LENGTH_SHORT).show();
                    return;
                } else if (!password.equals(confirmPassword)) {
                    Toast.makeText(MainActivity.this, "Passwords don't match!", Toast.LENGTH_SHORT).show();
                    return;
                }


                    int selectedRadioButtonId = rg.getCheckedRadioButtonId();
                    if (selectedRadioButtonId == -1) {
                        Toast.makeText(MainActivity.this, "Select gender!", Toast.LENGTH_SHORT).show();
                        return;
                    }



                Intent intent = new Intent(MainActivity.this, homeActivity.class);
                startActivity(intent);


            }
        });

        exitbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish(); // Close the MainActivity and exit the app
            }
        });
    }







}