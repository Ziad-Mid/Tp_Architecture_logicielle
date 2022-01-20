package main.state;

import main.Elevator;

public class UpState extends ElevatorState{
    public UpState(Elevator elevator) {
        super(elevator);
    }

    @Override
    public void up(Elevator elevator, int where) {
        if(elevator.getCurrentFloor() != where){
            elevator.setCurrentFloor(elevator.getCurrentFloor() + 1);
            up(elevator,where);
        }else{
            this.rest(elevator);
        }
    }

    @Override
    public void down(Elevator elevator, int where) {
        throw new IllegalStateException("Elevator is going Up, Wait until it reach top floor.");
    }

    @Override
    public void rest(Elevator elevator) {
        elevator.setElevatorState(new RestState(elevator));
        if (elevator.getCurrentFloor() != elevator.getNumberOfFloors()) {
            elevator.setElevatorState(this);
        } else {
            elevator.setElevatorState(new DownState(elevator));
        }
    }

    @Override
    public void stop(Elevator elevator) {
        elevator.setElevatorState(new StopState(elevator));
    }

    @Override
    public int closestElevator(int where) {

        if(where >= elevator.getCurrentFloor())
            return where - elevator.getCurrentFloor();
        else
            return where + elevator.getNumberOfFloors() - elevator.getCurrentFloor();

    }


}
