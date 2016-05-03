package prototypeDesignPattern;

/**
 * @author jacka
 * @version 1.0.0 on 5/2/2016.
 */
public class PrototypeDemo {

    public static void initializePrototypes() {
        PrototypesModule.addPrototype( new This() );
        PrototypesModule.addPrototype( new That() );
        PrototypesModule.addPrototype( new TheOther() );
    }

    public static void main( String[] args ) {
        initializePrototypes();
        Object[] objects = new Object[9];
        int total = 0;
        args = new String[] {"Garbage", "This",  "That",  "Nothing", "TheOther"};
        // 6. Client does not use "new"
        for (int i=0; i < args.length; i++) {
            objects[total] = PrototypesModule.findAndClone( args[i] );
            if (objects[total] != null) total++;
        }
        for (int i=0; i < total; i++) {
            ((Command)objects[i]).execute();
        }
    }

}
