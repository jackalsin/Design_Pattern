package commandPattern;

/**
 * @author jacka
 * @version 1.0.0 on 5/2/2016.
 */
public class TurnTvOff implements Command {
    private ElectronicDevice theDevice;

    public TurnTvOff(ElectronicDevice newDevice) {
        this.theDevice = newDevice;
    }
    @Override
    public void execute() {
        theDevice.off();
    }
}
