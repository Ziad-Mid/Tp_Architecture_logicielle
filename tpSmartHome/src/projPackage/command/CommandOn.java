package projPackage.command;

import projPackage.device.Device;

public class CommandOn implements Command{

    private Device device;

    public  CommandOn(Device device){
        this.device = device;
    }

    @Override
    public String execute() {
        return device.on();
    }

    @Override
    public String undo() {
        return device.off();
    }
}
