package factoryPattern;

import java.util.Scanner;

/**
 * Use this whenever a method return one of several possible
 * class that share a common super class
 *
 * It can use a random generator to generator
 *
 * Created by jacka on 3/24/2016.
 */
public class EnemyShipTesting {

    public static void main(String[] args) {

        EnemyShipFactory shipFactory = new EnemyShipFactory();

        EnemyShip enemyShip = null;
        Scanner userInput = new Scanner(System.in);

        if(userInput.hasNextLine()) {
            String typeOfShip = userInput.nextLine();
            enemyShip = shipFactory.enemyShipFactory(typeOfShip);
        }

        if (enemyShip != null) {
            doStuffEnemy(enemyShip);
        } else
            System.out.println("Press U, R");
    }

    private static void doStuffEnemy(EnemyShip enemyShip) {
        enemyShip.followHeroShip();
        enemyShip.enemyShipShoots();
    }

}
