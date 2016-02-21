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


    private GameManager gameManager;
    

    public CanvasView(Context context, AttributeSet attrs) {
        super(context, attrs);
        GameManager gameManager = new GameManager();

    }



    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        gameManager.onDraw(canvas);
    }
}
