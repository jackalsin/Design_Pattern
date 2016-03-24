package ObserverPattern;

/** The monitor Screen of Stock
 * 
 * @author jacka
 *
 */
public class StockObserver implements Observer {
    
    private double ibmPrice;
    private double aaplPrice;
    private double googPrice;
    
    private int observerID;
    private static int observerIDTracker = 0;
    
    private Subject stockGrabber;
    
    public StockObserver(Subject stockGrabber) {
        this.stockGrabber = stockGrabber;
        this.observerID = ++ observerIDTracker;
        
        // add to the generate system
        stockGrabber.register(this);
    }
    
    @Override
    public void update(double ibmPrice, double aaplPrice, double googPrice) {
        this.ibmPrice = ibmPrice;
        this.aaplPrice = aaplPrice;
        this.googPrice = googPrice;
        
        printThePrice();
    }
    
    public void printThePrice() {

        System.out.println(observerID + "\nIBM: " + ibmPrice + "\nAAPL: " +  aaplPrice + "\nGOOG: " + googPrice + "\n"); 
    }
    
    
}