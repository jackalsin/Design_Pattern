package commandPattern;

/**
 * @author jacka
 * @version 1.0.0 on 5/2/2016.
 */
public class DeviceButton {
    private Command theCommand;

    public DeviceButton(Command neCommand) {
        this.theCommand = neCommand;
    }

    public void press() {
        theCommand.execute();
    }

}
