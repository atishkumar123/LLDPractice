package StrategyDesignPattern.withStrategyPattern;

import StrategyDesignPattern.withStrategyPattern.Strategy.DriveStrategy;
import StrategyDesignPattern.withStrategyPattern.Strategy.SportsDriveStrategy;

public class OffRoadVehicle extends Vehicle{
    OffRoadVehicle() {
        super(new SportsDriveStrategy());
    }
}
