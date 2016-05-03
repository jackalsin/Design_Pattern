package builderPatternWithPiazza;

/**
 * Step 2:
 * Create an abstract builder class for other concrete class
 *
 * @author jacka
 * @version 1.0.0 on 5/2/2016.
 */
public abstract class PizzaBuilder {
    protected Pizza piazza;

    public Pizza getPizza() {
        return this.piazza;
    }

    public void creatNewPiazza() {
        piazza = new Pizza();
    }

    public abstract void buildDough();
    public abstract void buildSauce();
    public abstract void buildTopping();
}
