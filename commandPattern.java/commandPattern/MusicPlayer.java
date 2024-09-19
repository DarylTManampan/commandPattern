package commandPattern;

public class MusicPlayer implements DeviceAction{

    @Override
    public void switchOn() {
        System.out.println("***Music Player is switched-on!***");
    }

    @Override
    public void switchOff() {
        System.out.println("***Music Player is switched-off!***");
    }

    @Override
    public void Up() {
        System.out.println("***Music Player volume increased!***");
    }

    @Override
    public void Down() {
        System.out.println("***Music Player volume decreased!***");
    }

    @Override
    public void Left() {
        System.out.println("***Music Player returned to the Previous Song!***");
    }

    @Override
    public void Right() {
        System.out.println("***Music Player moved to the Next Song!***");
    }
}