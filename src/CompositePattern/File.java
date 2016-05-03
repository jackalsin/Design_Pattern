package CompositePattern;

/**
 * @author jacka
 * @version 1.0.0 on 5/3/2016.
 */
public class File implements AbstractFile {
    private String name;


    public File(String name) {
        this.name = name;
    }


    @Override
    public void ls() {
        System.out.println(CompositeDemo.gIndent + name);
    }
}
