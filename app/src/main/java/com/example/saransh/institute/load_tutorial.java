package com.example.saransh.institute;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

public class load_tutorial extends AppCompatActivity {
WebView w1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_load_tutorial);
        w1=(WebView)findViewById(R.id.web);
        w1.getSettings().setJavaScriptEnabled(true);
        w1.loadUrl("https://www.youtube.com/watch?v=uWYPVz_i7W4&vl=en");
    }
}
