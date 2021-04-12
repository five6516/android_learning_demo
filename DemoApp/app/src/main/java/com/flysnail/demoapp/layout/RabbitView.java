package com.flysnail.demoapp.layout;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.media.FaceDetector;
import android.view.View;

import com.flysnail.demoapp.R;

public class RabbitView extends View {
    private float positionX;
    private float positionY;

    public void setPositionX(float positionX) {
        this.positionX = positionX;
    }

    public void setPositionY(float positionY) {
        this.positionY = positionY;
    }

    public RabbitView(Context context) {
        super(context);

        positionX = 200;
        positionY = 200;
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

        Bitmap bitmap = BitmapFactory.decodeResource(this.getResources(), R.drawable.i002);
        canvas.drawBitmap(bitmap, positionX, positionY, new Paint());

        if (bitmap.isRecycled()){
            bitmap.recycle();
        }
    }
}
