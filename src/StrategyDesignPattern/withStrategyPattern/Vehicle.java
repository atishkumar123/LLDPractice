package StrategyDesignPattern.withStrategyPattern;

import StrategyDesignPattern.withStrategyPattern.Strategy.DriveStrategy;

public class Vehicle {

    DriveStrategy driveStrategy;

    Vehicle(DriveStrategy driveStrategy){
        this.driveStrategy=driveStrategy;
    }

    public void drive(){
        driveStrategy.drive();
    }

}
