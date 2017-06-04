package com.dibuja;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.view.View;
import android.widget.Toast;

public class DrawView extends View {
	Paint paint = new Paint();

	public DrawView(Context context) {
		super(context);
	}

	@Override
	public void onDraw(Canvas canvas) {



		Path trazo = new Path();
		trazo.addCircle(100, 340, 50, Path.Direction.CCW);
		trazo.addCircle(300, 340, 50, Path.Direction.CCW);

		RectF Containeroval = new RectF(100, 250, 295, 320);
		RectF ContainerOvalDos= new RectF(100,375,295,420);

		trazo.addArc(Containeroval, 370, 150);
		trazo.addArc(ContainerOvalDos,-370,-150);

		paint.setColor(Color.BLACK);
		paint.setStrokeWidth(8);
		paint.setStyle(Paint.Style.STROKE);
		canvas.drawPath(trazo, paint);

       paint.setStrokeWidth(1);
        paint.setStyle(Paint.Style.FILL);
        paint.setTextSize(20);
        paint.setTypeface(Typeface.SANS_SERIF);
       canvas.drawTextOnPath("León Mora", trazo, 150, 40, paint);

	}

}
