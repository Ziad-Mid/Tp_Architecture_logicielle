package main.state;

import main.Elevator;

public abstract class ElevatorState {

    protected Elevator elevator;

    protected ElevatorState(Elevator elevator){
        this.elevator = elevator;
    }


    public abstract void up(Elevator elevator, int where);
    public abstract void down(Elevator elevator, int where);
    public abstract void rest(Elevator elevator);
    public abstract void stop(Elevator elevator);

    public abstract int closestElevator(int floor);

}
