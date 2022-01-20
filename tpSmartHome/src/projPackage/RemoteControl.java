package projPackage;

import projPackage.command.Command;
import projPackage.command.CommandOff;
import projPackage.command.CommandOn;
import projPackage.device.Device;

import java.util.Stack;

public class RemoteControl {

    int nbrSlot;

    Command commandOn[];
    Command commandOff[];

    //Get commands executed in order
    Stack<Command> commandsStack ;


    public RemoteControl(int nbrSlot) {
        this.nbrSlot = nbrSlot;
        commandOff = new Command[nbrSlot];
        commandOn = new Command[nbrSlot];
        commandsStack = new Stack<>();
    }

    //Init devices with two commands ON & OFF for each device
    public void init(Device...devices) {
        for (int i = 0 ; i < devices.length ; i ++){
            this.commandOn[i] = new CommandOn(devices[i]);
            this.commandOff[i] = new CommandOff(devices[i]);
        }
    }

    //Execute ON command
    public void onButtonPressed(int index){
        this.commandOn[index].execute();
        commandsStack.push(this.commandOn[index]); //add to stack
    }

    //Execute OFF command
    public void offButtonPressed(int index){
        this.commandOff[index].execute();
        commandsStack.push(this.commandOff[index]); //add to stack
    }

    //Undo last command executed in the stack
    public void undo() {

        commandsStack.pop().undo();
    }

    //build report
    public String remoteReport(){
        StringBuilder builder = new StringBuilder();

        for (Command command : commandsStack){
            builder.append(command.execute()+"-");
        }

        return builder.toString();
    }


}
