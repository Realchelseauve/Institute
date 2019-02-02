package com.example.saransh.institute;

import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.Button;
import android.view.View;
import android.view.View.OnClickListener;
import android.content.*;
public class signup extends AppCompatActivity implements OnClickListener {
    EditText t1,t2,t3,t4,t5,t6;
    Button b1,b2;
    User u1;
    Intent myIntent;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.signup);
        t1=(EditText)findViewById(R.id.editText3);
        t2=(EditText)findViewById(R.id.editText4);
        t3=(EditText)findViewById(R.id.editText5);
        t4=(EditText)findViewById(R.id.editText6);
        t5=(EditText)findViewById(R.id.editText8) ;
        t6=(EditText)findViewById(R.id.editText9);
        b1=(Button)findViewById(R.id.button3);
        b2=(Button)findViewById(R.id.button9);
        b1.setOnClickListener(this);
        b2.setOnClickListener(this);

     //   obj.showEntries();
    }
    public void onClick(View v)
    {
        Button b=(Button)v;
        if(b.getText().toString().equals("Submit"))
        {
            String s1=t1.getText().toString();
            String s2=t2.getText().toString();
            String s3=t3.getText().toString();
            String s4=t4.getText().toString();
            String s5=t5.getText().toString();
            String s6=t6.getText().toString();
            u1= new User();
            u1.setName(s1);
            u1.setBatch(s2);
            u1.setId(s3);
            u1.setCourse(s4);
            u1.setUsername(s5);
            u1.setPassword(s6);
            Datahelper obj= new Datahelper(this);
            obj.signUp(u1);
        }
        else
            if(b.getText().toString().equals("Back"))
            {
                myIntent=new Intent(signup.this,MainActivity.class);
                signup.this.startActivity(myIntent);

            }
    }
}
