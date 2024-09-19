package commandPattern;

public class PowerOff implements Command{

    private DeviceAction device;

    public PowerOff(DeviceAction device) {

        this.device = device;
    }

    @Override
    public void execute(){
        device.switchOff();
    }
}