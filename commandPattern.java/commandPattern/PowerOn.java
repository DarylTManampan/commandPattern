package commandPattern;

public class PowerOn implements Command{

    private DeviceAction device;

    public PowerOn(DeviceAction device) {
        this.device = device;
    }

    @Override
    public void execute(){
        device.switchOn();
    }
}