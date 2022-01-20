package main.elevator_factory;

import main.Elevator;

public abstract class ElevatorFactory {
    public abstract Elevator createElevator(String id, int numberOfFloors);
}
