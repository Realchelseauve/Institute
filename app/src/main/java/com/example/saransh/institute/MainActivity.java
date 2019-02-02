package com.example.saransh.institute;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.content.Intent;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements OnClickListener {
    EditText t1,t2;
    Button b1,b2;
    Intent myIntent;
    Datahelper obj=new Datahelper(MainActivity.this);
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        t1=findViewById(R.id.editText);
        t2=findViewById(R.id.editText2);
        b1=findViewById(R.id.button);
        b2=findViewById(R.id.button2);
        b1.setOnClickListener(this);
        b2.setOnClickListener(this);
    }
    public void onClick(View v)
    {
        Button b=(Button) v;
        if(b.getText().toString().equals("Sign In"))
        {
            if(t1.getText().toString().equals("admin")&&t2.getText().toString().equals("admin"))
            {
              myIntent=new Intent(MainActivity.this,adminlogin.class);
              MainActivity.this.startActivity(myIntent);
            }
            else
            {
              Boolean check =  obj.loginUser(t1.getText().toString(),t2.getText().toString());
              Boolean nec = obj.checkUser(t1.getText().toString(),t2.getText().toString());
              Boolean susp =obj.suspended(t1.getText().toString(),t2.getText().toString());
              if(check)
              {
                 // HomePage h1 =new HomePage(t1.getText().toString());
                  myIntent=new Intent(MainActivity.this,HomePage.class);
                 // myIntent.putExtra("sample",t1.getText().toString());
                  UnivId.userId=t1.getText().toString();
                  MainActivity.this.startActivity(myIntent);
              }
              else
                  if(nec)
              {
                  Toast.makeText(MainActivity.this,"Still not activated",Toast.LENGTH_LONG).show();
              }
              else
                  if(susp)
                  {
                      Toast.makeText(MainActivity.this,"Account Suspended Contact Admin",Toast.LENGTH_LONG).show();
                  }
                  else
                  {
                      Toast.makeText(MainActivity.this,"Incorrect Entries",Toast.LENGTH_LONG).show();
                  }
            }
        }
        else
        if(b.getText().toString().equals("Sign Up"))
        {
         myIntent=new Intent(MainActivity.this,signup.class);
         MainActivity.this.startActivity(myIntent);
        }
    }
}
