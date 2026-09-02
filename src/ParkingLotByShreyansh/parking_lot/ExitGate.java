package ParkingLotByShreyansh.parking_lot;

import ObserverDesignPattern.YoutubeNotification.Observer.Subscriber;
import ParkingLotByShreyansh.Pricing.CostComputation;
import ParkingLotByShreyansh.payment.Payment;
import ParkingLotByShreyansh.ticket.Ticket;

public class ExitGate {

    private final CostComputation costComputation;


    public ExitGate(CostComputation costComputation) {
        this.costComputation = costComputation;
    }

    void exit(ParkingBuilding building, Ticket ticket, Payment payment){


        double price =calculatePrice(ticket);

        boolean success=payment.pay(price);

        if(!success){
            throw  new RuntimeException("Payment Failed. Exit denied");
        }

        building.release(ticket);
        System.out.println("Exit successFul. Gate opened");



    }

    private double calculatePrice(Ticket ticket){
        return costComputation.compute(ticket);
    }
}
