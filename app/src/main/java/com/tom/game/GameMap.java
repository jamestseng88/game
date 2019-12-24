package com.tom.game;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;

import androidx.annotation.Nullable;

public class GameMap extends View {
    private float posX,posY;
    public GameMap(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        Log.d("Game","onDrow" + getWidth() + "," + getHeight());
        Paint paint = new Paint();
        Bitmap bitmap = BitmapFactory.decodeResource(getResources(),R.drawable.pokemon27);
        for (int i = 0 ; i < getHeight() - bitmap.getHeight();i+=50)
        canvas.drawBitmap(bitmap,posX,posY,paint);
    }

    public float getPosX() {
        return posX;
    }

    public float getPosY() {
        return posY;
    }

    public void setPosX(float posX) {
        if(posX > 0 && posX < getWidth() - 350) {
            this.posX = posX;
        }
    }

    public void setPosY(float posY) {
        if(posY > 0 && posY < getHeight() -400) {
            this.posY = posY;
        }

    }
}
