package main;

import main.elevator_factory.ConcreteElevator;
import main.elevator_factory.ElevatorFactory;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Building {

    private int numberOfFloors ;
    private Map<String,Elevator> elevatorMap;
    private ElevatorFactory elevatorFactory = ConcreteElevator.getInstance();


    public Building(int numberOfFloors, String ...elevators) {
        this.numberOfFloors = numberOfFloors;
        this.elevatorMap = new HashMap<>();

        Arrays.stream(elevators).forEach(elevator -> {
            var e = elevatorFactory.createElevator(elevator, numberOfFloors);
            this.elevatorMap.put(e.getId(),e);
        });
    }

    public String requestElevator()
    {
        return requestElevator(numberOfFloors);
    }

    public String requestElevator(int where) {
        int min = Integer.MAX_VALUE;
        String closestElevator = null;

        Set<String> elIDs = elevatorMap.keySet();

        for(String id : elIDs)
        {
            if(elevatorMap.get(id).getElevatorState().closestElevator(where)!=-1
                    && elevatorMap.get(id).getElevatorState().closestElevator(where)<=min) {
                min = elevatorMap.get(id).getElevatorState().closestElevator(where);
                closestElevator = id;
            }
        }
        return closestElevator;
    }


    public void move(String id, String state) {
        Elevator elevator = elevatorMap.get(id);

        switch (state){
            case "UP" :
                elevator.getElevatorState().up(elevator, elevator.getCurrentFloor() + 1);
                break;
            case "DOWN" :
                elevator.getElevatorState().down(elevator, elevator.getCurrentFloor() - 1);
                break;
            default:
                throw new IllegalArgumentException("An elevator can move only UP or Down.");
        }
    }

    public void stopAt(String id, int where) {
        Elevator elevator = elevatorMap.get(id);
        elevator.setCurrentFloor(where);
        elevator.getElevatorState().stop(elevator);
    }



}
