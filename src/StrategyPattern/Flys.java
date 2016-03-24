package StrategyPattern;

/**
 * Created by jacka on 2/17/2016.
 */
public interface Flys {
    String fly();

}

class Itflys implements Flys {

    public String fly() {
        return "Flying high";

    }


}


class CantFly implements Flys {

    @Override
    public String fly() {
        return "Cannot fly";
    }
}
