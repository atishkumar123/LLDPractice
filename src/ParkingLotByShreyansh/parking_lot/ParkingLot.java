package ParkingLotByShreyansh.parking_lot;

import ParkingLotByShreyansh.entity.Vehicle;
import ParkingLotByShreyansh.payment.Payment;
import ParkingLotByShreyansh.ticket.Ticket;

import java.util.Map;

public class ParkingLot {
    private final ParkingBuilding building;
    private final Map<Integer,EntranceGate> entranceGates;
    private final Map<Integer,ExitGate> exitGates;

    public ParkingLot(ParkingBuilding building, Map<Integer, EntranceGate> entranceGates, Map<Integer, ExitGate> exitGates) {
        this.building = building;
        this.entranceGates = entranceGates;
        this.exitGates = exitGates;

    }

    public Ticket vehicleArives(Integer gateid,Vehicle vehicle){

        EntranceGate entranceGate=entranceGates.get(gateid);
        if(entranceGate==null){
            throw new IllegalArgumentException(
                    "Invalid entrance gate: "+ gateid);
        }
        return entranceGate.enter(building,vehicle);

    }

    public void vehicleExit(Integer gateid,Ticket ticket,Payment payment){
        ExitGate exitGate = exitGates.get(gateid);
        if(exitGate==null){
            throw new IllegalArgumentException("Invalid exit gate"+ gateid);
        }

         exitGate.exit(building,ticket,payment);
    }

}