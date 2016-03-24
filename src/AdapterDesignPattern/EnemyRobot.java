package AdapterDesignPattern;

import java.util.Random;

/**
 * Created by jacka on 3/24/2016.
 */
public class EnemyRobot {
    private Random generator = new Random();

    /**
     * The smash hand
     */
    public void smashWithHands() {
        int attackDamage = generator.nextInt(10) + 1;
        System.out.println("Enemy Robot causes " + attackDamage + " Damage wiht its hands");
    }

    public void walkForward() {
        int movement = generator.nextInt(5) + 1;

        System.out.println("Enemy Robot walk forward " + movement + " spaces");
    }


    public void setDriver(String name ) {
        System.out.println("Enemy tramps on " + name);
    }
}
