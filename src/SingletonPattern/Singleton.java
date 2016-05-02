package SingletonPattern;


import java.util.Arrays;
import java.util.LinkedList;

/**
 * The Singleton unfinshed.
 *
 * Created by jacka on 3/24/2016.
 */
public final class Singleton {

    private static Singleton firstInstance = null;

    private String[] scrabbleLetters = {"a", "a", "a", "a", "a", "a", "a", "a", "a",
            "b", "b", "c", "c", "d", "d", "d", "d", "e", "e", "e", "e", "e",
            "e", "e", "e", "e", "e", "e", "e", "f", "f", "g", "g", "g", "h",
            "h", "i", "i", "i", "i", "i", "i", "i", "i", "i", "j", "k", "l",
            "l", "l", "l", "m", "m", "n", "n", "n", "n", "n", "n", "o", "o",
            "o", "o", "o", "o", "o", "o", "p", "p", "q", "r", "r", "r", "r",
            "r", "r", "s", "s", "s", "s", "t", "t", "t", "t", "t", "t", "u",
            "u", "u", "u", "v", "v", "w", "w", "x", "y", "y", "z",};

    private LinkedList<String> letterList = new LinkedList<>(Arrays.asList(scrabbleLetters));

    private static boolean firstThread = true;


    private Singleton() {

    }


    /**
     * Create an instance.
     * @return an single object.
     */
    public static Singleton getInstance() {
        if (firstInstance == null) {

            if (firstThread) {
                firstThread = false;

                Thread.currentThread();
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            firstInstance = new Singleton();
        }

        return firstInstance;
    }

    public LinkedList<String> getLetterList() {
        return firstInstance.letterList;

    }

    public LinkedList<String> getTiles(int howManyTiles) {
        return null;
    }
}
