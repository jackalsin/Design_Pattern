package builderPatternWithPiazza;

/**
 *
 * Step 3: create a concrete pizza class.
 * @author jacka
 * @version 1.0.0 on 5/2/2016.
 */
public class HawaiianPizzaBuilder extends PizzaBuilder {


    @Override
    public void buildDough() {
        piazza.setDough("cross");
    }

    @Override
    public void buildSauce() {
        piazza.setDough("mild");
    }

    @Override
    public void buildTopping() {
        piazza.setTopping("ham + pineapple");
    }
}
