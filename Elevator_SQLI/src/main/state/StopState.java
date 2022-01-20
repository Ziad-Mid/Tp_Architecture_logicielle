package main.state;

import main.Elevator;

public class StopState extends ElevatorState{
    public StopState(Elevator elevator) {
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
        elevator.setElevatorState(new RestState(elevator));
    }

    @Override
    public void stop(Elevator elevator) {
        throw new IllegalStateException("Elevator Already in Stop state.");
    }

    @Override
    public int closestElevator(int floor) {
        return -1;
    }


}
