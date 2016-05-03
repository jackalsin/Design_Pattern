package Flyweight;

import javax.swing.*;
import java.awt.*;
import java.util.Random;

/**
 * @author jacka
 * @version 1.0.0 on 5/3/2016.
 */
public class FlyWeightTest extends JFrame {

    private JButton startDrawing;

    private int windowWidth = 1750;
    private int windowHeight = 150;

    private Color[] shapeColors = {Color.orange, Color.red, Color.yellow,
                                                        Color.blue, Color.pink, Color.cyan, Color.magenta,
                                                        Color.black, Color.gray};


    public static void main(String[] args) {
        new FlyWeightTest();
    }

    public FlyWeightTest() {
        this.setSize(windowWidth, windowHeight);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("Flyweight Test");

        JPanel contentPane = new JPanel();
        contentPane.setLayout(new BorderLayout());
        final JPanel drawingPanel = new JPanel();
        startDrawing = new JButton("Draw Stuff");

        contentPane.add(drawingPanel, BorderLayout.CENTER);
        contentPane.add(startDrawing, BorderLayout.SOUTH);

        startDrawing.addActionListener((e) -> {

            Graphics g = drawingPanel.getGraphics();
            long startTime = System.currentTimeMillis();
            for (int i = 0; i < 100000; ++i) {
                g.setColor(getRandColor());
                g.fillRect(getRandX(), getRandY(), getRandX(), getRandY());

            }

            long endTime = System.currentTimeMillis();
            System.out.println("It takes " +(endTime - startTime));

        });

        this.add(contentPane);
        this.setVisible(true);
    }


    private Color getRandColor() {
        Random randomGenerator = new Random();
        int randInt = randomGenerator.nextInt(9);

        return shapeColors[randInt];
    }

    private int getRandX() {
        return (int) (Math.random()*windowWidth);
    }


    private int getRandY() {
        return (int) (Math.random()*windowHeight);
    }

}

