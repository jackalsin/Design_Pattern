package builderPatternWithPiazza;

/**
 * Step 3: Create a concrete class
 * @author jacka
 * @version 1.0.0 on 5/2/2016.
 */
public class SpicyPizzaBuilder extends PizzaBuilder {
    @Override
    public void buildDough() {
        piazza.setDough("pan baked");
    }

    @Override
    public void buildSauce() {
        piazza.setSauce("hot");
    }

    @Override
    public void buildTopping() {
        piazza.setTopping("pepperoni+salami");
    }
}
