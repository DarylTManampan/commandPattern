package commandPattern;

public class Thermostat implements DeviceAction{

    @Override
    public void switchOn() {
        System.out.println("***Thermostat is switched-on!***");
    }

    @Override
    public void switchOff() {
        System.out.println("***Thermostat is switched-off!***");
    }

    @Override
    public void Up() {
        System.out.println("***Thermostat increased temperature!***");
    }

    @Override
    public void Down() {
        System.out.println("***Thermostat decreased temperature!***");
    }

    @Override
    public void Left() {
        System.out.println("***Thermostat lower speed!***");
    }

    @Override
    public void Right() {
        System.out.println("***Thermostat faster speed!***");
    }
}
