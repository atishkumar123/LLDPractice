package StrategyDesignPattern.withoutStrategyPattern;

public class Main {
    public static void main(String[] args) {

        Vehicle vehicle=new Vehicle();

        vehicle.drive();

        Vehicle sportvehicle=new SportsVehicle();
        sportvehicle.drive();

        Vehicle offRoadVehicle=new OffRoadVehicle();

        offRoadVehicle.drive();
    }
}
