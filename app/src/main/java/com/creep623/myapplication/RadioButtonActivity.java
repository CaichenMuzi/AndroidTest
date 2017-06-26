package com.creep623.myapplication;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.IdRes;
import android.widget.RadioGroup;
import android.widget.TextView;

/**
 * Created by houjunchao on 2017/6/25.
 */

public class RadioButtonActivity extends Activity {

    RadioGroup rg;
    TextView show;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_radiobutton);

        rg = (RadioGroup) findViewById(R.id.rg);
        show = (TextView) findViewById(R.id.show);
        rg.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, @IdRes int checkedId) {
                String tip = checkedId == R.id.male ? "您的性别是男人" : "您的性别是女人";
                show.setText(tip);
            }
        });
    }
}
