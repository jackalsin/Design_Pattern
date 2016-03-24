package DecoratorPattern;

/**
 * Created by jacka on 3/24/2016.
 */


public class PizzaMaker {

    public static void main(String[] args) {


        Pizza basicPizza = new TomatoSauce(new Mozzarella(new PlainPiazza()));

        System.out.println("Ingredients: " + basicPizza.getDescription());

        System.out.println("Total Price : " + basicPizza.getCost());
    }
}
