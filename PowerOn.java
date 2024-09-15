public class PowerOn implements Command{
    private SmartDevice device;

    public PowerOn(SmartDevice device) {
        this.device = device;
    }

    @Override
    public void execute() {
        device.powerOn();
    }
}
