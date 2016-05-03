package facadePattern;

/**
 * @author jacka
 * @version 1.0.0 on 5/3/2016.
 */
public class PointPolar {

    private  double radius, angle;

    public PointPolar(double r, double a) {
        radius = r;
        angle = a;
    }

    public void rotate(int angle) {
        angle += angle %360;
    }

    public String toString() {
        return "[" + radius + "@" + angle + "]";
    }

}
