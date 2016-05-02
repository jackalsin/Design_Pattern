package builderPattern;

/**
 * @author jacka
 * @version 1.0.0 on 5/2/2016.
 */
public class OldRobotBuilder implements RobotBuilder {

    private Robot robot;

    public OldRobotBuilder() {this.robot = new Robot();}
    @Override
    public void buildRobotHead() {
        robot.setRobotHead("Tin Head ");
    }

    @Override
    public void buildRobotTorso() {
        robot.setRobotTorso("Tin Torso ");
    }

    @Override
    public void buildRobotLegs() {
        robot.setRobotLeg("Rollar Skates");
    }

    @Override
    public void buildRobotArms() {
        robot.setRobotArm("Blowtorch Arms"); //  火焰喷枪
    }

    public Robot getRobot() {
        return this.robot;
    }
}
