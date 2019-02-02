package com.example.saransh.institute;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class waiting_user_list extends AppCompatActivity {
Datahelper obj=new Datahelper(this);
TextView t1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_waiting_user_list);
        t1=(TextView) findViewById(R.id.textView28);
        String s=obj.displusers();
        t1.setText(s);
    }
}
