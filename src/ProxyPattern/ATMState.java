package ProxyPattern;

/**
 * @author jacka
 * @version 1.0 on 5/3/2016
 *          <p>
 *          Created by jacka on 5/3/2016.
 */
public interface ATMState {
    void insertCard();
    void ejectCard();
    void insertPin(int pinEntered);
    void requestCash(int cashToWithdraw);
}
