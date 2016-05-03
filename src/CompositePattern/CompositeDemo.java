package CompositePattern;

/**
 * @author jacka
 * @version 1.0.0 on 5/3/2016.
 */
public class CompositeDemo {
    public static StringBuffer gIndent = new StringBuffer();
    public static void main(String[] args) {
        Directory oneDir = new Directory("OneDir");
        Directory twoDir = new Directory("TwoDir");
        Directory threeDir = new Directory("ThreeDir");

        File a = new File("a");
        File b = new File("b");
        File c = new File("c");
        File d = new File("d");
        File e = new File("e");

        oneDir.add(a);
        oneDir.add(b);
        oneDir.add(twoDir);
        twoDir.add(c);
        twoDir.add(d);
        twoDir.add(threeDir);
        threeDir.add(e);

        oneDir.ls();

    }
}
