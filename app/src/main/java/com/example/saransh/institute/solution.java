package com.example.saransh.institute;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class solution extends AppCompatActivity {
Datahelper obj = new Datahelper(this);
TextView t1,t2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_solution);
       String sol = obj.displayres(UnivId.userId);
       t2=findViewById(R.id.textView29);
       t2.setText(sol);
    }
}
