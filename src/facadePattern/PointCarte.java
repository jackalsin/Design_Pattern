package facadePattern;

/**
 * Subsystem.
 * @author jacka
 * @version 1.0.0 on 5/3/2016.
 */
public class PointCarte {
    private double x,y;

    public PointCarte(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public void move (int dx, int dy) {
        x+=dx;
        y+=dy;
    }
    @Override
    public String toString() {
        return "(" + x + "," + y + ")";
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }
}
