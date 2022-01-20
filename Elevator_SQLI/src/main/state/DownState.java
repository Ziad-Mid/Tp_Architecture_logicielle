package main.state;

import main.Elevator;

public class DownState extends ElevatorState{

    public DownState(Elevator elevator) {
        super(elevator);
    }

    @Override
    public void up(Elevator elevator, int where) {
        throw new IllegalStateException("Elevator is going Down, Wait until it reach bottom floor.");
    }

    @Override
    public void down(Elevator elevator, int where) {
        if(elevator.getCurrentFloor() != where){
            elevator.setCurrentFloor(elevator.getCurrentFloor() - 1);
            down(elevator,where);
        }else{
            this.rest(elevator);
        }
    }

    @Override
    public void rest(Elevator elevator) {
        elevator.setElevatorState(new RestState(elevator));
        if (elevator.getCurrentFloor() != 1) {
            elevator.setElevatorState(this);
        } else {
            elevator.setElevatorState(new UpState(elevator));
        }
    }

    @Override
    public void stop(Elevator elevator) {
        elevator.setElevatorState(new StopState(elevator));
    }

    @Override
    public int closestElevator(int where) {

        if(where <= elevator.getCurrentFloor())
            return elevator.getCurrentFloor() - where;
        else
            return where + elevator.getNumberOfFloors() - elevator.getCurrentFloor();

    }

}
