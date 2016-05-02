package builderPatternWithPiazza;

/**
 * @author jacka
 * @version 1.0.0 on 5/2/2016.
 */
public class Waiter {

    private PizzaBuilder pizzaBuilder;

    public void setPizzaBuilder(PizzaBuilder pizzaBuilder) {
        this.pizzaBuilder = pizzaBuilder;
    }

    public void constructorPizza() {
        pizzaBuilder.creatNewPiazza();
        pizzaBuilder.buildDough();
        pizzaBuilder.buildSauce();
        pizzaBuilder.buildTopping();
    }

    public Pizza getPizza() {
        return pizzaBuilder.getPizza();
    }
}
