public class SmartViewerApp {
    public static void main(String[] args) {

        Light roomLight = new Light();
        Thermostat thermostat = new Thermostat();
        MusicPlayer musicplayer = new MusicPlayer();

        Command turnOnLight = new PowerOn(roomLight);
        Command turnOffLight = new PowerOff(roomLight);
        Command increaseLight = new IncreaseSettingCommand(roomLight);
        Command decreaseLight = new DecreaseSettingCommand(roomLight);

        Command turnOnThermostat = new PowerOn(thermostat);
        Command turnOffThermostat = new PowerOff(thermostat);
        Command increaseThermostat = new IncreaseSettingCommand(thermostat);
        Command decreaseThermostat = new DecreaseSettingCommand(thermostat);

        Command turnOnMusicPlayer = new PowerOn(musicplayer);
        Command turnOffMusicPlayer = new PowerOff(musicplayer);
        Command increaseMusicVolume = new IncreaseSettingCommand(musicplayer);
        Command decreaseMusicVolume = new DecreaseSettingCommand(musicplayer);

        CentralHub hub = new CentralHub();

        System.out.println("Welcome to Smart Viewer App: ");
        // Control devices
        System.out.println("Control Light:");
        hub.setCommand(turnOnLight);
        hub.pressButton();

        hub.setCommand(increaseLight);
        hub.pressButton();

        hub.setCommand(decreaseLight);
        hub.pressButton();

        hub.setCommand(turnOffLight);
        hub.pressButton();
        
        System.out.println("\nControl Thermostat:");
        hub.setCommand(turnOnThermostat);
        hub.pressButton(); 

        hub.setCommand(increaseThermostat);
        hub.pressButton();

        hub.setCommand(decreaseThermostat);
        hub.pressButton();

        hub.setCommand(turnOffThermostat);
        hub.pressButton(); 

        System.out.println("\nControl MusicPlayer:");
        hub.setCommand(turnOnMusicPlayer);
        hub.pressButton(); 

        hub.setCommand(increaseMusicVolume);
        hub.pressButton();

        hub.setCommand(decreaseMusicVolume);
        hub.pressButton();

        hub.setCommand(turnOffMusicPlayer);
        hub.pressButton(); 
    }
}