package com.example.coachmarks;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;

import androidx.annotation.Nullable;

public class Draw extends View {
    Context c;
    Paint myPaint;
    String text;

    public void setText(String text) {

        this.text = text;
    }

    public Draw(Context context) {
        super(context);
        this.c = context;
        init();
    }

    public Draw(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        this.c = context;
        init();
    }

    public Draw(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        this.c = context;
        init();
    }

    public Draw(Context context, @Nullable AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
        this.c = context;
        init();
    }

    private void init(){
        super.setBackgroundColor(Color.TRANSPARENT);
    }

    @Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        //super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        setMeasuredDimension(400,80);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        myPaint = new Paint(Paint.ANTI_ALIAS_FLAG);
        myPaint.setColor(Color.BLACK);
        myPaint.setTextSize(40);
        canvas.drawText(text,10,30,myPaint);
    }
}

