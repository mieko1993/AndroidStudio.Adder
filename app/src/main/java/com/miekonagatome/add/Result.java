package com.miekonagatome.add;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.widget.TextView;


public class Result extends ActionBarActivity {

    TextView result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

        //Call the info of main activity
        Bundle b= this.getIntent().getExtras();
        if (b!=null){
            int number1=b.getInt("number1");
            int number2=b.getInt("number2");
            int suma=number1+number2;
            result=(TextView) findViewById(R.id.textView_result);
            result.setText(String.valueOf(suma));
        }
    }
//when return button is clicked
    public void returnOnClick(View view){
        super.onBackPressed();
    }
}
