package DecoratorPattern;

/**
 * Created by jacka on 3/24/2016.
 */
public class PlainPiazza implements Pizza{


    @Override
    public String getDescription() {
        return "Thin Dough"; // 生面团
    }

    @Override
    public double getCost() {
        return 4.00;
    }
}
