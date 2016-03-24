package AdapterDesignPattern;

/**
 * Created by jacka on 3/24/2016.
 */
public class TestEnemyAttacker {


    public static void main(String[] args) {
        EnemyTank rx7Tank = new EnemyTank();

        EnemyRobot fredTheRobot = new EnemyRobot();

        EnemyAttacker robotAdapter = new EnemyRobotAdapter(fredTheRobot);
        System.out.println("the robot ");


    }

}
