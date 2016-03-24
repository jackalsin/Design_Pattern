package ObserverPattern;

public class Main {
    
    public static void main(String[] args) {
        StockGrabber stockGrabber = new StockGrabber();
        
        StockObserver observer1 = new StockObserver(stockGrabber);
        
        stockGrabber.setIBMPrice(197.00);
        stockGrabber.setAAPLPrice(677.60);
        stockGrabber.setGOOGPrice(676.40);
        
        System.out.println("Creat Observer 2");
        
        StockObserver observer2 = new StockObserver(stockGrabber);
        
        stockGrabber.setIBMPrice(197.00);
        stockGrabber.setAAPLPrice(677.60);
        stockGrabber.setGOOGPrice(676.40);
        
        // Delete one of the observers
        
        System.out.println("stockGrabber.unregister(observer2)");
        stockGrabber.unregister(observer2);
        stockGrabber.setIBMPrice(197.00);
        stockGrabber.setAAPLPrice(677.60);
        stockGrabber.setGOOGPrice(676.40);

    }
}
