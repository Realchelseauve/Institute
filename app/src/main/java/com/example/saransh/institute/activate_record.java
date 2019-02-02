package com.example.saransh.institute;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.view.View.OnClickListener;
import android.widget.Toast;

public class activate_record extends AppCompatActivity implements OnClickListener {
EditText t1,t2;
Button b1;
String p1;
Datahelper obj=new Datahelper(this);
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_activate_record);
        t1=(EditText)findViewById(R.id.editText15);
        t2=(EditText)findViewById(R.id.editText16);
        b1=(Button)findViewById(R.id.button19);
        if(t1.getText().toString().equals(t2.getText().toString()))
        {
            p1=t1.getText().toString();
            b1.setOnClickListener(this);
        }
        else
        {
            Toast.makeText(this,"Check the Values",Toast.LENGTH_LONG).show();
        }
    }
    public void onClick(View v)
    {
       Button b=(Button) v;
       if(b.getText().toString().equals("Activate"))
       {
           obj.activateRecord(t1.getText().toString());
       }
    }
}
