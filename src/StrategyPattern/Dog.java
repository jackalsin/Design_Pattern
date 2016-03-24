package StrategyPattern;

/**
 * Created by jacka on 2/17/2016.
 */
public class Dog extends Animal {

    public Dog() {
        super("Dog");
        setFlyType(new Itflys());
    }
}
