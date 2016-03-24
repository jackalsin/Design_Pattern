package AdapterDesignPattern;

import java.util.Random;
/**
 * Created by jacka on 3/24/2016.
 */
public class EnemyTank implements EnemyAttacker{

    private Random generator = new Random();


    @Override
    public void fireWeapon() {

        int attackDamage = generator.nextInt(10) + 1;

        System.out.println("Enemy Tank does " + attackDamage + " Damage");
    }

    @Override
    public void driveForward() {
        int movement = generator.nextInt(5) + 1;
        System.out.println("Enemy tank moves " + movement + " spaces" );

    }

    @Override
    public void setDriver(String name) {

        System.out.println(name + " is driving the tank");



    }
}
