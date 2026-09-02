package ParkingLotByShreyansh.Pricing;

import ParkingLotByShreyansh.ticket.Ticket;

public class CostComputation {

    private final PricingStrategy pricingStrategy;

    public CostComputation(PricingStrategy pricingStrategy) {
        this.pricingStrategy = pricingStrategy;
    }

    public double compute(Ticket ticket){
        return pricingStrategy.calculate(ticket);
    }
}
