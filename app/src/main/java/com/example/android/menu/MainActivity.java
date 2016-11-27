package com.example.android.menu;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void printToLogs(View view) {
       String text;
        CharSequence text1;
        TextView textView;
        TextView textView2;
        TextView textView3;
        textView = (TextView) findViewById(R.id.menu_item_1);
        text1 = textView.getText();
        text = text1.toString();
        CharSequence text2;
        textView2 = (TextView) findViewById(R.id.menu_item_2);
        text2 = textView2.getText();
        text = text + " " + text2.toString();
        CharSequence text3;
        textView3 = (TextView) findViewById(R.id.menu_item_3);
        text3 = textView3.getText();
        text = text + " " + text3.toString();
        Log.i("Menu.java",text);



    }
}