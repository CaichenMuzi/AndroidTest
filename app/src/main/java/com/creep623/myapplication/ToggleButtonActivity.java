package com.creep623.myapplication;

import android.app.Activity;
import android.os.Bundle;
import android.os.SystemClock;
import android.view.View;
import android.widget.Button;
import android.widget.Chronometer;
import android.widget.CompoundButton;
import android.widget.LinearLayout;
import android.widget.Switch;
import android.widget.ToggleButton;

/**
 * Created by houjunchao on 2017/6/25.
 */

public class ToggleButtonActivity extends Activity {

    ToggleButton toggle;
    Switch switcher;

    Chronometer ch;
    Button start;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_togglebutton);

        toggle = (ToggleButton) findViewById(R.id.toggle);
        switcher = (Switch) findViewById(R.id.switcher);
        final LinearLayout test = (LinearLayout) findViewById(R.id.test);

        CompoundButton.OnCheckedChangeListener listener = new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    test.setOrientation(LinearLayout.VERTICAL);
                    toggle.setChecked(true);
                    switcher.setChecked(true);
                } else {
                    test.setOrientation(LinearLayout.HORIZONTAL);
                    toggle.setChecked(false);
                    switcher.setChecked(false);
                }
            }
        };

        toggle.setOnCheckedChangeListener(listener);
        switcher.setOnCheckedChangeListener(listener);

        ch = (Chronometer) findViewById(R.id.chronometer);
        start = (Button) findViewById(R.id.start);
        start.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ch.setBase(SystemClock.elapsedRealtime());
                ch.start();
                start.setEnabled(false);
            }
        });

        ch.setOnChronometerTickListener(new Chronometer.OnChronometerTickListener() {
            @Override
            public void onChronometerTick(Chronometer chronometer) {
                if (SystemClock.elapsedRealtime() - ch.getBase() > 20 * 1000) {
                    ch.stop();
                    start.setEnabled(true);
                }
            }
        });
    }
}
