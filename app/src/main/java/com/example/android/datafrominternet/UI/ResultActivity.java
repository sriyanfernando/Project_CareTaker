package com.example.android.datafrominternet.UI;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import com.example.android.datafrominternet.R;

import java.util.Random;

public class ResultActivity extends AppCompatActivity {

    TextView textView_result;
    TextView textView_score;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resultscale);

        textView_result= (TextView)findViewById(R.id.textresult);
        textView_score= (TextView)findViewById(R.id.scoreresult);

        Random rnd = new Random();
        int x=rnd.nextInt(4);
        switch(x) {
            case 0:
                textView_score.setText("3");
                textView_result.setText("Absence Of Depression");
                break;
            case 1:
                textView_score.setText("5");
                textView_result.setText("Mild Depression");
                break;
            case 2:
                textView_score.setText("7");
                textView_result.setText("Moderate Depression");
                break;
            case 3:
                textView_score.setText("12");
                textView_result.setText("Severe Depression");
                break;

        }
     }
}
