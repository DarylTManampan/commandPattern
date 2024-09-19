package commandPattern;

public class Left implements Command{
    private DeviceAction device;

    public Left(DeviceAction device) {

        this.device = device;
    }

    @Override
    public void execute(){
        device.Left();
    }
}