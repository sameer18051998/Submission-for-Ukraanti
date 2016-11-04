package com.example.sameer18051998.merger_ws;

/**
 * Created by sameer18051998 on 04/11/16.
 */

import android.os.Bundle;
import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Calculator extends AppCompatActivity {

    Button b;
    EditText e1,e2;
    int num1,num2,result;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.calc_xml);

        b=(Button)findViewById(R.id.button1);
        e1=(EditText)findViewById(R.id.fno);
        e2=(EditText)findViewById(R.id.sno);


        b.setOnClickListener(new OnClickListener()
        {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                try{
                num1=Integer.parseInt((e1.getText().toString()));
                num2=Integer.parseInt((e2.getText().toString()));
                result=num1+num2;

                Toast.makeText(getApplicationContext(), "Result is "+result, Toast.LENGTH_LONG).show();
            }
                catch (Exception e)
                {
                    Toast.makeText(getApplicationContext(), "Error", Toast.LENGTH_LONG).show();

                }
        }
    });




}}



