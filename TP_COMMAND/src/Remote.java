import command.Command;

public class Remote {
Command slot;

public Remote(){}

public void setSlot(Command slot){
    this.slot = slot;
}

public void PressButton(){
    slot.execute();
}


}
