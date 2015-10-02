package com.abhilash.abhi.helloworldone;

import android.app.Activity;
import android.os.Bundle;
import android.widget.RelativeLayout;
import android.widget.RelativeLayout.LayoutParams;
import android.widget.TextView;

public class HelloWorldOne extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_hello_world_one);
        RelativeLayout rlayout = new RelativeLayout(this);
        TextView tview = new TextView(this);
        tview.setText("Hello World One!!!");
        RelativeLayout.LayoutParams params = new RelativeLayout.LayoutParams(
                LayoutParams.WRAP_CONTENT, LayoutParams.WRAP_CONTENT);
        params.addRule(RelativeLayout.ALIGN_PARENT_TOP);
        rlayout.addView(tview,params);
        setContentView(rlayout);
    }
}
