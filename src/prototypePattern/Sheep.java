package prototypePattern;

/**
 * @author jacka
 * @version 1.0.0 on 5/2/2016.
 */
public class Sheep implements Animal {

    public Sheep() {
        System.out.println("Sheep is Made ");
    }
    @Override
    public Animal makeCopy() {
        System.out.println("Sheep is being made ");
        Sheep sheepObject = null;
        try {
            sheepObject = (Sheep) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return sheepObject;
    }
}
