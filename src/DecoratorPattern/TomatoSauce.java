package DecoratorPattern;

/**
 * Created by jacka on 3/24/2016.
 */
public class TomatoSauce extends ToppingDecorator{

    public TomatoSauce(Pizza newPizza) {
        super(newPizza);

        System.out.println("Adding Dough");
        System.out.println("Adding Tomato");
    }

    public String getDescription() {
        return tempPizza.getDescription() + " , Tomato Sauce";
    }

    public double getCost() {
        return tempPizza.getCost() + 1.50;
    }
}
