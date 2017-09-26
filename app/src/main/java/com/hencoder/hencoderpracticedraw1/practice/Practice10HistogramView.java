package com.hencoder.hencoderpracticedraw1.practice;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

public class Practice10HistogramView extends View {

    public Practice10HistogramView(Context context) {
        super(context);
    }

    public Practice10HistogramView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public Practice10HistogramView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

//        综合练习
//        练习内容：使用各种 Canvas.drawXXX() 方法画直方图

        Paint paint = new Paint();
        paint.setColor(Color.WHITE);
        canvas.drawLine(100,100,100,500,paint);
        canvas.drawLine(100,500,900,500,paint);
        paint.setTextSize(20);
        paint.setAntiAlias(true);
        canvas.drawText("Froyo",130,520,paint);
        canvas.drawText("GB",250,520,paint);
        canvas.drawText("ICS",340,520,paint);
        canvas.drawText("JB",450,520,paint);
        canvas.drawText("KitKat",530,520,paint);
        canvas.drawText("L",650,520,paint);
        canvas.drawText("M",750,520,paint);

        paint.setColor(Color.GREEN);
        canvas.drawRect(120,498,200,500,paint);
        canvas.drawRect(220,480,300,500,paint);
        canvas.drawRect(320,480,400,500,paint);
        canvas.drawRect(420,350,500,500,paint);
        canvas.drawRect(520,270,600,500,paint);
        canvas.drawRect(620,200,700,500,paint);
        canvas.drawRect(720,370,800,500,paint);

    }
}
