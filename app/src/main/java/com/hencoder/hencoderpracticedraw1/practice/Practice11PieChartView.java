package com.hencoder.hencoderpracticedraw1.practice;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

import com.hencoder.hencoderpracticedraw1.R;

public class Practice11PieChartView extends View {

    public Practice11PieChartView(Context context) {
        super(context);
    }

    public Practice11PieChartView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public Practice11PieChartView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

//        综合练习
//        练习内容：使用各种 Canvas.drawXXX() 方法画饼图

        Paint paint = new Paint();
        paint.setColor(Color.RED);
        canvas.drawArc(200,100,700,600,180,120,true,paint);
        paint.setColor(Color.YELLOW);
        canvas.drawArc(220,120,720,620,0,-60,true,paint);
        paint.setColor(getResources().getColor(R.color.purple));
        canvas.drawArc(220,120,720,620,3,7,true,paint);
        paint.setColor(Color.GRAY);
        canvas.drawArc(220,120,720,620,13,7,true,paint);
        paint.setColor(getResources().getColor(R.color.darkGreen));
        canvas.drawArc(220,120,720,620,23,60,true,paint);
        paint.setColor(Color.BLUE);
        canvas.drawArc(220,120,720,620,85,95,true,paint);


        paint.setColor(Color.WHITE);
        canvas.drawLine(110,150,240,150,paint);
        canvas.drawLine(240,150,268,178,paint);
        paint.setTextSize(18);
        canvas.drawText("Lollipop",50,150,paint);


    }
}
