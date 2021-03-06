package Art.AgarioForAndroid;

import android.graphics.Canvas;
import android.graphics.Paint;

/**
 * Created by Elkin on 21.02.2016.
 */
public class GameManager {

    private MainCircle mainCircle;
    private Paint paint;
    private CanvasView canvasView;
    private static int width;
    private static int height;


    public GameManager(CanvasView canvasView, int w, int h){
        this.canvasView = canvasView;
        width = w;
        height = h;
        initMainCircle();
        initPoint();
    }
    private void initPoint() {
        paint = new Paint();
        paint.setAntiAlias(true);
        paint.setStyle(Paint.Style.FILL);
    }

    private void initMainCircle() {

        mainCircle = new MainCircle(width/2, height/2);
    }

    public void onDraw(Canvas canvas) {
        canvas.drawCircle(mainCircle.getX(),mainCircle.getY(),mainCircle.getReadius(),paint);
    }
}
