package prototypePattern;

/**
 * @author jacka
 * @version 1.0.0 on 5/2/2016.
 */
public class TestCloning {
    public static void main(String[] args ) {
        CloneFactory animalMaker = new CloneFactory();

        Sheep sally = new Sheep();

        Sheep clonedSheep = (Sheep) animalMaker.getClone(sally);

        System.out.println(sally);
        System.out.println(clonedSheep);
        System.out.println("Sally hashcode " + System.identityHashCode(System.identityHashCode(sally)));
        System.out.println("Clone HashCode" + System.identityHashCode(System.identityHashCode(clonedSheep)));
    }
}
