package prototypeDesignPattern;

/**
 * @author jacka
 * @version 1.0.0 on 5/2/2016.
 */
public class That implements Prototype, Command {

    public Object clone() {
        return new That();
    }
    @Override
    public void execute() {
        System.out.println("That: execute ");
    }

    @Override
    public String getName() {
        return "That";
    }
}
