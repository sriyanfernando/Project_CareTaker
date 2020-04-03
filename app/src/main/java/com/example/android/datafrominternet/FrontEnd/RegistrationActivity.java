package com.example.android.datafrominternet.FrontEnd;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.TextUtils;
import android.util.Log;
import android.util.Patterns;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import com.example.android.datafrominternet.FrontEnd.validation.CheckValidation;

import com.example.android.datafrominternet.R;

public class RegistrationActivity  extends AppCompatActivity {

    private static final String TAG = "test";
    Button register;
    EditText phonenumber;
    EditText password;

    CheckValidation checkValidation;

    public CheckValidation getInstance()
    {
        checkValidation = new CheckValidation();
        return checkValidation;
    }


    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        register = findViewById(R.id.btnregister);
        phonenumber = findViewById(R.id.txtphone);
        password = findViewById(R.id.txtpassword);

        register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                  checkDataValidation();
            }
        });
    }

    /**
     * Input Data Validation
     */
    private void checkDataValidation()
    {

        if(getInstance().isTelephoneNumber(phonenumber) == false)
        {
            phonenumber.setError("Correct Phone Number is required");
        }

        if(getInstance().isTelephoneNumberLimitCheck(phonenumber) == false)
        {
            phonenumber.setError("Phone number  can not more than 10 ");
        }

        if (getInstance().isEmpty(password))
        {
            password.setError("Password is required");
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
