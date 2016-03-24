package StrategyPattern;


/**
 * Created by jacka on 2/17/2016.
 */
public class Main {

    public static void main(String[] args) {
        Dog dog = new Dog();
        Bird bird = new Bird();

        System.out.println("dog's flyType " + dog.tryToFly());
        System.out.println("bird's flyType " + bird.tryToFly());

    }

}
