package com.example.android.datafrominternet.BackEnd.localstorage;

import android.widget.EditText;

import java.util.ArrayList;

public class LocalData
{

    ArrayList<String> phonenumbers = new ArrayList<>();
    ArrayList<String> passwords = new ArrayList<>();

    public void StoreData(String text1 , String text2) {

        phonenumbers.add(text1);
        passwords.add(text2);
    }

    public String GetPhoneData()
    {
        return phonenumbers.get(0);
    }

    public String GetPasswordData()
    {
        return passwords.get(0);
    }
}
