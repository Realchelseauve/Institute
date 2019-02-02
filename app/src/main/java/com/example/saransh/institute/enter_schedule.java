package com.example.saransh.institute;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.view.View.OnClickListener;
public class enter_schedule extends AppCompatActivity implements OnClickListener {
EditText t1,t2,t3,t4,t5;
Button b1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_enter_schedule);
        t1=(EditText)findViewById(R.id.editText26);
        t2=(EditText)findViewById(R.id.editText25);
        t3=(EditText)findViewById(R.id.editText24);
        t4=(EditText)findViewById(R.id.editText23);
        t5=(EditText)findViewById(R.id.editText22);
        b1=(Button)findViewById(R.id.button24);
        b1.setOnClickListener(this);
    }
    public void onClick(View v)
    {
        Button b=(Button)v;
        if(b.getText().toString().equals("SUBMIT"))
        {

        }
    }
}
