package com.creep623.myapplication;

import android.app.Activity;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.widget.TextView;

import java.util.Timer;
import java.util.TimerTask;

/**
 * Created by houjunchao on 2017/6/4.
 */

public class FrameLayoutActivity extends Activity {

    private int currentColor = 0;
    final int[] colors = new int[]{
            R.color.color1,
            R.color.color2,
            R.color.color3,
            R.color.color4,
            R.color.color5,
            R.color.color6
    };

    final int[] names = new int[]{
            R.id.view1,
            R.id.view2,
            R.id.view3,
            R.id.view4,
            R.id.view5,
            R.id.view6
    };

    TextView[] views = new TextView[names.length];
    Handler handler = new Handler() {
        @Override
        public void handleMessage(Message msg) {
            if (msg.what == 0x123) {
                for (int i = 0; i < names.length; i++) {
                    views[i].setBackgroundResource(colors[(i + currentColor) % names.length]);
                }
                currentColor++;
            }
            super.handleMessage(msg);
        }
    };

    @Override
    protected void onCreate(Bundle savedIntanceState) {
        super.onCreate(savedIntanceState);
        setContentView(R.layout.activity_framelayout);

        for (int i = 0; i < names.length; i++) {
            views[i] = (TextView) findViewById(names[i]);
        }

        new Timer().schedule(new TimerTask() {
            @Override
            public void run() {
                handler.sendEmptyMessage(0x123);
            }
        }, 0, 250);
    }
}
