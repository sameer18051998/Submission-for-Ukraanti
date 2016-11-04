package com.example.sameer18051998.merger_ws;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Menu;
import android.widget.Button;
import android.widget.ImageButton;

import com.example.sameer18051998.merger_ws.Cam_3;

public class MainActivity extends AppCompatActivity {

    ImageButton b1,b2,b3,b4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b1=(ImageButton)findViewById(R.id.call_button);
        b2=(ImageButton)findViewById(R.id.camera_button);
        b3=(ImageButton)findViewById(R.id.message_button);
        b4=(ImageButton)findViewById(R.id.calc_button);


        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {
                Intent i1=new Intent(MainActivity.this,Calling.class);
                startActivity(i1);

            }
        });

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {
                Intent i2=new Intent(MainActivity.this,Cam_3.class);
                startActivity(i2);
            }
        });

        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {
                Intent i3=new Intent(MainActivity.this,Message_2.class);
                startActivity(i3);
            }
        });

        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {
                Intent i4=new Intent(MainActivity.this,Calculator.class);
                startActivity(i4);
            }
        });


    }

   /* @Override

    public boolean onCreateOptionsMenu(Menu menu)
    {
        super.onCreateOptionsMenu(menu);
        getMenuInflater().inflate(R.menu.activity_main,menu);
        return true;
    }*/
}
