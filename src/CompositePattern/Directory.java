package CompositePattern;

import java.util.ArrayList;
import java.util.List;

/**
 * @author jacka
 * @version 1.0.0 on 5/3/2016.
 */
public class Directory implements AbstractFile {

    private List<AbstractFile> files = new ArrayList<>();

    private String name;

    public Directory(String name ) {
        this.name = name;
    }

    public void add(AbstractFile file) {
        files.add(file);
    }

    @Override
    public void ls() {
        System.out.println("Directory " + name);
        for (int i =0 ; i < files.size(); i++) {
            files.get(i).ls();
        }
    }
}
