package commandPattern;

/**
 * @author jacka
 * @version 1.0.0 on 5/2/2016.
 */
public class TvRemote {

    public static ElectronicDevice getDevice() {
        return new Television();
    }

}
