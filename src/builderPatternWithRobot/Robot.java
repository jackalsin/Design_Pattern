package builderPatternWithRobot;

/**
 * @author jacka
 * @version 1.0.0 on 5/2/2016.
 */
public class Robot implements RobotPlan {
    private String robotHead;
    private String robotTorso;
    private String robotArms;
    private String robotLegs;

    @Override
    public void setRobotHead(String head) {
        robotHead = head;

    }

    @Override
    public void setRobotTorso(String torso) {
        robotTorso = torso;
    }

    @Override
    public void setRobotLeg(String leg) {
        robotLegs = leg;
    }

    @Override
    public void setRobotArm(String arm) {
        robotArms = arm;
    }

    public String getRobotHead() {
        return robotHead;
    }

    public String getRobotTorso() {
        return robotTorso;
    }

    public String getRobotArms() {
        return robotArms;
    }

    public String getRobotLegs() {
        return robotLegs;
    }
}
