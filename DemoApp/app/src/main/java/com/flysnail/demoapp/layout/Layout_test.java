package com.flysnail.demoapp.layout;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.flysnail.demoapp.MainActivity;
import com.flysnail.demoapp.R;

public class Layout_test extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_layout_test);

        //获取传递值
        Intent intent = getIntent();
        String message = intent.getStringExtra(MainActivity.EXTRA_MESSAGE);
        TextView textView = (TextView)findViewById(R.id.textView);
        textView.setText(message);
    }

    public void gridLayoutTest(View view){
        Intent intent = new Intent(this,GridLayout_test.class);
        startActivity(intent);
    }

    public void frameLayoutTest(View view){
        Intent intent = new Intent(this, FrameLayout_test.class);
        startActivity(intent);
    }

    public void constraintLayoutTest(View view){
        Intent intent = new Intent(this, ConstraintLayout_test.class);
        startActivity(intent);
    }
}