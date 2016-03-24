package StrategyPattern;

import StrategyPattern.Flys;

/**
 * Created by jacka on 2/17/2016.
 */
public class Animal {

    private final String name;

    public Flys flyType;

    public Animal(String name) {

        this.name = name;
    }

    public String tryToFly() {
        return flyType.fly();
    }

    public void setFlyType(Flys newFlyType) {

        this.flyType = newFlyType;
    }
}
