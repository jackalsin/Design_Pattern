package ObserverPattern;

/**
 * The Observers are called when subject changes
 * @author jacka
 *
 */
public interface Observer {
    void update(double ibmPrice, double aaplPrice, double googPrice);
}
