package ObserverPattern;

import java.util.ArrayList;

/** This is the content generate
 * @author jacka
 *
 */
public class StockGrabber implements Subject {
    
    private ArrayList<Observer> observers;
    
    private double ibmPrice;
    private double aaplPrice;
    private double googPrice;
    
    public StockGrabber() {
        // create an arrayList to hold all the observers
        
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
        
        for(Observer o : observers) {
            o.update(ibmPrice, aaplPrice, googPrice);
        }

    }
    
    
    public void setIBMPrice(double ibmPrice) {
        this.ibmPrice = ibmPrice;
        
        // any change call notify()
        notifyObserver();
    }
    
    public void setAAPLPrice(double aaplPrice) {
        this.aaplPrice = aaplPrice;
        notifyObserver();
        
    }
    
    public void setGOOGPrice(double googPrice) {
        this.googPrice = googPrice;
        notifyObserver();
    }
}
