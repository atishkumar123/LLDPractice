package StrategyDesignPattern.withStrategyPattern.Strategy;

public class NormalDriveStratedy implements DriveStrategy{
     @Override
    public void drive(){
        System.out.println("normal drive Capability");
    }
}
