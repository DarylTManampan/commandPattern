package commandPattern;

public class Right implements Command{
    private DeviceAction device;

    public Right(DeviceAction device) {

        this.device = device;
    }

    @Override
    public void execute(){
        device.Right();
    }
}