package Art.AgarioForAndroid;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;

/**
 * Created by Elkin on 21.02.2016.
 */
public class CanvasView extends View {

    private MainCircle mainCircle;
    private Paint paint;
    

    public CanvasView(Context context, AttributeSet attrs) {
        super(context, attrs);
        initMainCircle();
        initPoint();
    }

    private void initPoint() {
        paint = new Paint();
        paint.setAntiAlias(true);
        paint.setStyle(Paint.Style.FILL);
    }

    private void initMainCircle() {

        mainCircle = new MainCircle(200, 500);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.drawCircle(mainCircle.getX(),mainCircle.getY(),mainCircle.getReadius(),paint);
    }
}
