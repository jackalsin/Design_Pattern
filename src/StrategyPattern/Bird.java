package StrategyPattern;


/**
 * Created by jacka on 2/17/2016.
 */
public class Bird extends Animal {

    public Bird() {
        super("Bird");
        setFlyType(new CantFly());
    }



}
