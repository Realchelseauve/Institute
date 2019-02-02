package com.example.saransh.institute;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.*;
import android.view.View.OnClickListener;
import android.view.View;
public class Response extends AppCompatActivity implements OnClickListener {
    Datahelper obj = new Datahelper(this);
    TextView t1;
    EditText e1, e2;
    Button b1, b2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_response);
        String Result = obj.dispQuery();
        t1 = findViewById(R.id.textView25);
        t1.setText(Result);
        e1 = findViewById(R.id.editText19);
        e2 = findViewById(R.id.editText10);
        b2 = findViewById(R.id.button8);
        // b1=findViewById(R.id.button14);
        //b1.setOnClickListener(this);
        b2.setOnClickListener(this);
    }

    public void onClick(View v) {
        Button b = (Button) v;
        obj.changeResponse(e1.getText().toString(),e2.getText().toString());
        String Result = obj.dispQuery();
        t1.setText(Result);
        }
}
