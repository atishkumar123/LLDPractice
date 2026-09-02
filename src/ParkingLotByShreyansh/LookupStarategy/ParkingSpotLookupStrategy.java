package ParkingLotByShreyansh.LookupStarategy;

import ParkingLotByShreyansh.entity.ParkingSpot;


import java.util.List;

public interface ParkingSpotLookupStrategy {
    ParkingSpot selectSpot(List<ParkingSpot> spots);

}
