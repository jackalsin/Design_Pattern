package commandPattern;

/**
 * @author jacka
 * @version 1.0.0 on 5/2/2016.
 */
public class TurnVolumeUp implements Command{

    private ElectronicDevice theDevice;

    public TurnVolumeUp(ElectronicDevice newDevice) {
        this.theDevice = newDevice;
    }
    @Override
    public void execute() {
        theDevice.volumeUp();
    }
}
