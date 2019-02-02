package com.example.saransh.institute;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

public class new_user_list extends AppCompatActivity {
    Datahelper obj= new Datahelper(this);
    TextView t1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new_user_list);
        t1=(TextView) findViewById(R.id.textView20);
        String s = obj.showEntries();
        t1.setText(s);
    }
}
