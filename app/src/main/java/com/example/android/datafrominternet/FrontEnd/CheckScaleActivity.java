package com.example.android.datafrominternet.FrontEnd;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;
import android.widget.Button;

import com.example.android.datafrominternet.R;

public class CheckScaleActivity extends Activity {

    Button button_scale_result;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_checkscale);

        button_scale_result=(Button)findViewById(R.id.result);
        button_scale_result.setText("View My Score");
        button_scale_result.setTextColor(getApplication().getResources().getColor(R.color.colorWhite));

        final Intent intent= new Intent();
        intent.setClass(CheckScaleActivity.this, ResultActivity.class);

        button_scale_result.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }


                startActivity(intent);

            }
        });
     }
}
