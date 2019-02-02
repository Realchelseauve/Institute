package com.example.saransh.institute;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class New_Password extends AppCompatActivity {
    EditText t1,t2;
    Button b1;
    Datahelper obj=new Datahelper(this);
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new__password);
        t1=(EditText)findViewById(R.id.editText11);
        t2=(EditText)findViewById(R.id.editText12);
        b1=(Button)findViewById(R.id.button11);
    }
    public void Reset(View v)
    {
        String Id=t1.getText().toString();
        String Password=t2.getText().toString();
        obj.changePassword(Id,Password);
        Toast.makeText(New_Password.this,"Password Changed",Toast.LENGTH_LONG).show();
    }
}
