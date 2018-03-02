package com.example.lordnicholas.bargraph;

import android.content.Context;
import android.graphics.Canvas;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

import java.util.Date;

/**
 * Created by lordnicholas on 3/1/18.
 */

public class CustomBarGraph extends View {

    private int[] studentCount;
    private int[] dates;
    private final int MIN_COUNT = 0;
    private int maxCount;
    private int width;
    private int height = 200;


    public CustomBarGraph(Context context) {
        super(context);
        init();
    }

    public CustomBarGraph(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        init();
    }

    private void init(){
        configGraph();
    }

    private void configGraph() {

    }



    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);


//        canvas.drawLine(gridLeft, gridBottom, gridLeft, gridTop,mGridPaint);
//        canvas.drawLine(gridLeft, gridBottom, gridRight, gridBottom,mGridPaint);

    }

    public void addData(Date date, int studentCount) {

    }
}
