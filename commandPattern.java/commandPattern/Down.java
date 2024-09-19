package commandPattern;

public class Down implements Command{

    private DeviceAction device;

    public Down(DeviceAction device) {

        this.device = device;
    }

    @Override
    public void execute(){
        device.Down();
    }
}