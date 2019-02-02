package com.example.saransh.institute;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.view.View.OnClickListener;
import android.view.View;
import android.content.Intent;

import java.sql.Time;

public class Time_table extends AppCompatActivity implements OnClickListener{
Button b1,b2,b3,b4,b5;
User u1=new User();
String result="";
Datahelper obj=new Datahelper(this);
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_time_table);
        u1=obj.catchBatch(UnivId.userId);
        b1=(Button)findViewById(R.id.button16);
        b2=(Button)findViewById(R.id.button21);
        b3=(Button)findViewById(R.id.button22);
        b4=(Button)findViewById(R.id.button23);
        b5=(Button)findViewById(R.id.button27);
        b1.setOnClickListener(this);
        b2.setOnClickListener(this);
        b3.setOnClickListener(this);
        b4.setOnClickListener(this);
        b5.setOnClickListener(this);
    }
    public void onClick(View v)
    {
        Button b = (Button)v;
       String st = obj.displayTime(u1.getBatch(),b.getText().toString());
       UnivId.time=st;
       Intent myIntent=new Intent(Time_table.this,Schedule.class);
       Time_table.this.startActivity(myIntent);
    }
}
