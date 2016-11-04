package com.example.sameer18051998.merger_ws;

import android.app.PendingIntent;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.telephony.SmsManager;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


        import android.app.PendingIntent;
        import android.content.Intent;
        import android.support.v7.app.AppCompatActivity;
        import android.os.Bundle;
        import android.telephony.SmsManager;
        import android.view.View;
        import android.widget.Button;
        import android.widget.EditText;
        import android.util.Log;
        import android.widget.Toast;


public class Message_2 extends MainActivity {

    Button b;
    EditText e1,e2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.message_layout);
        b=(Button)findViewById(R.id.button);
        e1=(EditText)findViewById(R.id.editText);
        e2=(EditText)findViewById(R.id.editText2);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sendMessage();
            }
            protected void sendMessage()
            {
                Log.i("Send Msg","");
                String m1=e1.getText().toString();
                String m2=e2.getText().toString();
                try {
                    Intent i=new Intent();
                    PendingIntent pi = PendingIntent.getActivity(getApplicationContext(),0,i,0);
                    SmsManager sM=SmsManager.getDefault();
                    sM.sendTextMessage(m1,null,m2,pi,null);
                    Toast.makeText(getApplicationContext(),"Message {/SMS} Sent",Toast.LENGTH_LONG).show();
                }

                catch (Exception e){
                    Toast.makeText(getApplicationContext(),"Message {/SMS} FAILED",Toast.LENGTH_LONG).show();
                    e.printStackTrace();

                }


            }});

    }
}
