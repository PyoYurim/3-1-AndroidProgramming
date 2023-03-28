package com.inhatc.android_tablayout;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TabHost;

public class MainActivity extends AppCompatActivity {
    TabHost myTabHost = null;  //TabHost Object
    TabHost.TabSpec myTabSpec; //TabSpec Object

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        myTabHost = (TabHost)findViewById(R.id.tabhost);
        myTabHost.setup();          //Not use TabActivity Call

        //Add Tab
        myTabSpec = myTabHost.newTabSpec("Artists")
                .setIndicator("Artists")            //Tab Subject
                .setContent(R.id.tab1);             //Tab Content
        myTabHost.addTab(myTabSpec);

        myTabSpec = myTabHost.newTabSpec("Albums")
                .setIndicator("Albums")             //Tab Subject
                .setContent(R.id.tab2);             //Tab Content
        myTabHost.addTab(myTabSpec);

        myTabSpec = myTabHost.newTabSpec("Songs")
                .setIndicator("Songs")              //Tab Subject
                .setContent(R.id.tab3);             //Tab Content
        myTabHost.addTab(myTabSpec);

        myTabHost.setCurrentTab(0);                 //Setting First Tab
    }
}