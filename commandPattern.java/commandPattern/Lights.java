package commandPattern;

public class Lights implements DeviceAction{

    @Override
    public void switchOn() {
        System.out.println("***Light switched on!***");
    }

    @Override
    public void switchOff() {
        System.out.println("***Light switched off!***");
    }

    @Override
    public void Up() {
        System.out.println("***Light increased brightness!***");
    }

    @Override
    public void Down() {
        System.out.println("***Light decreased brightness!***");
    }

    @Override
    public void Left() {
        System.out.println("***Light switched cooler color!***");
    }

    @Override
    public void Right() {
        System.out.println("***Light switched to warmer color!***");
    }
}