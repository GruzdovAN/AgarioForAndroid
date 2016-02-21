package Art.AgarioForAndroid;

import android.graphics.Canvas;
import android.graphics.Paint;

/**
 * Created by Elkin on 21.02.2016.
 */
public class GameManager {

        private MainCircle mainCircle;
        private Paint paint;

        public GameManager() {
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

    protected void onDraw(Canvas canvas) {
        canvas.drawCircle(mainCircle.getX(),mainCircle.getY(),mainCircle.getReadius(),paint);
    }
}
