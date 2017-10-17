package com.example.hywoman.a2a216230013;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TabHost;
import android.widget.TextView;

import static com.example.hywoman.a2a216230013.R.id.tabhost1;
import static com.example.hywoman.a2a216230013.R.layout.fragment1;

public class MainActivity extends AppCompatActivity {
    TabHost tabHost;
    TextView textView2, textView3, textView4, textView5, textView6;
    FrameLayout frameLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tabHost = (TabHost) findViewById(R.id.tabhost1);
        tabHost.setup();

        TabHost.TabSpec 소개1 = tabHost.newTabSpec("1").setContent(R.id.소개1).setIndicator("소개1");
        TabHost.TabSpec 소개2 = tabHost.newTabSpec("2").setContent(R.id.소개2).setIndicator("소개2");

        tabHost.addTab(소개1);
        tabHost.addTab(소개2);

        init();
    }

    void init() {

        textView2 = (TextView) findViewById(R.id.textView2);
        textView3 = (TextView) findViewById(R.id.textView3);
        textView4 = (TextView) findViewById(R.id.textView4);
        textView5 = (TextView) findViewById(R.id.textView5);
        textView6 = (TextView) findViewById(R.id.textView6);

        frameLayout = (FrameLayout) findViewById(android.R.id.tabcontent);

    }
        public void nextScene (View v){
        Intent i = new Intent(this, Fragment1.class);
        startActivity(i);
    }


}
