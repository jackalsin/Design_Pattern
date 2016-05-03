package facadePattern;

/**
 * Facade Patter:
 *
 * When there are two subsystem,
 *      one is for Carte
 *      one is for polar
 *  Use Point facade to wrap them.
 *
 * @author jacka
 * @version 1.0.0 on 5/3/2016.
 */
public class FacadeDemo {

    public static void main(String[] args) {
        Line line1 = new Line(new Point(2,4), new Point(5, 7));
        line1.move(-2,-4);
        System.out.println( "after move:  " + line1 );
        line1.rotate(45);
        System.out.println( "after rotate: " + line1 );
        Line line2 = new Line( new Point(2,1), new Point(2.866,1.5) );
        line2.rotate(30);
        System.out.println( "30 degrees to 60 degrees: " + line2 );
    }
}
