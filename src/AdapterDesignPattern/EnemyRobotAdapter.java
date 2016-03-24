package AdapterDesignPattern;

/**
 * Created by jacka on 3/24/2016.
 */
public class EnemyRobotAdapter implements EnemyAttacker {

    private final EnemyRobot robot;

    public EnemyRobotAdapter(EnemyRobot robot) {
        this.robot = robot;

    }
    @Override
    public void fireWeapon() {
        robot.smashWithHands();
    }

    @Override
    public void driveForward() {
        robot.walkForward();
    }

    @Override
    public void setDriver(String name) {
        robot.setDriver(names);
    }
}
