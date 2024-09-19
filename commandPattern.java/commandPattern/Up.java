package commandPattern;

public class Up implements Command{

    private DeviceAction device;

    public Up(DeviceAction device) {

        this.device = device;
    }

    @Override
    public void execute(){
        device.Up();
    }
}