public class MusicPlayer implements SmartDevice {
    private static int highVolume = 50;
    private static int lowVolume = 25;
    private static String songTitle = "Birds of a Feather by Billie Eilish";

    @Override
    public void powerOn() {
        System.out.println("Music Player is turned on" + " (Now playing: " + songTitle + ")");
    }

    @Override
    public void powerOff() {
        System.out.println("Music Player is turned off");
    }

    @Override
    public void increaseSetting() {
        System.out.println("Volume increased by " + highVolume + "%" );
    }

    @Override
    public void decreaseSetting() {
        System.out.println("Volume decreased by " + lowVolume + "%");
    }

    public static int getVolume1() {
        return highVolume;
    }

    public static void setVolume1(int volume) {
        MusicPlayer.highVolume = volume;
    }

    public static int getVolume() {
        return lowVolume;
    }

    public static void setVolume(int volume) {
        MusicPlayer.lowVolume = volume;
    }

    public static String getSong() {
        return songTitle;
    }

    public static void setSong(String song) {
        MusicPlayer.songTitle = song;
    }
}