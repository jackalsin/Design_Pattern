package builderPattern;

/**
 * @author jacka
 * @version 1.0.0 on 5/2/2016.
 */
public class RobotEngineer {
    private RobotBuilder robotBuilder;

    public RobotEngineer (RobotBuilder robotBuilder) {
        this.robotBuilder = robotBuilder;
    }

    public Robot getRobot() {
        return this.robotBuilder.getRobot();
    }

    public void makeRobot() {
        this.robotBuilder.buildRobotArms();
        this.robotBuilder.buildRobotHead();
        this.robotBuilder.buildRobotLegs();
        this.robotBuilder.buildRobotTorso();
    }
}
