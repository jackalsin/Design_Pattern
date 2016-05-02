package builderPattern;

/**
 * The builder pattern
 * When to use:
 * when there are a lot parameters to set
 * you should probably use builder pattern
 *
 * @author jacka
 * @version 1.0.0 on 5/2/2016.
 */
public interface RobotPlan {

    void setRobotHead(String head);
    void setRobotTorso(String torso);
    void setRobotLeg(String leg);
    void setRobotArm(String arm);
}

