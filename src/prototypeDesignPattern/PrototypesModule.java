package prototypeDesignPattern;

/**
 * @author jacka
 * @version 1.0.0 on 5/2/2016.
 */
public class PrototypesModule {
    private static Prototype[] prototypes = new Prototype[9];
    private static int total = 0;

    public static void addPrototype(Prototype prototype) {
        prototypes[total++] = prototype;
    }

    public static Object findAndClone(String name) {
        for (int i = 0; i < total; i++) {
            if (prototypes[i].getName().equals(name)) {
                return prototypes[i].clone();
            }
        }
        System.out.println(name + " not found");
        return null;
    }
}