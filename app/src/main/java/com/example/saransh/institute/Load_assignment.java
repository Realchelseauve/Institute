package com.example.saransh.institute;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.webkit.WebView;

public class Load_assignment extends AppCompatActivity {
WebView w1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_load_assignment);
        w1=(WebView)findViewById(R.id.web);
        try {
            w1.getSettings().setJavaScriptEnabled(true);
            w1.loadUrl("https://www.cs.mcgill.ca/~cs202/2011-09/assignments/assignment1/a1--specification.pdf");
        }
        catch (Exception ex)
        {
            Log.i("Error",ex.getMessage());
        }
    }
}
