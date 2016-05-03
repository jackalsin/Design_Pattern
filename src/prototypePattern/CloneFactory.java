package prototypePattern;

/**
 * @author jacka
 * @version 1.0.0 on 5/2/2016.
 */
public class CloneFactory {

    public Animal getClone (Animal animalSample) {
        return animalSample.makeCopy();
    }

}
