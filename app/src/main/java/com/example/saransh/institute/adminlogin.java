package com.example.saransh.institute;

import android.provider.ContactsContract;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.content.Intent;
public class adminlogin extends AppCompatActivity implements OnClickListener{
Button b,b1,b2,b3,b4,b5,b6,b7;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_adminlogin);
        b=findViewById(R.id.button7);
        b1=findViewById(R.id.button10);
        b2=findViewById(R.id.button12);
        b3=findViewById(R.id.button17);
        b4=findViewById(R.id.button6);
        b5=findViewById(R.id.button5);
        b6=findViewById(R.id.button18);
        b7=findViewById(R.id.button25);
        b.setOnClickListener(this);
        b1.setOnClickListener(this);
        b2.setOnClickListener(this);
        b3.setOnClickListener(this);
        b4.setOnClickListener(this);
        b5.setOnClickListener(this);
        b6.setOnClickListener(this);
        b7.setOnClickListener(this);
    }
    public void onClick(View v)
    {
        Button b=(Button)v;
        if(b.getText().toString().equals("Set Schedule"))
        {
            Intent myIntent=new Intent(adminlogin.this,set_schedule.class);
            adminlogin.this.startActivity(myIntent);
        }
        if(b.getText().toString().equals("Registered User List")) {

           Intent myIntent=new Intent(adminlogin.this,new_user_list.class);
           adminlogin.this.startActivity(myIntent);
        }
        if(b.getText().toString().equals("Query List"))
        {
            Intent myIntent= new Intent(adminlogin.this,Response.class);
            adminlogin.this.startActivity(myIntent);
        }
        if(b.getText().toString().equals("New User List"))
        {
            Intent myIntent=new Intent(adminlogin.this,waiting_user_list.class);
            adminlogin.this.startActivity(myIntent);
        }
        if(b.getText().toString().equals("CHANGE"))
        {
            Intent myIntent=new Intent(adminlogin.this,New_Password.class);
            adminlogin.this.startActivity(myIntent);
        }
        if(b.getText().toString().equals("Remove"))
        {
            Intent myIntent=new Intent(adminlogin.this,remove_record.class);
            adminlogin.this.startActivity(myIntent);
        }
        if(b.getText().toString().equals("Activate"))
        {
            Intent myIntent=new Intent(adminlogin.this,activate_record.class);
            adminlogin.this.startActivity(myIntent);
        }
        if(b.getText().toString().equals("Suspend"))
        {
           Intent myIntent=new Intent(adminlogin.this,suspend_record.class);
            adminlogin.this.startActivity(myIntent);
        }
    }
}
