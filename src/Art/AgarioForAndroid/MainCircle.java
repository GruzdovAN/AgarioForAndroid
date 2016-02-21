package Art.AgarioForAndroid;

/**
 * Created by Elkin on 21.02.2016.
 */
public class MainCircle {
    public static final int INIT_RADIUS = 50;
    private int x;
    private int y;
    private int readius;

    public MainCircle(int x, int y) {
        this.x = x;
        this.y = y;
        readius = INIT_RADIUS;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int getReadius() {
        return readius;
    }
}
