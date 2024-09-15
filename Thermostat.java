public class Thermostat implements SmartDevice {
    @Override
    public void powerOn() {
        System.out.println("Thermostat is turned on");
    }

    @Override
    public void powerOff() {
        System.out.println("Thermostat is turned off");
    }

    @Override
    public void increaseSetting() {
        System.out.println("Increasing temperature");
    }

    @Override
    public void decreaseSetting() {
        System.out.println("Decreasing temperature");
    }
}
