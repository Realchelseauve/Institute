package com.example.saransh.institute;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.*;
import android.view.View.OnClickListener;
import android.view.View;
public class suspend_record extends AppCompatActivity implements OnClickListener {
Datahelper obj=new Datahelper(suspend_record.this);
EditText t1,t2;
Button b1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_suspend_record);
        b1=(Button)findViewById(R.id.button20);
        b1.setOnClickListener(this);
    }
    public void onClick(View v)
    {
        Button b=(Button)v;
        if(b.getText().toString().equals("Submit")) {
            t1 = (EditText) findViewById(R.id.editText17);
            obj.suspendEntries(t1.getText().toString());
        }
    }
}
