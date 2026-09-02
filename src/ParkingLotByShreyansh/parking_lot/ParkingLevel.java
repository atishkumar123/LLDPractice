package ParkingLotByShreyansh.parking_lot;

import ParkingLotByShreyansh.entity.ParkingSpot;
import ParkingLotByShreyansh.enums.VehicleType;
import ParkingLotByShreyansh.spotManager.ParkingSpotManager;

import java.util.Map;

public class ParkingLevel {
    private final int levelNumber;
    private final Map<VehicleType, ParkingSpotManager> managers;

    public ParkingLevel(int levelNumber, Map<VehicleType, ParkingSpotManager> managers) {
        this.levelNumber = levelNumber;
        this.managers = managers;
    }

    public boolean hasAvailability(VehicleType vehicleType){

        ParkingSpotManager manager=managers.get(vehicleType);

        return manager!=null && manager.hasFreeSpot();

    }

    public ParkingSpot park(VehicleType vehicleType){
        ParkingSpotManager manager=managers.get(vehicleType);

        if(manager==null){
           throw new IllegalArgumentException(
                   "No Parking manager for vehicle type: "+ vehicleType);
        }
        return manager.park();

    }

    public void unPark(VehicleType vehicleType,ParkingSpot spot){
        ParkingSpotManager manager=managers.get(vehicleType);

        if(manager!=null){
            manager.unPark(spot);
        }
    }

    public int getLevelNumber(){
        return levelNumber;
    }
}
