package com.flysnail.demoapp.layout;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;

import com.flysnail.demoapp.R;

public class FrameLayout_test extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_frame_layout_test);

        FrameLayout frameLayout = (FrameLayout)findViewById(R.id.layout);
        RabbitView rabbitView = new RabbitView(this);
        frameLayout.addView(rabbitView);
        rabbitView.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                rabbitView.setPositionX(event.getX());
                rabbitView.setPositionY(event.getY());
                rabbitView.invalidate();

                return true;
            }
        });
    }
}