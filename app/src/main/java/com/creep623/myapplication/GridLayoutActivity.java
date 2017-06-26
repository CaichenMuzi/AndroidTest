package com.creep623.myapplication;

import android.app.Activity;
import android.os.Bundle;
import android.os.StrictMode;
import android.view.Gravity;
import android.widget.Button;
import android.widget.GridLayout;

/**
 * Created by houjunchao on 2017/6/4.
 */

public class GridLayoutActivity extends Activity {

    GridLayout gridLayout;

    String[] chars = new String[]{
            "7", "8", "9", "/",
            "4", "5", "6", "✖️",
            "1", "2", "3", "-",
            ".", "0", "=", "+"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gridlayout);

        gridLayout = (GridLayout) findViewById(R.id.root_Grid);
        for (int i = 0; i < chars.length; i++) {
            Button button = new Button(this);
            button.setText(chars[i]);
            button.setTextSize(40);
            button.setPadding(5, 35, 5, 35);
            GridLayout.Spec rowSopc = GridLayout.spec(i / 4 + 2);
            GridLayout.Spec columnSpec = GridLayout.spec(i % 4);
            GridLayout.LayoutParams params = new GridLayout.LayoutParams(rowSopc, columnSpec);
            params.setGravity(Gravity.FILL);
            gridLayout.addView(button, params);
        }
    }
}
