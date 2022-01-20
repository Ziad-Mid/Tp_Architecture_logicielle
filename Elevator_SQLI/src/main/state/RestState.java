package main.state;

import main.Elevator;

public class RestState extends ElevatorState{

    public RestState(Elevator elevator) {
        super(elevator);
    }

    @Override
    public void up(Elevator elevator, int where) {
        elevator.setElevatorState(new UpState(elevator));
        elevator.getElevatorState().up(elevator, where);
    }

    @Override
    public void down(Elevator elevator, int where) {
        elevator.setElevatorState(new DownState(elevator));
        elevator.getElevatorState().down(elevator, where);
    }

    @Override
    public void rest(Elevator elevator) {
        throw new IllegalStateException("Elevator already in Rest State.");
    }

    @Override
    public void stop(Elevator elevator) {
        elevator.setElevatorState(new StopState(elevator));
    }

    @Override
    public int closestElevator(int floor) {
        return Math.abs(floor - elevator.getCurrentFloor());
    }


}
