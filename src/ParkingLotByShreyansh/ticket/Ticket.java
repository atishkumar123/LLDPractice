package ParkingLotByShreyansh.ticket;

import ParkingLotByShreyansh.entity.ParkingSpot;
import ParkingLotByShreyansh.entity.Vehicle;
import ParkingLotByShreyansh.parking_lot.ParkingLevel;

import java.time.LocalDateTime;

public class Ticket {
     private final Vehicle vehicle;
     private final ParkingLevel parkingLevel;
     private final ParkingSpot spot;
     private final LocalDateTime entryTime;


    public Ticket(Vehicle vehicle, ParkingLevel parkingLevel, ParkingSpot spot) {
        this.vehicle = vehicle;
        this.parkingLevel = parkingLevel;
        this.spot = spot;
        this.entryTime = LocalDateTime.now();
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public ParkingLevel getParkingLevel() {
        return parkingLevel;
    }

    public ParkingSpot getSpot() {
        return spot;
    }

    public LocalDateTime getEntryTime() {
        return entryTime;
    }
}
