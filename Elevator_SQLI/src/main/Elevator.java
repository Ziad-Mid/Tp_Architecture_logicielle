package main;


import main.state.ElevatorState;
import main.state.RestState;

public class Elevator {

    private String id ;
    private int currentFloor;
    private int numberOfFloors;

    private ElevatorState elevatorState;

    public Elevator(String id, int currentFloor, int numberOfFloors) {

        this.id = id;
        this.currentFloor = currentFloor;
        this.numberOfFloors = numberOfFloors;
        this.elevatorState = new RestState(this);

    }

    public String getId() {
        return id;
    }

    public void changeState(ElevatorState state) {
        this.elevatorState = state;
    }

    public int getCurrentFloor() {
        return currentFloor;
    }

    public void setCurrentFloor(int currentFloor) {
        this.currentFloor = currentFloor;
    }

    public int getNumberOfFloors() {
        return numberOfFloors;
    }

    public ElevatorState getElevatorState() {
        return elevatorState;
    }

    public void setElevatorState(ElevatorState elevatorState) {
        this.elevatorState = elevatorState;
    }
}
