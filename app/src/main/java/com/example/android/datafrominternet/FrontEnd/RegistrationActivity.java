package com.example.android.datafrominternet.FrontEnd;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;


import com.example.android.datafrominternet.FrontEnd.validation.CheckValidation;

import com.example.android.datafrominternet.R;

import java.util.HashMap;

public class RegistrationActivity  extends AppCompatActivity {

    private static final String TAG = "test";
    Button register;
    EditText phonenumber;
    EditText password;
    EditText name;
    HashMap<String, String> mapList = new HashMap<String, String>();

    CheckValidation checkValidation;

    public CheckValidation getInstance()
    {
        checkValidation = new CheckValidation();
        return checkValidation;
    }

    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        name = findViewById(R.id.txtname);
        phonenumber = findViewById(R.id.txtphone);
        password = findViewById(R.id.txtpassword);
        register = findViewById(R.id.btnlogin);

        register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                boolean result = checkDataValidation();
                if(result)
                {
                    Intent intent = new Intent(RegistrationActivity.this,LoginActivity.class);
                    startActivity(intent);
                }
            }
        });
    }

    /**
     * Input Data Validation
     */
    private boolean checkDataValidation()
    {
        if (getInstance().isEmpty(name))
        {
            name.setError("Name is required");
            return false;
        }

        if(getInstance().isTelephoneNumber(phonenumber) == false)
        {
            phonenumber.setError("Phone Number is required");
            return false;
        }

        if(getInstance().isTelephoneNumberLimitCheck(phonenumber) == false)
        {
            phonenumber.setError("Phone number can not more than 10 ");
            return false;
        }

        if (getInstance().isEmpty(password))
        {
            password.setError("Password is required");
            return false;
        }
        else {
            return true;
        }

    }

    @Override
    protected void onStart()
    {
        super.onStart();
        Log.i(TAG,"onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i(TAG,"onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i(TAG,"onPause");

    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i(TAG,"onStop");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.i(TAG,"onRestart");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i(TAG,"onDestroy");
    }

    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        Log.i(TAG,"onRestoreInstanceState");
    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        Log.i(TAG,"onSaveInstanceState");
    }


}
