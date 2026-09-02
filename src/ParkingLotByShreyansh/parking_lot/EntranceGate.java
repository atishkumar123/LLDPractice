package ParkingLotByShreyansh.parking_lot;

import ParkingLotByShreyansh.entity.Vehicle;
import ParkingLotByShreyansh.ticket.Ticket;

public class EntranceGate {

    public Ticket enter(ParkingBuilding building, Vehicle vehicle){
        return building.allocate(vehicle);
    }
}
