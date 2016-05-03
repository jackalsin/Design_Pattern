package commandPattern;

/**
 * @author jacka
 * @version 1.0.0 on 5/2/2016.
 */
public class TurnTvOn implements Command {
    private ElectronicDevice theDevice;

    public TurnTvOn(ElectronicDevice newDevice) {
        this.theDevice = newDevice;
    }
    @Override
    public void execute() {
        theDevice.on();
    }
}
