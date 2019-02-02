package com.example.saransh.institute;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.*;

public class set_schedule extends AppCompatActivity implements View.OnClickListener {
EditText t1,t2,t3,t4,t5;
Button b;
pojo_schedule p1 = new pojo_schedule();
Datahelper obj=new Datahelper(this);
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_set_schedule);
        t1=(EditText)findViewById(R.id.editText27);
        t2=(EditText)findViewById(R.id.editText28);
        t3=(EditText)findViewById(R.id.editText29);
        t4=(EditText)findViewById(R.id.editText30);
        t5=(EditText)findViewById(R.id.editText31);
        b=(Button)findViewById(R.id.button26);
        b.setOnClickListener(this);
    }
    public void onClick(View v)
    {
        p1.setBatch(t1.getText().toString());
        p1.setDay(t2.getText().toString());
        p1.setStart_date(t3.getText().toString());
        p1.setEnd_date(t4.getText().toString());
        p1.setTime(t5.getText().toString());
        obj.schedule_insert(p1);
    }
}
