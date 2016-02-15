import java.util.ArrayList;

public class StockGrabber implements Subject {
    
    private ArrayList<Observer> observers;
    
    private double ibmPrice;
    private double aaplPrice;
    private double googPrice;
    
    public StockGrabber() {
        observers = new ArrayList<>();
    }
    
    
    
    @Override
    public void register(Observer o) {

        observers.add(o);
    }

    @Override
    public void unregister(Observer o) {
        int observerIndex = observers.indexOf(o);
        
        System.out.println("Observer " + (observerIndex+1) + " deleting ");
        
        observers.remove(observerIndex);
    }

    @Override
    public void notifyObserver() {
        // TODO Auto-generated method stub

    }

}
