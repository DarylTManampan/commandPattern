package commandPattern;

public class Tv implements DeviceAction{

    @Override
    public void switchOn() {
        System.out.println("***Tv is switched-on!***");
    }

    @Override
    public void switchOff() {
        System.out.println("***Tv is switched-off!***");
    }

    @Override
    public void Up() {
        System.out.println("***Tv moved to the next channel!***");
    }

    @Override
    public void Down() {
        System.out.println("***Tv returned to the previous channel!***");
    }

    @Override
    public void Left() {
        System.out.println("***Tv decreased volume!***");
    }

    @Override
    public void Right() {
        System.out.println("***Tv increased volume!***");
    }
}