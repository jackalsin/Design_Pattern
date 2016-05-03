package prototypeDesignPattern;

/**
 * @author jacka
 * @version 1.0.0 on 5/2/2016.
 */
public class This implements Prototype, Command{

    public Object clone() {
        return new This();
    }
    @Override
    public void execute() {
        System.out.println("This: execute ");
    }

    @Override
    public String getName() {
        return "This";
    }
}
