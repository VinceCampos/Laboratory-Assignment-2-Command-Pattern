public class PowerOff implements Command {
    private SmartDevice device;

    public PowerOff(SmartDevice device) {
        this.device = device;
    }

    @Override
    public void execute() {
        device.powerOff();
    }
}
