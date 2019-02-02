package com.example.saransh.institute;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.*;
import android.view.View.OnClickListener;
import android.view.View;
import android.content.*;
public class HomePage extends AppCompatActivity implements OnClickListener {
   EditText t1,t2,t3,t4;
   TextView e1,e2;
   Button b1,b2;
   Intent myIntent;
   //Intent i =  new Intent();
   //String id=i.getStringExtra("sample");
   String id= UnivId.userId;
   Datahelper obj=new Datahelper(this);
   String Url="https://www.google.com/search?q=notes+photo&source=lnms&tbm=isch&sa=X&ved=0ahUKEwiVtt6G4eDfAhVEYo8KHWXlD7YQ_AUIDigB&biw=1518&bih=748#imgrc=daz2GX2t8OgP8M:&spf=1547038908082";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_page);
        User u1= new User();
        u1=obj.catchBatchCourse(id);
        e1=(TextView)findViewById(R.id.textView26);
        e2=(TextView)findViewById(R.id.textView27);
        b1=(Button)findViewById(R.id.button14);
        b2=(Button)findViewById(R.id.button28);
        e2.setText(u1.getCourse());
        e1.setText(u1.getBatch());
        b1.setOnClickListener(this);
        b2.setOnClickListener(this);
    }
    public void onClick(View v)
    {
        Button b=(Button)v;
        if(b.getText().toString().equals("Post A Query")) {
            myIntent = new Intent(HomePage.this, query.class);
            HomePage.this.startActivity(myIntent);
        }
        if(b.getText().toString().equals("Check Schedule"))
        {
            myIntent=new Intent(HomePage.this,Time_table.class);
            HomePage.this.startActivity(myIntent);
        }
    }
}
