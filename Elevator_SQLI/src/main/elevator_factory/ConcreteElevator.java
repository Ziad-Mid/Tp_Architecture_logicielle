package main.elevator_factory;

import main.Elevator;

public class ConcreteElevator extends ElevatorFactory{

    private static ConcreteElevator instance ;


    public ConcreteElevator(){}

    
    public static  ConcreteElevator getInstance(){
        if(instance ==null){
            instance = new ConcreteElevator();
        }
        return instance;
    }


    //id is composed of id and current floor " id1:6 "
    @Override
    public Elevator createElevator(String identifier, int numberOfFloors) {
        String id = identifier.split(":")[0];
        int currentFloor = Integer.parseInt(identifier.split(":")[1]);
        return new Elevator(id,currentFloor,numberOfFloors);
    }
}
