package StrategyDesignPattern.withStrategyPattern;

import StrategyDesignPattern.withStrategyPattern.Strategy.DriveStrategy;
import StrategyDesignPattern.withStrategyPattern.Strategy.NormalDriveStratedy;

public class GoodsVehicle extends Vehicle{
    GoodsVehicle() {
        super(new NormalDriveStratedy());
    }
}
