package com.example.android.datafrominternet.FrontEnd.validation;

import android.text.TextUtils;
import android.util.Patterns;
import android.widget.EditText;

public class CheckValidation {


    public boolean isEmpty(EditText text) {
        CharSequence str = text.getText().toString();
        return TextUtils.isEmpty(str);
    }

     public boolean isTelephoneNumber(EditText text) {
        CharSequence phone = text.getText().toString();
        return (!TextUtils.isEmpty(phone) && Patterns.PHONE.matcher(phone).matches());
    }


    public boolean isTelephoneNumberLimitCheck(EditText text)
    {
        String phone = text.getText().toString();
        char[] chararray = phone.toCharArray();
        int count =0;
        for(char c : chararray)
        {
            count +=1;

        }

        if(count > 10) return false;
        else return  true;
    }

}
