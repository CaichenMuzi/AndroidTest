package com.creep623.myapplication;

import android.content.Intent;
import android.support.constraint.ConstraintLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ConstraintLayout layout = (ConstraintLayout) findViewById(R.id.root);
        DrawView drawView = new DrawView(this);
        drawView.setMinimumHeight(500);
        drawView.setMinimumWidth(300);
        layout.addView(drawView);

        Button btn = (Button) findViewById(R.id.btn_main_frame);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, FrameLayoutActivity.class);
                startActivity(intent);
            }
        });

        Button btn_relative = (Button) findViewById(R.id.btn_main_relative);
        btn_relative.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, RelativeLayoutActivity.class);
                startActivity(intent);
            }
        });

        Button btn_grid = (Button) findViewById(R.id.btn_main_grid);
        btn_grid.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, GridLayoutActivity.class);
                startActivity(intent);
            }
        });

        Button btn_text = (Button) findViewById(R.id.btn_main_TextView);
        btn_text.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, TextViewActivity.class);
                startActivity(intent);
            }
        });

        Button btn_edit = (Button) findViewById(R.id.btn_main_editview);
        btn_edit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, EditViewActivity.class);
                startActivity(intent);
            }
        });

        Button btn_radio = (Button) findViewById(R.id.btn_main_RadioButton);
        btn_radio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, RadioButtonActivity.class);
                startActivity(intent);
            }
        });

        Button btn_toggle = (Button) findViewById(R.id.btn_main_ToggleButton);
        btn_toggle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, ToggleButtonActivity.class);
                startActivity(intent);
            }
        });

        Button btn_analog = (Button) findViewById(R.id.btn_main_AnalogButton);
        btn_analog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, AnalogClockActivity.class);
                startActivity(intent);
            }
        });
    }
}
