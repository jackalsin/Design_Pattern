package Flyweight;

import java.awt.*;

/**
 * @author jacka
 * @version 1.0 on 5/3/2016
 *          <p>
 *          Created by jacka on 5/3/2016.
 */
public class MyRect {

    private Color color;
    private int x, y , x2, y2;

    public MyRect(Color color, int upperX, int upperY, int lowerX, int lowerY) {
        this.color = color;
        this.x = upperX;
        this.y = upperY;
        this.x2 = lowerX;
        this.y2 = lowerY;
    }


    public void draw(Graphics g) {
        g.setColor(color);
        g.fillRect(x,y,x2,y2);
    }
}
