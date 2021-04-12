package com.flysnail.demoapp.layout;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.ViewGroup;
import android.widget.GridLayout;
import android.widget.ImageView;

import com.flysnail.demoapp.R;

public class GridLayout_test extends AppCompatActivity {

    private ImageView[] imageViews = new ImageView[12];
    private int[] iamgeID = new int[]{
            R.drawable.i001,R.drawable.i002,R.drawable.i003,R.drawable.i004,
            R.drawable.i005,R.drawable.i006,R.drawable.i007,R.drawable.i008,
            R.drawable.i009,R.drawable.i010,R.drawable.i011,R.drawable.i012
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_grid_layout_test);

        GridLayout layout = (GridLayout)findViewById(R.id.layout);
        for (int i = 0; i < 12; ++i){
            imageViews[i] = new ImageView(GridLayout_test.this);
            imageViews[i].setImageResource(iamgeID[i]);
            imageViews[i].setPadding(2,2,2,2);
            ViewGroup.LayoutParams params = new ViewGroup.LayoutParams(300,300);
            //imageViews[i].setLayoutParams(params);
            layout.addView(imageViews[i]);
        }
    }
}