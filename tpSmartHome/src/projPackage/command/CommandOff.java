package projPackage.command;

import projPackage.device.Device;

public class CommandOff implements Command{

    private Device device;

    public  CommandOff(Device device){
        this.device = device;
    }


    @Override
    public String execute() {
       return device.off();
    }

    @Override
    public String undo() {
      return  device.on();
    }


}
