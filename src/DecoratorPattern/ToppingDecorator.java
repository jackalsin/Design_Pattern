package DecoratorPattern;


/**
 * This is the decorator.
 * Created by jacka on 3/24/2016.
 */
public abstract class ToppingDecorator implements Pizza{

    protected Pizza tempPizza;


    public ToppingDecorator(Pizza newPizza) {

        tempPizza = newPizza;
    }

    public String getDescription() {

        return tempPizza.getDescription();
    }

    public double getCost() {
        return tempPizza.getCost();
    }
}
