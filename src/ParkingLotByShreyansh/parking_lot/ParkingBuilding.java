package ParkingLotByShreyansh.parking_lot;

import ParkingLotByShreyansh.entity.ParkingSpot;
import ParkingLotByShreyansh.entity.Vehicle;
import ParkingLotByShreyansh.ticket.Ticket;

import java.util.List;

public class ParkingBuilding {
    private final List<ParkingLevel> levels;

    public ParkingBuilding(List<ParkingLevel> levels) {
        this.levels = levels;
    }

    Ticket allocate(Vehicle vehicle){
        for(ParkingLevel level: levels){


                ParkingSpot spot=level.park(vehicle.getVehicleType());

                if(spot!=null){
                    Ticket ticket=new Ticket(vehicle,level,spot);
                    System.out.println("Parking Allocated at level:"
                    + level.getLevelNumber()
                            +" spot: "+spot.getSpotId());
                    return ticket;
                }


        }

        throw new RuntimeException("Parking full");
    }

    void release(Ticket ticket){
        ticket.getParkingLevel().unPark(ticket.getVehicle().getVehicleType(), ticket.getSpot());
    }

}
