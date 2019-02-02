package com.example.saransh.institute;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.*;
import android.view.View.OnClickListener;
public class query extends AppCompatActivity implements OnClickListener {
EditText t1;
getset_query u1 = new getset_query();
Button b1,b2;
Datahelper obj=new Datahelper(this);
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_query);
        t1=(EditText)findViewById(R.id.editText7);
        b1=(Button)findViewById(R.id.button4);
        b2=(Button)findViewById(R.id.button15);
       b1.setOnClickListener(this);
       b2.setOnClickListener(this);
    }
    public void onClick(View v)
    {
        Button b=(Button)v;
        if(b.getText().toString().equals("Submit")) {
            u1.setQuestion(t1.getText().toString());
            obj.queryInsert(u1);
        }
        else
        {
            Intent myIntent = new Intent(query.this,solution.class);
            query.this.startActivity(myIntent);
        }
    }
}
