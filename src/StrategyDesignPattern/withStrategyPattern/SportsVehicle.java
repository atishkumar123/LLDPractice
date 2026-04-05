package StrategyDesignPattern.withStrategyPattern;

import StrategyDesignPattern.withStrategyPattern.Strategy.DriveStrategy;
import StrategyDesignPattern.withStrategyPattern.Strategy.SportsDriveStrategy;

public class SportsVehicle extends Vehicle{


    SportsVehicle() {
        super(new SportsDriveStrategy());
    }
}

