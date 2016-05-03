package prototypeDesignPattern;

/**
 * @author jacka
 * @version 1.0.0 on 5/2/2016.
 */
public class TheOther implements Prototype, Command {

    public Object clone() {
        return new TheOther();
    }

    @Override
    public void execute() {
        System.out.println("The other: execute");
    }

    @Override
    public String getName() {
        return "TheOther";
    }
}
