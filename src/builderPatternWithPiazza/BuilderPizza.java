package builderPatternWithPiazza;

import DecoratorPattern.*;

import java.lang.reflect.WildcardType;

/**
 * @author jacka
 * @version 1.0.0 on 5/2/2016.
 */
public class BuilderPizza {

    public static void main(String[] args) {
        Waiter waiter = new Waiter();
        PizzaBuilder hawaiianPizzaBuilder = new HawaiianPizzaBuilder();
        PizzaBuilder spicyPizzaBuilder = new SpicyPizzaBuilder();

        waiter.setPizzaBuilder(hawaiianPizzaBuilder);
        waiter.constructorPizza();

        waiter.getPizza();
    }


}
