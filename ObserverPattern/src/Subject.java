
/**
 * This is the interface handles adding, deleting and updating
 * @author jacka
 *
 */
public interface Subject {
    
    public void register(Observer o);
    public void unregister(Observer o);
    public void notifyObserver();
}
