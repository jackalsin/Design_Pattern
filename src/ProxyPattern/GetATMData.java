package ProxyPattern;

/**
 * An interface shared by ATM and ATM proxy
 * @author jacka
 * @version 1.0 on 5/3/2016
 *          <p>
 *          Created by jacka on 5/3/2016.
 */
public interface GetATMData {

    ATMState getATMData();

    int getCashInMachine();
}
