package commandPattern;

/**
 * @author jacka
 * @version 1.0.0 on 5/2/2016.
 */
public class PlayWithRemote {

    public static void main(String[] args) {
        ElectronicDevice newDevice = TvRemote.getDevice();

        TurnTvOn onCommand = new TurnTvOn(newDevice);
        DeviceButton onPressed = new DeviceButton(onCommand);

        onPressed.press();

        // ------------------

        TurnTvOff offCommand = new TurnTvOff(newDevice);
        DeviceButton offPressed = new DeviceButton(offCommand);

        offPressed.press();
    }
}
