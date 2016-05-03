package ProxyPattern;

/**
 * @author jacka
 * @version 1.0 on 5/3/2016
 *          <p>
 *          Created by jacka on 5/3/2016.
 */
public class ATMMachine implements GetATMData {



    public ATMState getYesCardState() { return hasCard; }
    public ATMState getNoCardState() { return noCard; }
    public ATMState getHasPin() { return hasCorrectPin; }
    public ATMState getNoCashState() { return atmOutOfMoney; }

    // NEW STUFF

    public ATMState getATMState() { return atmState; }
    public int getCashInMachine() { return cashInMachine; }

    @Override
    public ATMState getATMData() {
        return null;
    }

    @Override
    public int getCashInMachine() {
        return 0;
    }
}
