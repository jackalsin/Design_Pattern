package Reflection;

/**
 * Created by jacka on 3/24/2016.
 */
public class EnemyShipFactory {

    /**
     * @param newString the eenemyship type
     * @return an enemyship
     */
    public EnemyShip enemyShipFactory(String newString) {
        EnemyShip enemyShip = null;

        if (newString.equalsIgnoreCase("U")) {
            return new UFOEnemyShip();
        } else if (newString.equalsIgnoreCase("R")) {
            return new RocketShip();
        }
        return null;
    }
}
